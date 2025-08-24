package com.chungnamthon.cheonon.domain.meeting.dto.response;

import com.chungnamthon.cheonon.domain.meeting.entity.value.Location;
import com.chungnamthon.cheonon.domain.meeting.entity.value.Schedule;
import com.chungnamthon.cheonon.domain.meeting.entity.value.Status;

public record MeetingListResponse(
        Long meetingId,
        Status status,
        boolean isHost,
        String title,
        String description,
        Location location,
        Schedule schedule,
        String imageUrl
) {
}
