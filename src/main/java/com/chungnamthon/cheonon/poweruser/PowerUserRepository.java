package com.chungnamthon.cheonon.poweruser;

import com.chungnamthon.cheonon.poweruser.domain.PowerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PowerUserRepository extends JpaRepository<PowerUser, Long> {
    List<PowerUser> findTop5ByWeekOfOrderByRankingAsc(LocalDate weekOf);
}