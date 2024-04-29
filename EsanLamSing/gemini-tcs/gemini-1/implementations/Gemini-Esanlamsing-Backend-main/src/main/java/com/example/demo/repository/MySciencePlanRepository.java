package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MySciencePlan;

public interface MySciencePlanRepository extends JpaRepository<MySciencePlan, Long>{
}
