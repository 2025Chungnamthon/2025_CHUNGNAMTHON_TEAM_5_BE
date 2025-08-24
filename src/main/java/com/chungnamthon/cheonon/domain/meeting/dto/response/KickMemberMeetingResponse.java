package com.chungnamthon.cheonon.domain.meeting.dto.response;

public record KickMemberMeetingResponse(
        Long meetingId,
        Long kickedUserId
) {
}
