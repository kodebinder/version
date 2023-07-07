package com.company.service;

import com.company.entity.Coupon;
import com.company.repository.CouponRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CouponService {

    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public Coupon getCoupon(String couponCode){
        return couponRepository.findByCode(couponCode);
    }
}
