package com.example.demo.Controllers;

import com.example.demo.Repositories.SciencePlanRepository;
import com.example.demo.Repositories.UserRepository;
import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;


@Controller
public class SciencePlanController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SciencePlanRepository sciencePlanRepository;

    OCS ocs = new OCS();

    @GetMapping("/api/science-plans")
    public @ResponseBody List<SciencePlan> getAllSciencePlans() {
        System.out.println(ocs.getAllSciencePlans());
        return ocs.getAllSciencePlans();
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        return "home";
    }

    @CrossOrigin
    @GetMapping("/create")
    public String redirectToCreatePage(Model model) {
        return "create";
    }

    @CrossOrigin
    @PostMapping("/createSciencePlan")
    public String createSciencePlan(@RequestParam String submitter,
                                    @RequestParam double fundingInUSD,
                                    @RequestParam String objectives,
                                    @RequestParam StarSystem.CONSTELLATIONS starSystem,
                                    @RequestParam LocalDateTime startDate,
                                    @RequestParam LocalDateTime endDate,
                                    @RequestParam SciencePlan.TELESCOPELOC telescopeLocation,
                                    @RequestParam String fileType,
                                    @RequestParam String fileQuality,
                                    @RequestParam String colorType,
                                    @RequestParam double contrast,
                                    @RequestParam double brightness,
                                    @RequestParam double saturation,
                                    @RequestParam double highlights,
                                    @RequestParam double exposure,
                                    @RequestParam double shadows,
                                    @RequestParam double whites,
                                    @RequestParam double blacks,
                                    @RequestParam double luminance,
                                    @RequestParam double hue,
                                    @RequestParam String creator)
    {

        try {
            com.example.demo.Models.SciencePlan sp = new com.example.demo.Models.SciencePlan();
            sp.setCreator( creator);
            sp.setSubmitter(submitter);
            sp.setFundingInUSD(fundingInUSD);
            sp.setObjectives(objectives);
            sp.setStarSystem(starSystem);
            sp.setStartDate(startDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            sp.setEndDate(endDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            sp.setTelescopeLocation(telescopeLocation);

            com.example.demo.Models.DataProcRequirement dpr = new com.example.demo.Models.DataProcRequirement();
            dpr.setFileType(fileType);
            dpr.setFileQuality(fileQuality);
            dpr.setColorType(colorType);
            dpr.setContrast(contrast);
            dpr.setBrightness(brightness);
            dpr.setSaturation(saturation);
            dpr.setHighlights(highlights);
            dpr.setExposure(exposure);
            dpr.setShadows(shadows);
            dpr.setWhites(whites);
            dpr.setBlacks(blacks);
            dpr.setLuminance(luminance);
            dpr.setHue(hue);

            sp.setDataProcRequirements(dpr);

            SciencePlan ocsSciencePlan = new SciencePlan(); //from ocs
            ocsSciencePlan.setCreator(sp.getCreator());
            ocsSciencePlan.setSubmitter(sp.getSubmitter());
            ocsSciencePlan.setFundingInUSD(sp.getFundingInUSD());
            ocsSciencePlan.setObjectives(sp.getObjectives());
            ocsSciencePlan.setStarSystem(sp.getStarSystem());
            ocsSciencePlan.setStartDate(sp.getStartDate());
            ocsSciencePlan.setEndDate(sp.getEndDate());
            ocsSciencePlan.setTelescopeLocation(sp.getTelescopeLocation());

            DataProcRequirement ocsDataProcRequirement = new DataProcRequirement(); //from ocs
            ocsDataProcRequirement.setFileType(dpr.getFileType());
            ocsDataProcRequirement.setFileQuality(dpr.getFileQuality());
            ocsDataProcRequirement.setColorType(dpr.getColorType());
            ocsDataProcRequirement.setContrast(dpr.getContrast());
            ocsDataProcRequirement.setBrightness(dpr.getBrightness());
            ocsDataProcRequirement.setSaturation(dpr.getSaturation());
            ocsDataProcRequirement.setHighlights(dpr.getHighlights());
            ocsDataProcRequirement.setExposure(dpr.getExposure());
            ocsDataProcRequirement.setShadows(dpr.getShadows());
            ocsDataProcRequirement.setWhites(dpr.getWhites());
            ocsDataProcRequirement.setBlacks(dpr.getBlacks());
            ocsDataProcRequirement.setLuminance(dpr.getLuminance());
            ocsDataProcRequirement.setHue(dpr.getHue());

            ocsSciencePlan.setDataProcRequirements(ocsDataProcRequirement);

            ocs.createSciencePlan(ocsSciencePlan);
            System.out.println(ocs.getAllSciencePlans());
            sciencePlanRepository.save(sp);

        } catch (Exception error) {
            System.out.println("error: " + error.getMessage());
            return "redirect:/create";
        }

        return "redirect:/home";
    }

    @PostMapping("test/{planNo}")
    public @ResponseBody String testSciencePlan(@PathVariable(value = "planNo") int planNo) {
        SciencePlan scTest = ocs.getSciencePlanByNo(planNo);
        System.out.println("Selected SciencePlan to test: " + scTest.toString());
        String testResult = ocs.testSciencePlan(scTest);
        System.out.printf(testResult);
        return testResult;
    }

    @PostMapping("submit/{planNo}")
    public @ResponseBody String submitSciencePlan(@PathVariable(value = "planNo") int planNo, @RequestBody Map<String, Object> payload) {
        SciencePlan scSubmit = ocs.getSciencePlanByNo(planNo);
        String submitterName = (String) payload.get("submitter");
        System.out.println("Submitter name: " + submitterName);
        scSubmit.setSubmitter(submitterName);
        System.out.println("Submitting Science Plan for: " + scSubmit.toString());
        String submitResult = ocs.submitSciencePlan(scSubmit);
        System.out.println(submitResult);
        return submitResult;
    }

}
