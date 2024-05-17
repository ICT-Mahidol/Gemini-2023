package th.ac.mahidol.ict.Gemini.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.StarSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import th.ac.mahidol.ict.Gemini.repository.SciPlanRepository;

import java.text.ParseException;
import java.util.Date;

@Controller
public class SciPlanController {
    @Autowired
    private SciPlanRepository sciPlanRepository;

    @GetMapping("/plan")
    public String showPlanPage(){
        return "sciplan";
    }

    @PostMapping("/plan")
    public String createPlan(
            @RequestParam("creator") String creator,
            @RequestParam("submitter") String submitter,
            @RequestParam(value = "fundingInUSD") double fundInUSD,
            @RequestParam("objectives") String objectives,
            @RequestParam("starSystem") String starSystem,
            @RequestParam("startDate") Date startDate,
            @RequestParam("endDate") Date endDate,
            @RequestParam("telescopeLocation") String telescopeLocation,
            @RequestParam("fileType") String fileType,
            @RequestParam("fileQuality") String fileQuality,
            @RequestParam("colorType") String colorType,
            @RequestParam("contrast") double contrast,
            @RequestParam("brightness") double brightness,
            @RequestParam("saturation") double saturation,
            @RequestParam("highlights") double highlights,
            @RequestParam("exposure") double exposure,
            @RequestParam("shadows") double shadows,
            @RequestParam("whites") double whites,
            @RequestParam("blacks") double blacks,
            @RequestParam("luminance") double luminance,
            @RequestParam("hue") double hue)
            throws ParseException {
        OCS ocs = new OCS();
        DataProcRequirement dpr = new DataProcRequirement(fileType,fileQuality,colorType,
                contrast,brightness,saturation,highlights,exposure,shadows,whites,blacks,
                luminance,hue);
        StarSystem.CONSTELLATIONS star = StarSystem.CONSTELLATIONS.valueOf(starSystem);
        SciencePlan.TELESCOPELOC locat = SciencePlan.TELESCOPELOC.valueOf(telescopeLocation);
        SciencePlan sp = new SciencePlan(creator,submitter,fundInUSD,objectives,star,
                startDate,endDate,locat,dpr);
        String output = ocs.createSciencePlan(sp);

        ModelAndView model = new ModelAndView("sciplan");
        model.addObject("response", output);
        return model.getViewName();
    }
}