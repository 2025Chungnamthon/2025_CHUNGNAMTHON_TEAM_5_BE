package com.chungnamthon.cheonon.domain.map.dto;

import com.chungnamthon.cheonon.domain.map.entity.Affiliate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AffiliateHomePreviewResponse {
    private String name;
    private String imageUrl;

    public static AffiliateHomePreviewResponse from(Affiliate a) {
        return AffiliateHomePreviewResponse.builder()
                .name(a.getName())
                .imageUrl(a.getImageUrl())
                .build();
    }
}
