package com.chungnamthon.cheonon.domain.map.dto;

import com.chungnamthon.cheonon.domain.map.entity.Affiliate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AffiliatePreviewResponse {
    private String name;
    private String address;
    private String tel;
    private String imageUrl;

    public static AffiliatePreviewResponse from(Affiliate a) {
        return AffiliatePreviewResponse.builder()
                .name(a.getName())
                .address(a.getAddress())
                .tel(a.getTel())
                .imageUrl(a.getImageUrl())
                .build();
    }
}
