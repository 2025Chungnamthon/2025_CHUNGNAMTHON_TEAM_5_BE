package com.chungnamthon.cheonon.domain.meeting.dto.response;

public record CancelJoinMeetingResponse(
        Long meetingId,
        Long cancelUserId
) {
}
