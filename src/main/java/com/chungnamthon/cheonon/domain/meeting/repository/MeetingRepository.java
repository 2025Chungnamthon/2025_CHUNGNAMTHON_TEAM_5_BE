package com.chungnamthon.cheonon.domain.meeting.repository;

import com.chungnamthon.cheonon.domain.meeting.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    List<Meeting> findTop3ByOrderByCreatedAtDesc();

    List<Meeting> findAllByOrderByCreatedAtDesc();
}
