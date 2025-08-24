package com.chungnamthon.cheonon.domain.coupon.dto.response;

import java.time.LocalDate;

public record ExchangeCouponResponse(
        Long couponId,
        String title,
        Integer point,
        LocalDate expirationDate
) {
}
