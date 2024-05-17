package com.example.implementations.SciencePlan;

import com.example.implementations.models.ApiResponse;
import com.example.implementations.ocs.OCSController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/science-plans")
public class SciencePlanController {

    private OCSController ocs = new OCSController();

    @PostMapping("/create")
    public ResponseEntity<?> createSciencePlan(@RequestBody edu.gemini.app.ocs.model.SciencePlan sp) {
        try {
            String result = this.ocs.createSciencePlan(sp);
            ApiResponse<String> response = new ApiResponse<>(200, result);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @GetMapping("/get")
    @ResponseBody
    public ResponseEntity<?> getAllSciencePlan() {
        try {
            List<edu.gemini.app.ocs.model.SciencePlan> sciencePlans = this.ocs.getAllSciencePlans();
            ApiResponse<List<edu.gemini.app.ocs.model.SciencePlan>> response = new ApiResponse<>(200, sciencePlans);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
    @GetMapping("/get/{id}")
    @ResponseBody
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        try {
            int planId = id;
            edu.gemini.app.ocs.model.SciencePlan sciencePlan = this.ocs.getSciencePlanByPlanNo(planId);
            ApiResponse<?> response = new ApiResponse<>(200, sciencePlan);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ApiResponse<List<SciencePlan>> errorResponse = new ApiResponse<>(500, null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @PostMapping("/test")
    @ResponseBody
    public ResponseEntity<?> testSciencePlan(@RequestBody edu.gemini.app.ocs.model.SciencePlan sp) {
        try {
            String result = this.ocs.testSciencePlan(sp);
            ApiResponse<String> response = new ApiResponse<>(200, result);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }


}
