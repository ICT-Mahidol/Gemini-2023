package echo.gemini.backend.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.*;
import echo.gemini.backend.model.*;
import echo.gemini.backend.model.Observer;
import echo.gemini.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ObservingProgramController {
    OCS ocs = new OCS();
    @Autowired
    private ObservingProgramRepository observingProgramRepository;

    @Autowired
    private TelePositionPairRepository telePositionPairRepository;

    @Autowired
    private SciencePlanRepository sciencePlanRepository;

    @Autowired
    private ObserverRepository observerRepository;

    // Return all observing programs in Echo db
    @CrossOrigin
    @GetMapping("/observingprograms")
    public @ResponseBody
    Iterable<ObservingProgramEcho> getAllObservingPrograms() {
        return observingProgramRepository.findAll();
    }

    // Create observing program in Echo db and OCS
    @CrossOrigin
    @PostMapping("/create-observingprogram")
    @ResponseBody
    public ObservingProgram createObservingProgram(@RequestBody Map<String, Object> body) {
        ObservingProgramEcho observingProgramEcho = new ObservingProgramEcho();
        observingProgramEcho = setObservingprogram(observingProgramEcho, body);
        observingProgramRepository.save(observingProgramEcho);

        // setting ocs observing program
        TelePositionPair telePositionPairOCS = new TelePositionPair(observingProgramEcho.getTelePositionPairs().getDirection(), observingProgramEcho.getTelePositionPairs().getDegree());
        TelePositionPair[] telePositionPairOCSList = new TelePositionPair[]{telePositionPairOCS};

        SciencePlan sciencePlanOCS = ocs.getSciencePlanByNo(observingProgramEcho.getSciencePlan().getPlanNo());
        System.out.println("Sci Plan in OCS"+ocs.getSciencePlanByNo(observingProgramEcho.getSciencePlan().getPlanNo()));
        String opticsPrimary = observingProgramEcho.getOpticsPrimary();
        double fStop = observingProgramEcho.getfStop();
        double opticsSecondaryRMS = observingProgramEcho.getOpticsSecondaryRMS();
        double scienceFoldMirrorDegree = observingProgramEcho.getScienceFoldMirrorDegree();

        edu.gemini.app.ocs.model.ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType = edu.gemini.app.ocs.model.ObservingProgramConfigs.FoldMirrorType.valueOf(observingProgramEcho.getScienceFoldMirrorType().toString());

        int moduleContent = observingProgramEcho.getModuleContent();

        edu.gemini.app.ocs.model.ObservingProgramConfigs.CalibrationUnit calibrationUnit = edu.gemini.app.ocs.model.ObservingProgramConfigs.CalibrationUnit.valueOf(observingProgramEcho.getCalibrationUnit().toString());
        edu.gemini.app.ocs.model.ObservingProgramConfigs.LightType lightType = edu.gemini.app.ocs.model.ObservingProgramConfigs.LightType.valueOf(observingProgramEcho.getLightType().toString());
//        System.out.println("Info to create obs in OCS: "+opticsPrimary + " "+ fStop + " "+ opticsSecondaryRMS + " "
//                + scienceFoldMirrorDegree + " "+ scienceFoldMirrorType+ " "
//                + moduleContent+ " "+ calibrationUnit+ " "+ lightType);
        ObservingProgram ocsObservingProgram = ocs.createObservingProgram(sciencePlanOCS, opticsPrimary, fStop, opticsSecondaryRMS, scienceFoldMirrorDegree,
                scienceFoldMirrorType, moduleContent, calibrationUnit, lightType, telePositionPairOCSList);
        System.out.println("Obs in OCS: "+ocsObservingProgram);
        return ocsObservingProgram;
    }

    // Get observing program by science plan no in ocs
    @CrossOrigin
    @GetMapping("/ObservingProOCS")
    public @ResponseBody ObservingProgram getAllObseringProgramsOCS() {
        OCS o = new OCS();
        SciencePlan sciencePlanOCS = ocs.getSciencePlanByNo(1);
        return o.getObservingProgramBySciencePlan(sciencePlanOCS);
    }

    // Set Echo observing program parameters
    private ObservingProgramEcho setObservingprogram(ObservingProgramEcho observingProgram, Map<String, Object> body) {
//        observingprogram.setPlanNo(Integer.parseInt(body.getOrDefault("planNo", "0").toString()));
        observingProgram.setOpticsPrimary(body.getOrDefault("opticsPrimary", "").toString());
        observingProgram.setFStop(Double.parseDouble(body.getOrDefault("fStop", "0.0").toString()));
        observingProgram.setOpticsSecondaryRMS(Double.parseDouble(body.getOrDefault("opticsSecondaryRMS", "0.0").toString()));
        observingProgram.setScienceFoldMirrorDegree(Double.parseDouble(body.getOrDefault("scienceFoldMirrorDegree", "0.0").toString()));
        observingProgram.setScienceFoldMirrorType(edu.gemini.app.ocs.model.ObservingProgramConfigs.FoldMirrorType.valueOf(body.getOrDefault("scienceFoldMirrorType", "REFLECTIVE_CONVERGING_BEAM").toString()));
        observingProgram.setModuleContent(Integer.parseInt(body.getOrDefault("moduleContent", "0").toString()));
        observingProgram.setCalibrationUnit(edu.gemini.app.ocs.model.ObservingProgramConfigs.CalibrationUnit.valueOf(body.getOrDefault("calibrationUnit", "Argon").toString()));
        observingProgram.setLightType(edu.gemini.app.ocs.model.ObservingProgramConfigs.LightType.valueOf(body.getOrDefault("lightType", "MaunaKeaSkyEmission").toString()));
        if (body.containsKey("telePositionPair")) {
            Map<String, Object> telePositionPairMap = (Map<String, Object>) body.get("telePositionPair");
            TelePositionPairEcho telePositionPair = new TelePositionPairEcho();
            telePositionPair.setDirection(getDoubleValue(telePositionPairMap, "direction"));
            telePositionPair.setDegree(getDoubleValue(telePositionPairMap, "degree"));
            try {
                telePositionPairRepository.save(telePositionPair);
                observingProgram.setTelePositionPair(telePositionPair);
                int teleid = telePositionPair.getId();
                System.out.println("tele id" + teleid);
                System.out.println("TelePositionPair saved successfully!");
            } catch (Exception e) {
                System.err.println("Error saving TelePositionPair: " + e.getMessage());
                e.printStackTrace();
            }
        }

        if (body.containsKey("observer_id")) {
            Observer observer = observerRepository.findById(Integer.parseInt(body.get("observer_id").toString())).orElse(null);
            observingProgram.setObserver(observer);
        }
        if (body.containsKey("scienceplan_id")) {
            int observerId = Integer.valueOf(body.get("scienceplan_id").toString());
            SciencePlanEcho sciencePlanEcho = sciencePlanRepository.findById(Integer.parseInt(body.get("scienceplan_id").toString()))
                    .orElse(null);
            if (sciencePlanEcho != null) {
                observingProgram.setSciencePlan(sciencePlanEcho);
            }
        }
        System.out.println("Set 4");

        return observingProgram;
    }


    private Double getDoubleValue(Map<String, Object> body, String key) {
        Object value = body.get(key);
        if (value != null) {
            try {
                return Double.parseDouble(value.toString());
            } catch (NumberFormatException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    private Integer getIntValue(Map<String, Object> body, String key) {
        Object value = body.get(key);
        if (value != null) {
            try {
                return Integer.parseInt(value.toString());
            } catch (NumberFormatException e) {
                return null;
            }
        } else {
            return null;
        }
    }

}