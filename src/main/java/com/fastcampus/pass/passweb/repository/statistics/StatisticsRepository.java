package com.fastcampus.pass.passweb.repository.statistics;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface StatisticsRepository extends JpaRepository<StatisticsEntity, Integer> {


}