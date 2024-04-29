package com.example.Gemini3.repository;

import com.example.Gemini3.model.SciencePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SciencePlanRepository extends JpaRepository<SciencePlan, Long> {
    // You can add custom database queries if needed.
}
