package Demo.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import Demo.model.OurSciencePlan;
import Demo.model.SciencePlanAdapter;
import Demo.model.User;
import Demo.repository.sciplan.SciplanRepository;
import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @Autowired
    private SciplanRepository sciplanRepository;
    OCS o = new OCS();


    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) throws ParseException {
        User user = (User) session.getAttribute("loggininUser");
        if (user != null) {
            model.addAttribute("username", user.getName());
        } else {
            return "redirect:/login";
        }

        o.deleteAllSciencePlans();

        Iterable<OurSciencePlan> ourplans = sciplanRepository.findAll();
        ArrayList<OurSciencePlan> oursciplans = new ArrayList<>();

        Integer curplan = 0;
        Integer savedplan = 0;
        Integer submittedPlan = 0;
        for (OurSciencePlan plan: ourplans){
            if (plan.getStatus().equals(SciencePlan.STATUS.SAVED)) {
                savedplan++;
            }
            if (plan.getStatus().equals(SciencePlan.STATUS.SUBMITTED)) {
                submittedPlan++;
            }

            curplan++;
            oursciplans.add(plan);
            o.createSciencePlan(SciencePlanAdapter.convertToSciencePlan(plan));
            o.updateSciencePlanStatus(curplan, plan.getStatus());
        }

        model.addAttribute("draftPlan", savedplan);
        model.addAttribute("submittedPlan", submittedPlan);
        model.addAttribute("plans", oursciplans);
        model.addAttribute("totalPlans", oursciplans.size());
        return "Dashboard";
    }

    @GetMapping("/CreateSciPlan")
    public String CreateSciPlan(Model model, HttpSession session) {

        User user = (User) session.getAttribute("loggininUser");
        if (user == null) return "redirect:/login";

        model.addAttribute("CONSTELLATIONS", StarSystem.CONSTELLATIONS.values());
        model.addAttribute("TELESCOPELOC", SciencePlan.TELESCOPELOC.values());

        return "CreateSciPlan";
    }




    @PostMapping("/CreateSciPlan")
    public String handelCreateSciPlan(
            @RequestParam("objectives") String objectives,
            @RequestParam("fileType") String fileType,
            @RequestParam("funding") double funding,
            @RequestParam("StarSystem") StarSystem.CONSTELLATIONS constellation,
            @RequestParam("Location") SciencePlan.TELESCOPELOC location,
            @RequestParam("startDate") String _startDate,
            @RequestParam("endDate") String _endDate,
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
            @RequestParam("hue") double hue,
            HttpSession session
    ) throws ParseException, ClassNotFoundException, SQLException {

        User user = (User) session.getAttribute("loggininUser");
        if (user == null) return "redirect:/login";

        //Date input example _startDate:2024-04-26_endDate:2024-07-25
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = dateFormat.parse(_startDate);
        Date endDate = dateFormat.parse(_endDate);

        DataProcRequirement newDataProcRequirements = new DataProcRequirement(
                fileType, fileQuality, colorType,
                contrast, brightness, saturation,
                highlights, exposure, shadows,
                whites, blacks, luminance,
                hue
        );

        OurSciencePlan newOurSciPlan = new OurSciencePlan(
                user,
                user,
                funding,
                objectives,
                constellation,
                startDate,
                endDate,
                location,
                newDataProcRequirements
        );

        Iterable<OurSciencePlan> ourplans = sciplanRepository.findAll();
        Integer curplan = 1;
        for (OurSciencePlan plan: ourplans){
            curplan++;
        }
        newOurSciPlan.setPlanNo(curplan);
        newOurSciPlan.setStatus(SciencePlan.STATUS.SAVED);

        sciplanRepository.save(newOurSciPlan);
        o.createSciencePlan(SciencePlanAdapter.convertToSciencePlan(newOurSciPlan));

        return "redirect:/dashboard";
    }

    @GetMapping("/testing")
    public String testSciPlan(Model model, HttpSession session) throws ParseException {
        User user = (User) session.getAttribute("loggininUser");
        if (user == null) return "redirect:/login";

        Iterable<OurSciencePlan> ourplans = sciplanRepository.findAll();
        ArrayList<OurSciencePlan> oursavedsciplans = new ArrayList<>();

        for (OurSciencePlan plan: ourplans){
            if (plan.getStatus().equals(SciencePlan.STATUS.SAVED)) {
                oursavedsciplans.add(plan);
            }
        }

        if (oursavedsciplans.isEmpty()) {
            model.addAttribute("plans", "No Science plan to test");
            model.addAttribute("hasPlans", false);
        } else {
            model.addAttribute("plans", oursavedsciplans);
            model.addAttribute("hasPlans", true);
        }
        return "testing";
    }

    @PostMapping("/testing")
    public String handelTestSciPlan(@RequestParam("planId") String planId, Model model, HttpSession session) throws ParseException {
        User user = (User) session.getAttribute("loggininUser");
        if (user == null) return "redirect:/login";

        Iterable<OurSciencePlan> ourplans = sciplanRepository.findAll();
        OurSciencePlan oursciplan = null;
        String result = "";

        for (OurSciencePlan plan : ourplans) {
            if (plan.getPlanNo() == Integer.parseInt(planId)) {
                oursciplan = plan;
            }
        }

        if (oursciplan != null){
            result = o.testSciencePlan(o.getSciencePlanByNo(Integer.parseInt(planId)));}
        if (o.getSciencePlanByNo(Integer.parseInt(planId)).getStatus().equals(SciencePlan.STATUS.TESTED)){
            oursciplan.setStatus(SciencePlan.STATUS.TESTED);
            sciplanRepository.save(oursciplan);
            model.addAttribute("testResult", "TESTED SUCCESSFULLY!!! 🤩🤩🤩");
        }else {
            model.addAttribute("testResult", "TESTED UNSUCCESSFULLY 😒🤮😭");
        }

        return "testingResult";
    }

    @CrossOrigin
    @GetMapping("/submission")
    public String submission(Model model, HttpSession session) throws ParseException {
        User user = (User) session.getAttribute("loggininUser");
        if (user == null) return "redirect:/login";

        Iterable<OurSciencePlan> ourplans = sciplanRepository.findAll();
        ArrayList<OurSciencePlan> ourtestedsciplans = new ArrayList<>();

        for (OurSciencePlan plan: ourplans){
            if (plan.getStatus().equals(SciencePlan.STATUS.TESTED)) {
                ourtestedsciplans.add(plan);
            }
        }
        if (ourtestedsciplans.isEmpty()) {
            model.addAttribute("plans", "No Science plan to submit");
            model.addAttribute("hasPlans", false);
        } else {
            model.addAttribute("plans", ourtestedsciplans);
            model.addAttribute("hasPlans", true);
        }
        return "submit";
    }

    @PostMapping("/submission")
    public String handleSubmission(@RequestParam("planId") String planId, Model model, HttpSession session) throws ParseException {
        User user = (User) session.getAttribute("loggininUser");
        if (user == null) return "redirect:/login";

        String submitResult = "";
        Iterable<OurSciencePlan> ourplans = sciplanRepository.findAll();
        OurSciencePlan oursciplan = null;
        String result = "";

        for (OurSciencePlan plan : ourplans) {
            if (plan.getPlanNo() == Integer.parseInt(planId)) {
                oursciplan = plan;
            }
        }

        if (oursciplan != null){
            submitResult = o.submitSciencePlan(o.getSciencePlanByNo(Integer.parseInt(planId)));}

        System.out.println("o.getSciencePlanByNo(Integer.parseInt(planId)).getStatus() ->>>>> "+o.getSciencePlanByNo(Integer.parseInt(planId)).getStatus());

        if (o.getSciencePlanByNo(Integer.parseInt(planId)).getStatus().equals(SciencePlan.STATUS.SUBMITTED)){
            oursciplan.setStatus(SciencePlan.STATUS.SUBMITTED);
            oursciplan.setSubmitter(user);
            sciplanRepository.save(oursciplan);
        }



        model.addAttribute("submitResult", submitResult);
        return "submitResult";
    }


}