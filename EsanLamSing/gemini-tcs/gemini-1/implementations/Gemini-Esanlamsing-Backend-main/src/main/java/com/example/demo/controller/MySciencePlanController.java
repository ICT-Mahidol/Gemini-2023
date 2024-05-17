package com.example.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.model.User;
import org.h2.store.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.MySciencePlan;
import com.example.demo.repository.MySciencePlanRepository;
import com.example.demo.repository.UserRepository;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.SciencePlan.STATUS;
import edu.gemini.app.ocs.model.StarSystem.CONSTELLATIONS;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
public class MySciencePlanController {
    
    @Autowired
    private MySciencePlanRepository MysciencePlanRepository;

    @Autowired
    private UserRepository UserRepository;

    @CrossOrigin
    @GetMapping("/sp")
    @ResponseBody
    public Iterable<MySciencePlan> getSciencePlans() {
        return MysciencePlanRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/sp")
    @ResponseBody
    public MySciencePlan addSciencePlan(@RequestBody MySciencePlan sp) {
        return MysciencePlanRepository.save(sp);
    }

    @CrossOrigin
    @DeleteMapping("/sp")
    @ResponseBody
    public void deleteSciencePlan(@RequestParam Long id) {
        MysciencePlanRepository.deleteById(id);
    }

    // update science plan
    @CrossOrigin
    @PutMapping("/sp")
    @ResponseBody
    public MySciencePlan updateSciencePlan(@RequestBody MySciencePlan sp) {
        return MysciencePlanRepository.save(sp);
    }

    // update science plan by id
    @CrossOrigin
    @PutMapping("/sp/{id}")
    @ResponseBody
    public MySciencePlan updateSciencePlanById(@PathVariable Long id, @RequestBody MySciencePlan sp) {
        MySciencePlan existingSP = MysciencePlanRepository.findById(id).orElse(null);
        if (existingSP == null) {
            return null;
        }
        existingSP.setCreator(sp.getCreator());
        existingSP.setSubmitter(sp.getSubmitter());
        existingSP.setFundingInUSD(sp.getFundingInUSD());
        existingSP.setObjectives(sp.getObjectives());
        existingSP.setStarSystem(sp.getStarSystem());
        existingSP.setStartDate(sp.getStartDate());
        existingSP.setEndDate(sp.getEndDate());
        existingSP.setTelescopeLocation(sp.getTelescopeLocation());
        existingSP.setDataProcRequirements(sp.getDataProcRequirements());
        existingSP.setStatus(sp.getStatus());
        return MysciencePlanRepository.save(existingSP);
    }

    @CrossOrigin
    @GetMapping("/sp/{id}")
    @ResponseBody
    public MySciencePlan getSciencePlan(@PathVariable Long id) {
        return MysciencePlanRepository.findById(id).orElse(null);
    }

    //  auto generated 
    @CrossOrigin
    @GetMapping("/autosp/{email}")
    public ResponseEntity<?> getAutoSciencePlan(@PathVariable String email) {
        User user = UserRepository.findByEmail(email);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with email " + email + " not found");
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date startDate = dateFormat.parse("15/05/2021 13:00:00");
            Date endDate = dateFormat.parse("15/05/2021 23:59:59");

            String[] dataProcRequirements = {"PNG", "Fine", "B&W mode", "3.0", "0.0", "0.0", "10.15", "5.0", "7.0", "10.0", "0.0", "0.0", "0.0"};
            MySciencePlan sp1 = new MySciencePlan("Himji Paehi", "Himji Paehi", 1000.0, "To study the stars", "Virgo", startDate, endDate, "CHILE", dataProcRequirements, "SAVED");
            MySciencePlan sp2 = new MySciencePlan("Pae Him", "Himji Paehi", 1500.0, "Test case for failure", "Andromeda", startDate, endDate, "HAWAII", dataProcRequirements, "SAVED");

            sp1.setUser(user); // Link the user
            sp2.setUser(user); // Link the user
            MysciencePlanRepository.save(sp1);
            MysciencePlanRepository.save(sp2);
            return ResponseEntity.ok("Auto-generated science plans successfully.");

        } catch (ParseException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Date format error: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to auto generate science plans: " + e.getMessage());
        }
    }


