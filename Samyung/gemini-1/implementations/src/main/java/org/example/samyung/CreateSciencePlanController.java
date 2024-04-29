package org.example.samyung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.OCS;

public class CreateSciencePlanController {

    @CrossOrigin
    @GetMapping("/CreateSci")

    public String showCreateSciPlanForm(Model model) {
        // Add any necessary model attributes
        return "createSciPlan"; // Return the name of the HTML template
    }
    public String createSciPlan(@RequestParam String creator, @RequestParam String submitter, @RequestParam double fundingInUSD,
                                     @RequestParam String objectives, @RequestParam String starSystem, @RequestParam String startDate,
                                     @RequestParam String endDate, @RequestParam String telescopeLocation,
                                     @RequestParam String[] dataProc, RedirectAttributes redirectAttrs) {

        // Convert starSystem and telescopeLocation strings to corresponding enums
        StarSystem.CONSTELLATIONS constellation = StarSystem.CONSTELLATIONS.valueOf(starSystem);
        SciencePlan.TELESCOPELOC location = SciencePlan.TELESCOPELOC.valueOf(telescopeLocation);

        // Create MySciencePlan object
        MySciencePlan mySP = new MySciencePlan();
        mySP.setCreator(creator);
        mySP.setSubmitter(submitter);
        mySP.setFundingInUSD(fundingInUSD);
        mySP.setObjectives(objectives);
        mySP.setStarSystem(constellation);
        mySP.setStartDate(startDate);
        mySP.setEndDate(endDate);
        mySP.setTelescopeLocation(location);

        // Create DataProcRequirement object
        DataProcRequirement dpr1 =
                new DataProcRequirement(dataProc[0], dataProc[1], dataProc[2],
                        Integer.parseInt(dataProc[3]), Integer.parseInt(dataProc[4]), Integer.parseInt(dataProc[5]),
                        Integer.parseInt(dataProc[6]), Integer.parseInt(dataProc[7]), Integer.parseInt(dataProc[8]),
                        Integer.parseInt(dataProc[9]), Integer.parseInt(dataProc[10]), Integer.parseInt(dataProc[11]),
                        Integer.parseInt(dataProc[12]));
        mySP.setDataProcRequirements(dpr1);

        // submit it to the OCS system


        redirectAttrs.addFlashAttribute("Message", "Create Science Plan Successfully");
        return "redirect:/Create";
    }


}
