package com.chungnamthon.cheonon.domain.poweruser;

import com.chungnamthon.cheonon.domain.poweruser.entity.PowerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PowerUserRepository extends JpaRepository<PowerUser, Long> {
    List<PowerUser> findTop5ByWeekOfOrderByRankingAsc(LocalDate weekOf);
}