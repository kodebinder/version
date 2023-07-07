package com.company.client;

import com.company.constant.ProductConstants;
import com.company.dto.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = ProductConstants.API_GATEWAY_SERVICE)
@Component
public interface CouponClient {

    @GetMapping("api/v1/coupons/coupon/{code}")
    Coupon getCoupon(@PathVariable("code") String code);
}
