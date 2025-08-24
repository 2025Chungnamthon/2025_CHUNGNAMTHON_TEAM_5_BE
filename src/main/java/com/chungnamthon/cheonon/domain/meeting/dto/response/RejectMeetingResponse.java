package com.chungnamthon.cheonon.domain.meeting.dto.response;

public record RejectMeetingResponse(
        Long meetingId,
        Long rejectedUserId
) {
}
