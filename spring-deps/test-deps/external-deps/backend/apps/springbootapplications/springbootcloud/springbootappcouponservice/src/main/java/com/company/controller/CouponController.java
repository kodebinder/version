package com.company.controller;

import com.company.entity.Coupon;
import com.company.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/coupons")
@Slf4j
public class CouponController {

    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @PostMapping("/coupon")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }

    @GetMapping("/coupon/{couponCode}")
    public Coupon getCoupon(@PathVariable("couponCode") String couponCode) {
        return couponService.getCoupon(couponCode);
    }
}
