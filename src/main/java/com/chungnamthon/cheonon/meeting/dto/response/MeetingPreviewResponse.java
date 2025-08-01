package com.chungnamthon.cheonon.meeting.dto.response;

import com.chungnamthon.cheonon.meeting.domain.Meeting;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MeetingPreviewResponse {

    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private String location; // Enum을 문자열로
    private String schedule;

    public static MeetingPreviewResponse from(Meeting meeting) {
        return MeetingPreviewResponse.builder()
                .id(meeting.getId())
                .title(meeting.getTitle())
                .description(meeting.getDescription())
                .imageUrl(meeting.getImageUrl())
                .location(meeting.getLocation().name())
                .schedule(meeting.getSchedule().name())
                .build();
    }
}