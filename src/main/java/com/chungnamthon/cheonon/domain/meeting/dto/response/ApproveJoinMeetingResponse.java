package com.chungnamthon.cheonon.domain.meeting.dto.response;

public record ApproveJoinMeetingResponse(
        Long meetingId,
        Long approvedUserId
) {
}
