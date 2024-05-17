package com.example.demo.Controller;

import com.example.demo.Model.ObservingProgram;
import com.example.demo.Model.SciencePlan;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.ObservingProgramConfigs;
import edu.gemini.app.ocs.model.TelePositionPair;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ObservingProgramController {

    @GetMapping("/observingProgram")
    public String showObservingProgram() {
        return "observingProgram";
    }

    @PostMapping("/observingProgram/add")
    public String addObservingProgram(@RequestParam("sciencePlanData") String sciencePlanData,
                                      @RequestParam String opticsPrimary,
                                      @RequestParam double fStop,
                                      @RequestParam double opticsSecondaryRMS,
                                      @RequestParam double scienceFoldMirrorDegree,
                                      @RequestParam ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType,
                                      @RequestParam int moduleContent,
                                      @RequestParam ObservingProgramConfigs.CalibrationUnit calibrationUnit,
                                      @RequestParam ObservingProgramConfigs.LightType lightType,
                                      @RequestParam double direction,
                                      @RequestParam double degree) {

//        System.out.println("Science Plan Data: " + sciencePlanData);

        if (sciencePlanData == null || sciencePlanData.isEmpty()) {
            // Handle empty input
            return "redirect:/observingProgram/unsuccessfully_created?error=EmptySciencePlanData";
        }

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            SciencePlan sciencePlan = objectMapper.readValue(sciencePlanData, SciencePlan.class);

            TelePositionPair[] tprArray = new TelePositionPair[]{new TelePositionPair(direction, degree)};

            ObservingProgram observingProgram = new ObservingProgram();
            observingProgram.setPlanNo(sciencePlan.getPlanNo());

            edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC spTelescopeLocation = sciencePlan.getTelescopeLocation();
            String shortTelescopeLocation = String.valueOf(spTelescopeLocation) == "HAWAII" ? "N" : "S";

            observingProgram.setGeminiLocation(shortTelescopeLocation);
            observingProgram.setOpticsPrimary(opticsPrimary);
            observingProgram.setFStop(fStop);
            observingProgram.setOpticsSecondaryRMS(opticsSecondaryRMS);
            observingProgram.setScienceFoldMirrorDegree(scienceFoldMirrorDegree);
            observingProgram.setScienceFoldMirrorType(scienceFoldMirrorType);
            observingProgram.setModuleContent(moduleContent);
            observingProgram.setCalibrationUnit(calibrationUnit);
            observingProgram.setLightType(lightType);
            observingProgram.setTelePositionPair(tprArray);

            ObservingProgram validatedObservingProgram = observingProgram.validateObservingCondition(observingProgram);
            if (!validatedObservingProgram.getValidationStatus()) {
                return "redirect:/observingProgram/unsuccessfully_created";
            }

            OCS ocs = new OCS();
            edu.gemini.app.ocs.model.SciencePlan ocsSP = ocs.getSciencePlanByNo(sciencePlan.getPlanNo());
            edu.gemini.app.ocs.model.ObservingProgram ocsOP = ocs.createObservingProgram(ocsSP, opticsPrimary, fStop,
                    opticsSecondaryRMS, scienceFoldMirrorDegree, scienceFoldMirrorType, moduleContent, calibrationUnit,
                    lightType, tprArray);
            edu.gemini.app.ocs.model.ObservingProgram validateOP = ocsOP.validateObservingCondition(ocsOP);

            if (ocs.saveObservingProgram(validateOP)) {
                System.out.println("Saved ObservingProgram");
            } else {
                System.out.println("Save ObservingProgram failed");
            }

        } catch (Exception error) {
            error.printStackTrace();
            return "redirect:/observingProgram/unsuccessfully_created?error=" + error.getMessage();
        }

        return "redirect:/observingProgram/successfully_created";
    }

    @GetMapping("/observingProgram/successfully_created")
    public @ResponseBody String showSuccessPage() {
        return "Observing program created successfully.";
    }

    @GetMapping("/observingProgram/unsuccessfully_created")
    public @ResponseBody String showFailurePage() {
        return "Observing program could not be created successfully.";
    }

}
