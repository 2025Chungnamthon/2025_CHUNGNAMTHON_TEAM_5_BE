package com.chungnamthon.cheonon.domain.auth.repository;

import com.chungnamthon.cheonon.domain.auth.entity.RefreshToken;
import com.chungnamthon.cheonon.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);

    List<RefreshToken> findByUser_Id(Long userId);

    Optional<RefreshToken> findTopByUserIdOrderByExpiredAtDesc(Long userId);

    void deleteAllByUser_Id(Long userId);

    Optional<RefreshToken> findByUser(User user);
}