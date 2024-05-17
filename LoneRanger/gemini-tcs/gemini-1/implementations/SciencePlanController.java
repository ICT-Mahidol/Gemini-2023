package com.example.Gemini3.controller;

import com.example.Gemini3.model.SciencePlan;
import com.example.Gemini3.service.SciencePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/science-plans") // This will be the base URI for all requests handled by this controller.
public class SciencePlanController {

    private final SciencePlanService sciencePlanService;

    @Autowired
    public SciencePlanController(SciencePlanService sciencePlanService) {
        this.sciencePlanService = sciencePlanService;
    }

    @PostMapping("/submit")
    public String submitSciencePlan(@ModelAttribute SciencePlan sciencePlan, Model model) {
        try {
            sciencePlanService.submitPlan(sciencePlan);
            return "success"; // success.html view name
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error"; // error.html view name
        }
    }
}




