package th.ac.mahidol.ict.crystal.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import edu.gemini.app.ocs.model.SciencePlan;

public class SciencePlanRepository {
    private static ArrayList<SciencePlan> sciencePlans = new ArrayList<>();

    public static String createSciencePlan(SciencePlan sp) {
        try {
            if (sp.getFundingInUSD() < 0) {
                return "Error: Funding cannot be negative.";
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.util.Date startDate =  sdf.parse(sp.getStartDate());
            java.util.Date endDate =  sdf.parse(sp.getEndDate());
            if (startDate.after(endDate)) {
                System.err.println("Error: Start date must be before end date.");
                return "Error: Start date must be before end date.";
            }

            synchronized (sciencePlans) {
                sp.setPlanNo(generatePlanNo());
                sp.setStatus(SciencePlan.STATUS.SAVED);
                sciencePlans.add(sp);
            }
            System.err.println("Science plan saved successfully with Plan No: " + sp.getPlanNo());
            return "Science plan saved successfully with Plan No: " + sp.getPlanNo();
        } catch (ParseException e) {
            System.err.println("Error: Invalid date format. Use 'yyyy-MM-dd HH:mm:ss'");
            return "Error: Invalid date format. Use 'yyyy-MM-dd HH:mm:ss'";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Error: " + e.getMessage();
        }
    }

    private synchronized static int generatePlanNo() {
        return sciencePlans.size() + 1;
    }

    public static ArrayList<SciencePlan> getAllSciencePlans() {
        synchronized (sciencePlans) {
            // Optionally perform status updates or other checks before returning
            return new ArrayList<>(sciencePlans); // Return a copy to protect the integrity of the original list
        }
    }
    public static synchronized SciencePlan getSciencePlanByNo(int planNo) {
        for (SciencePlan plan : sciencePlans) {
            if (plan.getPlanNo() == planNo) {
                return plan; // Return the matching plan
            }
        }
        return null; // Return null if no matching plan is found
    }
}