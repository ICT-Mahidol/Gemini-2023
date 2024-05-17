package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AstronomicalDataController {

    @GetMapping("/astronomicalData")
    public String showImages(Model model) {
        List<String> imageUrls = getImageUrlsFromFile("references/images.txt");
        model.addAttribute("imageUrls", imageUrls);
        return "astronomicalData";
    }

    private List<String> getImageUrlsFromFile(String filePath) {
        List<String> imageUrls = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                imageUrls.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageUrls;
    }
}
