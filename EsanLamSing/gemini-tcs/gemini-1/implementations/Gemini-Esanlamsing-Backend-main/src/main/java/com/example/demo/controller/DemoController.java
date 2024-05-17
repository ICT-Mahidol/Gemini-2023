package com.example.demo.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.SciencePlan.STATUS;
import edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC;
import edu.gemini.app.ocs.model.StarSystem.CONSTELLATIONS;
import edu.gemini.app.ocs.model.StarSystem;

import org.h2.store.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class DemoController {

    @CrossOrigin
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    // @CrossOrigin
    // @GetMapping("/scienceplans")
    // public ArrayList<SciencePlan> gettAllSciencePlans() {
    //     OCS o = new OCS();
    //     System.out.println(o.getAllSciencePlans());
    //     return o.getAllSciencePlans();
    // }

    // // example of how to get a science plan by id
    // @CrossOrigin
    // @PostMapping("/getscienceplan")
    // public SciencePlan test(@RequestParam int id) {
    //     OCS o = new OCS();
    //     return o.getSciencePlanByNo(id);
    // }

    // // create a new science plan
    // @CrossOrigin
    // @PostMapping("/createscienceplan")
    // public String createscienceplan(@RequestBody SciencePlan sp){
    //     OCS o = new OCS();
    //     return o.createSciencePlan(sp);
    // }

    // // test science plan
    // @CrossOrigin
    // @PostMapping("/testscienceplan")
    // public String testSciencePlan(@RequestParam int id) {
    //     OCS o = new OCS();
    //     SciencePlan sp = new SciencePlan();
    //     sp = o.getSciencePlanByNo(id);
    //     return o.testSciencePlan(sp);
    // }


    // // submit science plan
    // @CrossOrigin
    // @PostMapping("/submitscienceplan")
    // public String submitSciencePlan(@RequestParam int id) {
    //     OCS o = new OCS();
    //     SciencePlan sp = new SciencePlan();
    //     sp = o.getSciencePlanByNo(id);
    //     if (sp.getStatus() == STATUS.SUBMITTED) {
    //         return "Science Plan Already Submitted";
    //     }
    //     return o.submitSciencePlan(sp);
    // }


    // @CrossOrigin
    // @PostMapping("/validate")
    // public String validateSciencePlan(@RequestParam int id) {
    //     OCS o = new OCS();
    //     SciencePlan sp = o.getSciencePlanByNo(id);
    //     if(sp != null && sp.getStatus() == STATUS.SUBMITTED){
    //        o.updateSciencePlanStatus(id, STATUS.VALIDATED);
    //        return "Science plan with ID " + id + " validated successfully.";
    //     }
    //     else if (sp != null && sp.getStatus() == STATUS.VALIDATED){
    //         return "Science plan with ID " + id + " already validated.";
    //     }
    //     o.updateSciencePlanStatus(id, STATUS.INVALIDATED);
    //     return "Failed to validate science plan with ID " + id + ".";
    // }

    // TODO: implement the add configuration endpoint



}
