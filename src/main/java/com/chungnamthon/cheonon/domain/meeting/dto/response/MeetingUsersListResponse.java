package com.chungnamthon.cheonon.domain.meeting.dto.response;

import com.chungnamthon.cheonon.domain.meeting.entity.value.Status;

public record MeetingUsersListResponse(
        Long userId,
        String userNickName,
        String userImageUrl,
        Status status
) {
}
