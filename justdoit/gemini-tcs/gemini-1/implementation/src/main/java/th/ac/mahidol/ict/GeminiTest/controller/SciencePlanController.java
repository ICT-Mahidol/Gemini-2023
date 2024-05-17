package th.ac.mahidol.ict.GeminiTest.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Map;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import th.ac.mahidol.ict.GeminiTest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.gemini.app.ocs.model.SciencePlan;
import th.ac.mahidol.ict.GeminiTest.model.Observer;
import th.ac.mahidol.ict.GeminiTest.repository.UserRepository;

@Controller
public class SciencePlanController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @GetMapping("scienceplans")
    public @ResponseBody
    ArrayList<SciencePlan> getAllSciencePlan(@RequestParam(value = "id") int id) {
        User user = (User) userRepository.findById(id).get();
        return user.getAllSciencePlan();
    }

    @CrossOrigin
    @GetMapping("getastronomicaldata")
    public @ResponseBody
        ArrayList<String> getAstronomicalData(@RequestParam(value = "id") int id, @RequestParam(value = "planNo") int planNo) {
        Observer observer = (Observer) userRepository.findById(id).get();

        ArrayList<BufferedImage> images = observer.getAstronomicalData(planNo);
        if (images == null){
            ArrayList<String> result = new ArrayList<String>();
            result.add("No astronomical data collected.");
            return result;
        }

        ArrayList<String> encodedImages = new ArrayList<>();
        for (BufferedImage image : images) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                ImageIO.write(image, "jpg", baos);
                String encodedImage = Base64.getEncoder().encodeToString(baos.toByteArray());
                encodedImages.add(encodedImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return encodedImages;
    }

}



