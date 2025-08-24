package com.chungnamthon.cheonon.domain.map.repository;

import com.chungnamthon.cheonon.domain.map.entity.Affiliate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AffiliateRepository extends JpaRepository<Affiliate, Long> {
    List<Affiliate> findTop3ByOrderByCreatedAtDesc();
}
