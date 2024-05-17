package echo.gemini.backend.controller;

import edu.gemini.app.ocs.OCS;

import echo.gemini.backend.model.*;
import echo.gemini.backend.repository.AstronomerRepository;
import echo.gemini.backend.repository.DataProcRequirementsRepository;
import echo.gemini.backend.repository.SciencePlanRepository;
import echo.gemini.backend.repository.UserRepository;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
//@RequestMapping("/science-plans")
public class SciencePlanController {
    @Autowired
    private SciencePlanRepository sciencePlanRepository;
    @Autowired
    private AstronomerRepository astronomerRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DataProcRequirementsRepository dataProcRequirementsRepository;

    private OCS ocs = new OCS();

    @CrossOrigin
    @GetMapping("/scienceplan")
    public String scienceplan() {
        return "scienceplan";
    }

    @CrossOrigin
    @GetMapping("/validatescienceplan")
    public String validatescienceplan() {
        return "validate_scienceplan";
    }

    // get science plans of user
    @CrossOrigin
    @GetMapping("/scienceplans")
    public @ResponseBody
    List<SciencePlanEcho> getAllSciencePlans(@RequestParam(value = "id") int id) {
        return sciencePlanRepository.findByAstronomersId(id);
    }

    @CrossOrigin
    @GetMapping("/SciPlansOCS")
    public @ResponseBody ArrayList<SciencePlan> getAllSciencePlansOCS() {
        OCS o = new OCS();
        return o.getAllSciencePlans();
    }

    @CrossOrigin
    @GetMapping("/SciPlansStatusOCS")
    public @ResponseBody ArrayList<SciencePlan> getSavedSciencePlansOCS() {
        OCS o = new OCS();
        o.getAllSciencePlans();
        return o.getAllSciencePlans();
    }

    // Create a new science plan and associate it of the logged in astronomer
    @CrossOrigin
    @PostMapping("/create-scienceplan")
    @ResponseBody
    public String addSciencePlan(@RequestBody Map<String, Object> body, @RequestParam(value = "id") int id) {
        Optional<Astronomer> optionalAstronomer = astronomerRepository.findById(id);
        if (optionalAstronomer.isPresent()) {
            Astronomer astronomer = optionalAstronomer.get();
            System.out.println("Body json: " + body);
            SciencePlanEcho sciencePlanEcho = createNewSciencePlan(body);
            // Add the astronomer (submitter) to the science plan
            int submitterId = Integer.parseInt(body.get("submitter").toString());
            Optional<Astronomer> optionalSubmitter = astronomerRepository.findById(submitterId);
            if (optionalSubmitter.isPresent()) {
                Astronomer submitter = optionalSubmitter.get();
                sciencePlanEcho.addAstronomers(submitter);
                if (id != submitterId) {
                    sciencePlanEcho.addAstronomers(astronomer);
//                    astronomer.addSciencePlans(sciencePlanEcho);
                }
//                submitter.addSciencePlans(sciencePlanEcho);

            } else {
                return "Failed to create a new science plan. Submitter with ID " + submitterId + " not found.";
            }
            sciencePlanRepository.save(sciencePlanEcho);
            createSciencePlanOCS(sciencePlanEcho.getPlanNo());
            System.out.println(sciencePlanEcho.getPlanNo());
            return "Successfully Created a new science plan: " + sciencePlanEcho;
        } else {
            return "Failed to create a new science plan. Astronomer with ID " + id + " not found.";
        }
    }

