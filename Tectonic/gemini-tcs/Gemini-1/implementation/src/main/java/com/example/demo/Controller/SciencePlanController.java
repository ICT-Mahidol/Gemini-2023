package com.example.demo.Controller;

import com.example.demo.Repository.SciencePlanRepository;

import com.example.demo.Model.SciencePlan;
import com.example.demo.Model.DataProcRequirement;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.StarSystem.CONSTELLATIONS;
import edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class SciencePlanController {

    @Autowired
    SciencePlanRepository sciencePlanRepository;

    @GetMapping("/sciencePlan")
    public String showSciencePlan() {
        return "sciencePlan";
    }

    @PostMapping("/sciencePlan/add")
    public String addSciencePlan(@RequestParam String creator,
                                 @RequestParam(defaultValue = "") String submitter,
                                 @RequestParam double fundingInUSD, @RequestParam String objectives,
                                 @RequestParam CONSTELLATIONS starSystem, @RequestParam LocalDateTime startDate,
                                 @RequestParam LocalDateTime endDate, @RequestParam TELESCOPELOC telescopeLocation,
                                 @RequestParam String fileType, @RequestParam String fileQuality,
                                 @RequestParam String colorType,
                                 @RequestParam(defaultValue = "0") double contrast,
                                 @RequestParam(defaultValue = "0") double brightness,
                                 @RequestParam(defaultValue = "0") double saturation,
                                 @RequestParam(defaultValue = "0") double highlights,
                                 @RequestParam(defaultValue = "0") double exposure,
                                 @RequestParam(defaultValue = "0") double shadows,
                                 @RequestParam(defaultValue = "0") double whites,
                                 @RequestParam(defaultValue = "0") double blacks,
                                 @RequestParam(defaultValue = "0") double luminance,
                                 @RequestParam(defaultValue = "0") double hue) {

        try {
            SciencePlan sp = new SciencePlan();
            sp.setCreator(creator);
            sp.setSubmitter(submitter);
            sp.setFundingInUSD(fundingInUSD);
            sp.setObjectives(objectives);
            sp.setStarSystem(starSystem);
            sp.setStartDate(startDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            sp.setEndDate(endDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            sp.setTelescopeLocation(telescopeLocation);

            DataProcRequirement dpr = new DataProcRequirement();
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
            sciencePlanRepository.save(sp);

            edu.gemini.app.ocs.model.SciencePlan ocsSp = createOCSSciencePlan(sp);
            edu.gemini.app.ocs.model.DataProcRequirement ocsDpr = createOCSDataProcRequirement(dpr);
            ocsSp.setDataProcRequirements(ocsDpr);

            OCS ocs = new OCS();
            ocs.createSciencePlan(ocsSp);
//            System.out.println(ocs.getAllSciencePlans());

        } catch (Exception error) {
            error.printStackTrace();
        }

        return "redirect:/sciencePlan/created"; // Redirect to a success page
    }

    public edu.gemini.app.ocs.model.SciencePlan createOCSSciencePlan(SciencePlan sciencePlan) {
        edu.gemini.app.ocs.model.SciencePlan sp = new edu.gemini.app.ocs.model.SciencePlan();
        sp.setPlanNo(sciencePlan.getPlanNo());
        sp.setCreator(sciencePlan.getCreator());
        sp.setSubmitter(sciencePlan.getSubmitter());
        sp.setFundingInUSD(sciencePlan.getFundingInUSD());
        sp.setObjectives(sciencePlan.getObjectives());
        sp.setStarSystem(sciencePlan.getStarSystem());
        sp.setStartDate(sciencePlan.getStartDate());
        sp.setEndDate(sciencePlan.getEndDate());
        sp.setTelescopeLocation(sciencePlan.getTelescopeLocation());

        return sp;
    }

    public edu.gemini.app.ocs.model.DataProcRequirement createOCSDataProcRequirement(DataProcRequirement dataProcRequirement) {
        edu.gemini.app.ocs.model.DataProcRequirement dpr = new edu.gemini.app.ocs.model.DataProcRequirement();
        dpr.setFileType(dataProcRequirement.getFileType());
        dpr.setFileQuality(dataProcRequirement.getFileQuality());
        dpr.setColorType(dataProcRequirement.getColorType());
        dpr.setContrast(dataProcRequirement.getContrast());
        dpr.setBrightness(dataProcRequirement.getBrightness());
        dpr.setSaturation(dataProcRequirement.getSaturation());
        dpr.setHighlights(dataProcRequirement.getHighlights());
        dpr.setExposure(dataProcRequirement.getExposure());
        dpr.setShadows(dataProcRequirement.getShadows());
        dpr.setWhites(dataProcRequirement.getWhites());
        dpr.setBlacks(dataProcRequirement.getBlacks());
        dpr.setLuminance(dataProcRequirement.getLuminance());
        dpr.setHue(dataProcRequirement.getHue());

        return dpr;
    }

    @GetMapping("/sciencePlan/created")
    public @ResponseBody String showSuccessPage() {
        return "Science plan created successfully.";
    }

    @GetMapping("/sciencePlan/all")
    public @ResponseBody Iterable<SciencePlan> getAllSciencePlans() {
//        OCS ocs = new OCS();
//        return ocs.getAllSciencePlans();
        return sciencePlanRepository.findAll();
    }

    @GetMapping("/sciencePlan/deleteAll")
    public @ResponseBody String deleteAllSciencePlans() {

        OCS ocs = new OCS();
        ocs.deleteAllSciencePlans();
        sciencePlanRepository.deleteAll();

        return "All science plans deleted successfully.";
    }

}
