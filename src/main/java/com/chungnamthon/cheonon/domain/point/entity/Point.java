package com.chungnamthon.cheonon.domain.point.entity;

import com.chungnamthon.cheonon.global.domain.BaseEntity;
import com.chungnamthon.cheonon.domain.point.entity.value.PaymentType;
import com.chungnamthon.cheonon.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "point")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Point extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type")
    private PaymentType paymentType;

    @Column(name = "change_point")
    private Integer changedPoint;

    @Column(name = "current_point")
    private Integer currentPoint;
}
