package com.chungnamthon.cheonon.map.domain;

import com.chungnamthon.cheonon.global.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "affiliate_store")
@Getter
@Setter
public class Affiliate extends BaseEntity {

    @Column(name = "merchant_seq")
    private BigDecimal merchantSeq;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "tel")
    private String tel;

    @Column(name = "category")
    private String category;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "image_url")
    private String imageUrl;
}
