package com.company.controller;

import com.company.client.CouponClient;
import com.company.constant.ProductConstants;
import com.company.dto.Coupon;
import com.company.entity.Product;
import com.company.service.ProductService;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/v1/products")
@Slf4j
public class ProductController {

    private final CouponClient couponClient;
    private final ProductService productService;


    public ProductController(final CouponClient couponClient,
                             final ProductService productService) {
        this.productService = productService;
        this.couponClient = couponClient;
    }

    @PostMapping("/product")
    @Retry(name = ProductConstants.PRODUCT_SERVICE, fallbackMethod = "handleCreateProductError")
    public Product createProduct(@RequestBody Product product) {
        Coupon coupon = couponClient.getCoupon(product.getCouponCode());
        BigDecimal discount = product.getPrice().multiply(coupon.getDiscount()).divide(BigDecimal.valueOf(100));
        product.setPrice(product.getPrice().subtract(discount));
        return productService.createProduct(product);
    }

    public Product handleCreateProductError(Product product, Exception exception) {
        log.error("Inside handleCreateProductError");
        return product;
    }
}
