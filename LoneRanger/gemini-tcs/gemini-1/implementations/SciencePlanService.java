package com.example.Gemini3.service;

import com.example.Gemini3.model.SciencePlan;
import com.example.Gemini3.repository.SciencePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class SciencePlanService {

    private final SciencePlanRepository sciencePlanRepository;

    @Autowired
    public SciencePlanService(SciencePlanRepository sciencePlanRepository) {
        this.sciencePlanRepository = sciencePlanRepository;
    }

    // The method to handle the actual submission of the science plan
    @Transactional
    public void submitPlan(SciencePlan plan) {
        // Save the science plan to the database
        sciencePlanRepository.save(plan);
    }
}


