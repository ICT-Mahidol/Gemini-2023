package th.ac.mahidol.ict.crystal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import th.ac.mahidol.ict.crystal.service.ServiceData;

@Controller
public class MainController {

    OCS ocs = new OCS(true);

    @Autowired
    ServiceData serviceData;

    // This method maps the root URL path to the "index" template.
    @GetMapping("/")
    public String index() {
        return "redirect:/scienceplan";
    }

    // This method maps the URL path "/scienceplan" to the "scienceplan" template and retrieves science plans.
    @GetMapping("/scienceplan")
     public String sciencePlans(ModelMap model){
        // Check if user is logged in, if not redirect to login page.
        if (!serviceData.getLogin()) {
            return "redirect:/login";
        }
        // Get the role of the logged in user.
        String role = serviceData.getUser().getRole();
        // Check if the user is an astronomer and add attribute to model.
        if(role.equals("Astronomer") ){
            model.addAttribute("role" , true);
        }else{
            model.addAttribute("role" , false);
        }
        // Retrieve all science plans from the OCS service and add attribute to model.
        
        ArrayList<SciencePlan> sciencePlans = SciencePlanRepository.getAllSciencePlans();
        System.out.println("Number of plans: " + SciencePlanRepository.getAllSciencePlans().size());
        model.addAttribute("sciencePlans" , sciencePlans);
        return "scienceplan";
     }

}