    // test science plan
    @CrossOrigin
    @PostMapping("/tsp")
    @ResponseBody
    public String testSciencePlan(@RequestParam Long id) {
        MySciencePlan sp = MysciencePlanRepository.findById(id).orElse(null);
        if (sp == null) {
            return "Science Plan not found!";
        }
        OCS o = new OCS();
        DataProcRequirement dpr = new DataProcRequirement(
            sp.getDataProcRequirements()[0],
            sp.getDataProcRequirements()[1],
            sp.getDataProcRequirements()[2],
            Double.parseDouble(sp.getDataProcRequirements()[3]),
            Double.parseDouble(sp.getDataProcRequirements()[4]),
            Double.parseDouble(sp.getDataProcRequirements()[5]),
            Double.parseDouble(sp.getDataProcRequirements()[6]),
            Double.parseDouble(sp.getDataProcRequirements()[7]),
            Double.parseDouble(sp.getDataProcRequirements()[8]),
            Double.parseDouble(sp.getDataProcRequirements()[9]),
            Double.parseDouble(sp.getDataProcRequirements()[10]),
            Double.parseDouble(sp.getDataProcRequirements()[11]),
            Double.parseDouble(sp.getDataProcRequirements()[12])
        );
        SciencePlan sciplan = new SciencePlan();
        sciplan.setCreator(sp.getCreator());
        sciplan.setSubmitter(sp.getSubmitter());
        sciplan.setFundingInUSD(sp.getFundingInUSD());
        sciplan.setObjectives(sp.getObjectives());
        sciplan.setStarSystem(CONSTELLATIONS.valueOf(sp.getStarSystem()));
        sciplan.setStartDate(sp.getStartDate());
        sciplan.setEndDate(sp.getEndDate());
        sciplan.setTelescopeLocation(SciencePlan.TELESCOPELOC.valueOf(sp.getTelescopeLocation().toUpperCase()));
        sciplan.setStatus(STATUS.valueOf(sp.getStatus()));
        sciplan.setDataProcRequirements(dpr);
        sciplan.setPlanNo((int) sp.getPlanNo());
        if (sp.getStatus() == "TESTED"){
            return "Science plan with ID " + id + " already tested.";
        }

        try{
            String testResults = o.testSciencePlan(sciplan);
            int okCount = countOccurrences(testResults, "OK");
            if (okCount == 4){
                sp.setStatus("TESTED");
                MysciencePlanRepository.save(sp);
            }
            return testResults;
        }
        catch (Exception e){
            return "Failed to test science plan with ID " + id + ".";
        }
        
    }

    // Helper method to count occurrences of a substring in a string
    private int countOccurrences(String str, String subStr) {
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }

    // submit science plan
    @CrossOrigin
    @PostMapping("/ssp")
    @ResponseBody
    public String submitSciencePlan(@RequestParam Long id) {
        MySciencePlan sp = MysciencePlanRepository.findById(id).orElse(null);
        if (sp == null) {
            return "Science Plan not found!";
        }
        OCS o = new OCS();
        SciencePlan sciplan = new SciencePlan();
        if(sp.getStatus() == "SUBMITTED"){
            return "Science Plan Already Submitted";
        }
        sciplan.setPlanNo((int) sp.getPlanNo());
        sciplan.setStatus(STATUS.valueOf(sp.getStatus()));
        String submitResults = o.submitSciencePlan(sciplan);
        if (submitResults.equals("Your science plan has been submitted.")) {
            sp.setStatus("SUBMITTED");
            MysciencePlanRepository.save(sp);
        }
        return submitResults;
    }


    // validate science plan
    @CrossOrigin
    @PostMapping("/vsp")
    @ResponseBody
    public ResponseEntity<?> validateSciencePlan(@RequestParam Long id) {
        MySciencePlan sp = MysciencePlanRepository.findById(id).orElse(null);
        if (sp == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Science Plan not found!");
        }
        if (sp.getStatus().equals("SUBMITTED")){
            sp.setStatus("VALIDATED");
            MysciencePlanRepository.save(sp);
            return ResponseEntity.ok("Science plan with ID " + id + " validated successfully.");
        }
        else if(sp.getStatus().equals("VALIDATED")){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Science Plan Already Validated");
        }
        else if(sp.getStatus().equals("INVALIDATED")){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Science Plan Already Invalidated");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to validate science plan with ID " + id + ".");
    }

    // invalidate science plan
    @CrossOrigin
    @PostMapping("/ivsp")
    @ResponseBody
    public ResponseEntity<?> invalidateSciencePlan(@RequestParam Long id) {
        MySciencePlan sp = MysciencePlanRepository.findById(id).orElse(null);
        if (sp == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Science Plan not found!");
        }
        if (sp.getStatus().equals("SUBMITTED")){
            sp.setStatus("INVALIDATED");
            MysciencePlanRepository.save(sp);
            return ResponseEntity.ok("Science plan with ID " + id + " invalidated successfully.");
        }
        else if(sp.getStatus().equals("INVALIDATED")){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Science Plan Already Invalidated");
        }
        else if(sp.getStatus().equals("VALIDATED")){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Science Plan Already Validated");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to invalidate science plan with ID " + id + ".");
    }
}   