    private SciencePlanEcho createNewSciencePlan(Map<String, Object> body) {
//        System.out.println("Body json 2: " + body);
        SciencePlanEcho sciencePlanEcho = new SciencePlanEcho();
        // set science plan attributes
        sciencePlanEcho.setCreator(body.get("creator").toString());
//        System.out.println(body.get("creator").toString());
        int submitterId = Integer.parseInt(body.get("submitter").toString());
        Optional<User> optionalSubmitter = userRepository.findById(submitterId);
        if (optionalSubmitter.isPresent()) {
            User submitter = optionalSubmitter.get();
            sciencePlanEcho.setSubmitter(submitter.getUsername());
        }
        Double fundingInUSD = Double.parseDouble(body.get("fundingInUSD").toString());
        sciencePlanEcho.setFundingInUSD(fundingInUSD);
//        System.out.println(fundingInUSD);
        sciencePlanEcho.setObjectives(body.get("objectives").toString());
//        System.out.println(body.get("objectives").toString());
        StarSystem.CONSTELLATIONS starSystem = StarSystem.CONSTELLATIONS.valueOf(body.get("starSystem").toString());
        sciencePlanEcho.setStarSystem(starSystem);
        // add this HAWAII = 1, CHILE = 0
        if (body.get("telescopeLocation") != null) {
            String telescopeLocationStr = body.get("telescopeLocation").toString();
            if ("HAWAII".equals(telescopeLocationStr)) {
                sciencePlanEcho.setTelescopeLocation(SciencePlan.TELESCOPELOC.HAWAII);
            } else {
                sciencePlanEcho.setTelescopeLocation(SciencePlan.TELESCOPELOC.CHILE);
            }
        } else {
            // Handle the case when telescopeLocation is null
        }
        sciencePlanEcho.setStartDate(body.get("startDate").toString());
        sciencePlanEcho.setEndDate(body.get("endDate").toString());
        DataProcRequirementEcho dataProcRequirementsEcho = setJsonDataProcRequirements(body);
//        System.out.println("Body for setting data procs: "+body);
        sciencePlanEcho.setDataProcRequirements(dataProcRequirementsEcho);
        Status statusObject = Status.valueOf(body.get("status").toString().toUpperCase());
        sciencePlanEcho.setStatus(statusObject);
        return sciencePlanEcho;

    }

    private DataProcRequirementEcho setJsonDataProcRequirements(Map<String, Object> body) {
        Map<String, Object> dataProcRequirementsJs = (Map<String, Object>) body.get("dataProcRequirements");
        System.out.println("data procs: " + dataProcRequirementsJs);

        DataProcRequirementEcho dataProcRequirementsEcho = new DataProcRequirementEcho();

        dataProcRequirementsEcho.setFileType(getStringValue(dataProcRequirementsJs, "fileType"));
        dataProcRequirementsEcho.setFileQuality(getStringValue(dataProcRequirementsJs, "fileQuality"));
        dataProcRequirementsEcho.setColorType(getStringValue(dataProcRequirementsJs, "colorType"));

        // Check colorType to determine which properties to collect
        String colorType = getStringValue(dataProcRequirementsJs, "colorType");
        if (colorType != null && colorType.equalsIgnoreCase("B&W mode")) {
            dataProcRequirementsEcho.setContrast(getDoubleValue(dataProcRequirementsJs, "contrast"));
            dataProcRequirementsEcho.setHighlights(getDoubleValue(dataProcRequirementsJs, "highlights"));
            dataProcRequirementsEcho.setExposure(getDoubleValue(dataProcRequirementsJs, "exposure"));
            dataProcRequirementsEcho.setShadows(getDoubleValue(dataProcRequirementsJs, "shadows"));
            dataProcRequirementsEcho.setWhites(getDoubleValue(dataProcRequirementsJs, "whites"));
            dataProcRequirementsEcho.setBlacks(getDoubleValue(dataProcRequirementsJs, "blacks"));
            // Set default values for Color mode-specific properties
            dataProcRequirementsEcho.setBrightness(0.0); // Default value for brightness
            dataProcRequirementsEcho.setSaturation(0.0); // Default value for saturation
            dataProcRequirementsEcho.setLuminance(0.0); // Default value for luminance
            dataProcRequirementsEcho.setHue(0.0); // Default value for hue
        } else if (colorType != null && colorType.equalsIgnoreCase("Color mode")) {
            dataProcRequirementsEcho.setContrast(getDoubleValue(dataProcRequirementsJs, "contrast"));
            dataProcRequirementsEcho.setBrightness(getDoubleValue(dataProcRequirementsJs, "brightness"));
            dataProcRequirementsEcho.setSaturation(getDoubleValue(dataProcRequirementsJs, "saturation"));
            dataProcRequirementsEcho.setExposure(getDoubleValue(dataProcRequirementsJs, "exposure"));
            dataProcRequirementsEcho.setLuminance(getDoubleValue(dataProcRequirementsJs, "luminance"));
            dataProcRequirementsEcho.setHue(getDoubleValue(dataProcRequirementsJs, "hue"));
            // Set default values for B&W mode-specific properties
            dataProcRequirementsEcho.setHighlights(0.0); // Default value for highlights
            dataProcRequirementsEcho.setShadows(0.0); // Default value for shadows
            dataProcRequirementsEcho.setWhites(0.0); // Default value for whites
            dataProcRequirementsEcho.setBlacks(0.0); // Default value for blacks
        }

        // Update null values to 0.0
        if (dataProcRequirementsEcho.getContrast() == null) {
            dataProcRequirementsEcho.setContrast(0.0);
        }
        if (dataProcRequirementsEcho.getBrightness() == null) {
            dataProcRequirementsEcho.setBrightness(0.0);
        }
        if (dataProcRequirementsEcho.getSaturation() == null) {
            dataProcRequirementsEcho.setSaturation(0.0);
        }
        if (dataProcRequirementsEcho.getHighlights() == null) {
            dataProcRequirementsEcho.setHighlights(0.0);
        }
        if (dataProcRequirementsEcho.getExposure() == null) {
            dataProcRequirementsEcho.setExposure(0.0);
        }
        if (dataProcRequirementsEcho.getShadows() == null) {
            dataProcRequirementsEcho.setShadows(0.0);
        }
        if (dataProcRequirementsEcho.getWhites() == null) {
            dataProcRequirementsEcho.setWhites(0.0);
        }
        if (dataProcRequirementsEcho.getBlacks() == null) {
            dataProcRequirementsEcho.setBlacks(0.0);
        }
        if (dataProcRequirementsEcho.getLuminance() == null) {
            dataProcRequirementsEcho.setLuminance(0.0);
        }
        if (dataProcRequirementsEcho.getHue() == null) {
            dataProcRequirementsEcho.setHue(0.0);
        }

        System.out.println(dataProcRequirementsEcho);
        dataProcRequirementsRepository.save(dataProcRequirementsEcho);

        return dataProcRequirementsEcho;
    }

