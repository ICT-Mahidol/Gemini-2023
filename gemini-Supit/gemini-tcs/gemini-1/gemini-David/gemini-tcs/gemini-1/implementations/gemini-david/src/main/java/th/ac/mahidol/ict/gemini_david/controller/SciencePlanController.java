package th.ac.mahidol.ict.gemini_david.controller;

import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import edu.gemini.app.ocs.OCS;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SciencePlanController {

    @GetMapping("/spDetail/{planNo}")
    public ModelAndView showSciencePlanDetails(@PathVariable int planNo) {
        OCS osc = new OCS();
        SciencePlan plan = osc.getSciencePlanByNo(planNo);
        ModelAndView view = new ModelAndView("sciencePlanDetail");
        view.addObject("sciencePlan", plan);
        return view;
    }
}

