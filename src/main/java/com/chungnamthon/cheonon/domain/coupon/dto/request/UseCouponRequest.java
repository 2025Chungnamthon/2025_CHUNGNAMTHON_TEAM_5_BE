package com.chungnamthon.cheonon.domain.coupon.dto.request;

public record UseCouponRequest(
        Long couponId,
        Long confirmCode
) {
}
