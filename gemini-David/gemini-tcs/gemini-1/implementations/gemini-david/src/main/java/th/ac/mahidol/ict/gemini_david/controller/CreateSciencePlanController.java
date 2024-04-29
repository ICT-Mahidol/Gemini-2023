package th.ac.mahidol.ict.gemini_david.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CreateSciencePlanController {

    // Handler method to show the form for creating a new science plan
    @GetMapping("/create-plan")
    public String showCreatePlanForm() {
        return "createSciencePlan";
    }

    // Handler method to process the form submission and create the science plan
    @PostMapping("/createSciencePlan")
    public ModelAndView createSciencePlan(
            @RequestParam("creatorName") String creatorName,
            @RequestParam("submitterName") String submitterName,
            @RequestParam(value = "fundingInUSD") double fundInUSD,
            @RequestParam("objectives") String objectives,
            @RequestParam("starSystem") String starSystemName,
            @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate,
            @RequestParam("telescopeLocation") String telescopeLocationName,
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
            @RequestParam("hue") double hue) throws ParseException {
        // process the submitted data and create the science plan
        DataProcRequirement dpr = new DataProcRequirement(fileType,fileQuality,colorType,contrast,brightness,saturation,highlights,exposure,shadows,whites,blacks,luminance,hue);
        StarSystem.CONSTELLATIONS starSystem = StarSystem.CONSTELLATIONS.valueOf(starSystemName);
        SciencePlan.TELESCOPELOC telescopeloc = SciencePlan.TELESCOPELOC.valueOf(telescopeLocationName);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date start = format.parse(startDate);
        Date end = format.parse(endDate);
        OCS ocs = new OCS();
        SciencePlan sp = new SciencePlan(creatorName,submitterName,fundInUSD,objectives,starSystem, start, end,telescopeloc,dpr);
        String creationOutput = ocs.createSciencePlan(sp);

        ModelAndView modelAndView = new ModelAndView("createSciencePlan");
        modelAndView.addObject("response", creationOutput);
        return modelAndView;
    }
}

