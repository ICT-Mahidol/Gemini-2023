package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }

}
