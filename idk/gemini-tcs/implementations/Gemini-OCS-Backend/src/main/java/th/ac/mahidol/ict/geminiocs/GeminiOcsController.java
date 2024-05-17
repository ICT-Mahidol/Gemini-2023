package th.ac.mahidol.ict.geminiocs;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/")
public class GeminiOcsController {

    @CrossOrigin
    @GetMapping("/getplan")
    public ArrayList<SciencePlan> gettAllSciencePlans() {
        OCS o = new OCS();
        System.out.println(o.getAllSciencePlans());
        return o.getAllSciencePlans();
    }

    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<String> createSciencePlan(@RequestBody SciencePlan sciencePlan) {
        try {
            OCS o = new OCS();
            String result = o.createSciencePlan(sciencePlan);
            
            String[] parts = result.split("\n", 2); 
            String statusCode = parts[0]; 
            String message = (parts.length > 1) ? parts[1] : "";

            if (statusCode.contains("-1")) {
                
                return ResponseEntity.badRequest().body("Failed to create Science Plan: " + message);
            } else {
                
                return ResponseEntity.ok("Science Plan created successfully: " + message);
            }
        } catch (Exception e) {
            
            e.printStackTrace(); 
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }

    }

    @CrossOrigin
    @PostMapping("/remove/{id}")
    public ResponseEntity<String> deletePlanByID(@PathVariable Integer id) {
        try {
            OCS o = new OCS();
            o.deleteSciencePlanByNo(id);
            return ResponseEntity.ok("Deleted Science Plan no." + id);
        } catch (Exception e) {
            e.printStackTrace(); 
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        } 

    }

    @CrossOrigin
    @PostMapping("/test/{id}")
    public ResponseEntity<String> testSciencePlan(@PathVariable Integer id) {
        
        try {
            OCS o = new OCS();
            String result = o.testSciencePlan(o.getSciencePlanByNo(id));
            return ResponseEntity.ok(result);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body("Failed to test Science Plan no." + id);
        }  
        
    }

    @CrossOrigin
    @PostMapping("/submit/{id}")
    public ResponseEntity<String> submitSciencePlan(@PathVariable Integer id) { 
        OCS o = new OCS();

        return ResponseEntity.ok(o.submitSciencePlan(o.getSciencePlanByNo(id)));

    }

    @CrossOrigin
    @PostMapping("/star/{id}")
    public ResponseEntity<String> getStarSystem(@PathVariable Integer id) {
        OCS o = new OCS();
        StarSystem.CONSTELLATIONS starsystem = o.getSciencePlanByNo(id).getStarSystem();
        
        return ResponseEntity.ok("Available Month:" + starsystem.getmonth());

    }



}
