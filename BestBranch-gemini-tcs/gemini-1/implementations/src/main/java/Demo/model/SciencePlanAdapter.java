package Demo.model;

import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SciencePlanAdapter {
    public static SciencePlan convertToSciencePlan(OurSciencePlan ourPlan) throws ParseException {
        SciencePlan plan = new SciencePlan();
        plan.setPlanNo(ourPlan.getPlanNo());
        plan.setCreator(ourPlan.getCreator().getName());
        plan.setSubmitter(ourPlan.getSubmitter().getName());
        plan.setFundingInUSD(ourPlan.getFundingInUSD());
        plan.setObjectives(ourPlan.getObjectives());
        plan.setStarSystem(ourPlan.getStarSystem());

        Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ourPlan.getStartDate());
        plan.setStartDate(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(startDate));

        Date endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ourPlan.getEndDate());
        plan.setEndDate(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(endDate));

        plan.setTelescopeLocation(ourPlan.getTelescopeLocation());
        plan.setStatus(ourPlan.getStatus());
        ArrayList<DataProcRequirement> dataproc = new ArrayList<>();
        for (DataProcRequirement dtproc:ourPlan.getDataProcRequirements()){
            plan.setDataProcRequirements(dtproc);
        }
        return plan;
    }

}
