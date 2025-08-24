package com.chungnamthon.cheonon.domain.point.dto.response;

import com.chungnamthon.cheonon.domain.point.entity.value.PaymentType;

import java.time.LocalDateTime;

public record PointHistoryResponse(
        Long pointId,
        PaymentType paymentType,
        Integer changedPoint,
        LocalDateTime usedAt
) {
}