    private String getStringValue(Map<String, Object> body, String key) {
        return (String) body.get(key);
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

    @CrossOrigin
    @GetMapping("/science-plans")
    public @ResponseBody List<SciencePlanEcho> getSciencePlansByStatus(@RequestParam(name = "status", required = false) String status) {
        List<SciencePlanEcho> sciencePlanEchos = new ArrayList<>();
        sciencePlanRepository.findAll().forEach(sciencePlanEchos::add);
        if (status != null && status.equals("SAVED")) {
            return sciencePlanEchos.stream()
                    .filter(sciencePlan -> Status.SAVED.equals(sciencePlan.getStatus()))
                    .collect(Collectors.toList());
        }
        else if (status != null && status.equals("SUBMITTED")) {
            return sciencePlanEchos.stream()
                    .filter(sciencePlan -> Status.SUBMITTED.equals(sciencePlan.getStatus()))
                    .collect(Collectors.toList());
        }
        else if (status != null && status.equals("VALIDATED")) {
            return sciencePlanEchos.stream()
                    .filter(sciencePlan -> Status.VALIDATED.equals(sciencePlan.getStatus()))
                    .collect(Collectors.toList());
        }
        return sciencePlanEchos;
    }

    @CrossOrigin
    @GetMapping("/allscience-plans")
    public @ResponseBody List<SciencePlanEcho> getAllSciencePlans() {
        List<SciencePlanEcho> sciencePlanEchos = new ArrayList<>();
        sciencePlanRepository.findAll().forEach(sciencePlanEchos::add);
        return sciencePlanEchos;
    }

    @CrossOrigin
    @GetMapping("science-plan/{planNo}")
    @ResponseBody
    public Optional<SciencePlanEcho> getSciencePlanByNo(@PathVariable int planNo) {
        return sciencePlanRepository.findById(planNo);
    }

    @CrossOrigin
    @GetMapping("/Save-scienceplans")
    public @ResponseBody List<SciencePlanEcho> getSubmittedSciencePlans(@RequestParam(name = "status", required = false) Status status) {
        List<SciencePlanEcho> sciencePlanEchos = new ArrayList<>();
        sciencePlanRepository.findAll().forEach(sciencePlanEchos::add);
        if (status != null && status.equals("SAVED")) {
            System.out.println(sciencePlanEchos);
            return sciencePlanEchos.stream()
                    .filter(sciencePlan -> "SUBMITTED".equals(sciencePlan.getStatus()))
                    .collect(Collectors.toList());
        }
        return sciencePlanEchos;
    }

    @CrossOrigin
    @GetMapping("/validateSciencePlan/{planNo}")
    public @ResponseBody SciencePlanEcho validateSciencePlan(@PathVariable int planNo) {
        System.out.println(planNo);
        SciencePlanEcho sciencePlanEcho = sciencePlanRepository.findById(planNo)
                .orElseThrow(() -> new RuntimeException("Science plan not found with id: " + planNo));

        String resultUpdateStatusEcho = updateSciencePlanStatusEcho(sciencePlanEcho.getPlanNo(), Status.VALIDATED);
        System.out.println("Result validate science plan in echo " + resultUpdateStatusEcho);

        SciencePlan sciencePlanOCS = ocs.getSciencePlanByNo(planNo);
        Boolean resultUpdateOCS = ocs.updateSciencePlanStatus(sciencePlanOCS.getPlanNo(), SciencePlan.STATUS.VALIDATED);
        System.out.println("Result validate science plan in ocs " + resultUpdateOCS);
        return sciencePlanEcho;
    }

    @CrossOrigin
    @GetMapping("/invalidateSciencePlan/{planNo}")
    public @ResponseBody SciencePlanEcho invalidateSciencePlan(@PathVariable int planNo) {
        System.out.println(planNo);
        SciencePlanEcho sciencePlanEcho = sciencePlanRepository.findById(planNo)
                .orElseThrow(() -> new RuntimeException("Science plan not found with id: " + planNo));

        String resultUpdateStatusEcho = updateSciencePlanStatusEcho(sciencePlanEcho.getPlanNo(), Status.INVALIDATED);
        System.out.println("Result invalidate science plan in echo " + resultUpdateStatusEcho);

        SciencePlan sciencePlanOCS = ocs.getSciencePlanByNo(planNo);
        Boolean resultUpdateOCS = ocs.updateSciencePlanStatus(sciencePlanOCS.getPlanNo(), SciencePlan.STATUS.INVALIDATED);
        System.out.println("Result imvalidate science plan in ocs " + resultUpdateOCS);
        return sciencePlanEcho;
    }

    @CrossOrigin
    @GetMapping("/delete-ocsscience-plans")
    public @ResponseBody String deleteSciencePlans() {
        ocs.deleteAllSciencePlans();
        return "success";
    }

    @CrossOrigin
    @GetMapping("/submit-science-plans")
    public @ResponseBody String submitSciencePlan(@RequestParam("planNo") Integer planNo, @RequestParam("userId") int id) {
        // Retrieve SciencePlanEcho from the database based on planNo
        Optional<SciencePlanEcho> optionalSciencePlanEcho = sciencePlanRepository.findById(planNo);
        if (optionalSciencePlanEcho.isPresent()) {
            SciencePlanEcho sciencePlanEcho = optionalSciencePlanEcho.get();
            Optional<Astronomer> optionalAstronomer = astronomerRepository.findById(id);
            if (optionalAstronomer.isPresent()) {
                Astronomer astronomer = optionalAstronomer.get();
                if (astronomer.getUsername().equals(sciencePlanEcho.getSubmitter())) {
                    SciencePlan ocsSciPlan = ocs.getSciencePlanByNo(planNo);
                    System.out.println(ocsSciPlan.getPlanNo());
                    String resultUpdateStatusEcho = updateSciencePlanStatusEcho(sciencePlanEcho.getPlanNo(), Status.SUBMITTED);
                    System.out.println(resultUpdateStatusEcho);
                    System.out.println("Result of update sci plan status in Echo" + sciencePlanEcho.getStatus());
                    Boolean resultUpdateStatusOCS = ocs.updateSciencePlanStatus(ocsSciPlan.getPlanNo(), SciencePlan.STATUS.SUBMITTED);
                    System.out.println("Result of update sci plan status in OCS" + resultUpdateStatusOCS);

                    return "Update status of science plan no: " +planNo+ " successful";
                }
                else{
                    return "This user is not the submitter of this science plan";
                }
            }
            else{
                return "There is no user presented.";
            }
        } else {
            return null;
        }
    }


    public @ResponseBody String createSciencePlanOCS(int planNo) {
        // Retrieve SciencePlanEcho from the database based on planNo
        Optional<SciencePlanEcho> optionalSciencePlanEcho = sciencePlanRepository.findById(planNo);
        if (optionalSciencePlanEcho.isPresent()) {
            SciencePlanEcho sciencePlanEcho = optionalSciencePlanEcho.get();

            System.out.println("Start create a new Science Plan in OCS");
            SciencePlan ocsSciPlan = new SciencePlan();
            // Set parameters using values from SciencePlanEcho
//            ocsSciPlan.setPlanNo(sciencePlanEcho.getPlanNo());
            System.out.println(sciencePlanEcho.getPlanNo());
            ocsSciPlan.setCreator(sciencePlanEcho.getCreator());
            ocsSciPlan.setSubmitter(sciencePlanEcho.getSubmitter());
            ocsSciPlan.setFundingInUSD(sciencePlanEcho.getFundingInUSD());
            ocsSciPlan.setObjectives(sciencePlanEcho.getObjectives());
            ocsSciPlan.setStarSystem(sciencePlanEcho.getStarSystem());
            ocsSciPlan.setTelescopeLocation(sciencePlanEcho.getTelescopeLocation());
            ocsSciPlan.setStartDate(sciencePlanEcho.getStartDate());
            ocsSciPlan.setEndDate(sciencePlanEcho.getEndDate());
            // Set DataProcRequirements
            DataProcRequirementEcho dataProcRequirementEcho = sciencePlanEcho.getDataProcRequirements();
            DataProcRequirement dpr1 = new DataProcRequirement(dataProcRequirementEcho.getFileType(), dataProcRequirementEcho.getFileQuality(), dataProcRequirementEcho.getColorType(),
                    dataProcRequirementEcho.getContrast(), dataProcRequirementEcho.getBrightness(), dataProcRequirementEcho.getSaturation(), dataProcRequirementEcho.getHighlights(), dataProcRequirementEcho.getExposure(), dataProcRequirementEcho.getShadows(),
                    dataProcRequirementEcho.getWhites(), dataProcRequirementEcho.getBlacks(), dataProcRequirementEcho.getLuminance(), dataProcRequirementEcho.getHue());
            ocsSciPlan.setDataProcRequirements(dpr1);

            String result = ocs.createSciencePlan(ocsSciPlan);
            System.out.println(ocsSciPlan.getPlanNo());
            System.out.println(result);
//            String resultUpdateStatusEcho = updateSciencePlanStatusEcho(sciencePlanEcho.getPlanNo(),Status.SUBMITTED);
//            System.out.println(resultUpdateStatusEcho);
//            System.out.println("Result of update sci plan status in Echo"+ sciencePlanEcho.getStatus());
//            Boolean resultUpdateStatusOCS = ocs.updateSciencePlanStatus(ocsSciPlan.getPlanNo(), SciencePlan.STATUS.SUBMITTED);
//            System.out.println("Result of update sci plan status in OCS" + resultUpdateStatusOCS);

            return result;
        } else {
            return "Failed to create a new science plan";
        }
    }


    public String updateSciencePlanStatusEcho(Integer planNo, Status status) {
        // Retrieve the science plan from the database
        Optional<SciencePlanEcho> optionalSciencePlanEcho = sciencePlanRepository.findById(planNo);
        if (optionalSciencePlanEcho.isPresent()) {
            SciencePlanEcho sciencePlanEcho = optionalSciencePlanEcho.get();
            sciencePlanEcho.setStatus(status);
            sciencePlanRepository.save(sciencePlanEcho);
            return "Status updated successfully in Echo database";
        } else {
            return "Science plan not found";
        }
    }
}