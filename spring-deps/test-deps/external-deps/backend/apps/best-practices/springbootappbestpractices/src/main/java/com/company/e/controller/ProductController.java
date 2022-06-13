package com.company.e.controller;

import com.company.e.model.Product;
import com.company.e.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/")
    @Transactional(readOnly = true)
    @Cacheable("product-cache")
    public List<Product> getProducts() {
        log.info("Finding all product");
        List<Product> products = productRepository.findAll();
        return products;
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") long id) {
        log.info("Finding product by Id : {}", id);
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        }
        return null;
    }

    @PostMapping("/products/")
    public Product createProduct(@RequestBody Product product) {
        log.info("Creating new Product");
        return productRepository.save(product);
    }

    @PutMapping("/products/")
    public Product updateProduct(@RequestBody Product product) {
        log.info("Updating product with ID : {}", product.getId());
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    @CacheEvict("product-cache")
    public void deleteProduct(@PathVariable("id") long id) {
        log.info("Deleting product with ID : {}", id);
        productRepository.deleteById(id);
    }

}
