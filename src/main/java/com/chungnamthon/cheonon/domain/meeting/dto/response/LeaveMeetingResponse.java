package com.chungnamthon.cheonon.domain.meeting.dto.response;

public record LeaveMeetingResponse(
        Long meetingId,
        Long leftUserId
) {
}
