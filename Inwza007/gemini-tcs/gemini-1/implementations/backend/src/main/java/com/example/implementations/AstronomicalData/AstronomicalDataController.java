package com.example.implementations.AstronomicalData;
import com.example.implementations.SciencePlan.SciencePlan;
import com.example.implementations.models.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/astro-data")
public class AstronomicalDataController {
    @GetMapping("/manage")
    @ResponseBody
    public ResponseEntity<?> manageAstroData() {
        try {
            AstronomicalData a = new AstronomicalData();
            ApiResponse<List<?>> response = new ApiResponse<>(200, a.getAstronomicalDataLinks());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ApiResponse<List<SciencePlan>> errorResponse = new ApiResponse<>(500, null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}
