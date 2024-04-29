package th.ac.mahidol.ict.gemini_david.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HomeController {

    OCS ocs = new OCS();

    @GetMapping("/home")
    public ModelAndView homePage() {
        ArrayList<SciencePlan> sciencePlans = ocs.getAllSciencePlans();
        // Add the list of science plans to the model
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("sciencePlans", sciencePlans);

        // Return the name of the Thymeleaf template to render
        return modelAndView;
    }
}

