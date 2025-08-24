package com.chungnamthon.cheonon.domain.home.dto;

import com.chungnamthon.cheonon.domain.meeting.dto.response.MeetingPreviewResponse;
import com.chungnamthon.cheonon.domain.map.dto.AffiliateHomePreviewResponse;
import com.chungnamthon.cheonon.domain.poweruser.dto.PowerUserResponse;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class HomeResponse {

    private List<MeetingPreviewResponse> recentMeetings;
    private List<AffiliateHomePreviewResponse> topAffiliates;
    private List<PowerUserResponse> powerUsers;
    private Long currentPoint; // 로그인 시에만 반환, 아니면 null
}