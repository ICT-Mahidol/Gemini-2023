package th.ac.mahidol.ict.crystal.model;

import java.util.List;

import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;

public class Sciplan {
    private int planNo;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private StarSystem starSystem;
    private String startDate;
    private String endDate;
    private TELESCOPELOC telescopeLocation;
    private STATUS status;
    private DataProcRequirement dataProcRequirements;

    // Enum for Telescope Location
    public enum TELESCOPELOC {
        HAWAII, CHILE, AUSTRALIA, SOUTH_AFRICA
    }

    // Enum for Plan Status
    public enum STATUS {
        SAVED, SUBMITTED, TESTED, CANCELLED
    }

    // Constructor
    public Sciplan() {
    }
    public Sciplan(int planNo, String creator, String submitter, double fundingInUSD, String objectives,
    StarSystem starSystem, String startDate, String endDate, TELESCOPELOC telescopeLocation,
    STATUS status, DataProcRequirement dataProcRequirements) {
    this.planNo = planNo;
    this.creator = creator;
    this.submitter = submitter;
    this.fundingInUSD = fundingInUSD;
    this.objectives = objectives;
    this.starSystem = starSystem;
    this.startDate = startDate;
    this.endDate = endDate;
    this.telescopeLocation = telescopeLocation;
    this.status = status;
    this.dataProcRequirements = dataProcRequirements;
    }

    // Getters and Setters
    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public double getFundingInUSD() {
        return fundingInUSD;
    }

    public void setFundingInUSD(double fundingInUSD) {
        this.fundingInUSD = fundingInUSD;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public StarSystem getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(StarSystem starSystem) {
        this.starSystem = starSystem;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public TELESCOPELOC getTelescopeLocation() {
        return telescopeLocation;
    }

    public void setTelescopeLocation(TELESCOPELOC telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS saved) {
        this.status = saved;
    }

    public DataProcRequirement getDataProcRequirements() {
        return dataProcRequirements;
    }

    public void setDataProcRequirements(DataProcRequirement dataProcRequirements) {
        this.dataProcRequirements = dataProcRequirements;
    }
    public SciencePlan toOcsSciencePlan() {
        int ocsPlanId = this.getPlanNo();
        String ocsInvestigatorName = this.getCreator(); // Assuming 'creator' is equivalent to 'investigatorName'
        double ocsBudget = this.getFundingInUSD();
        String ocsResearchObjective = this.getObjectives();

        // Create and return the OcsSciencePlan instance
        return new SciencePlan(ocsPlanId, ocsInvestigatorName, ocsBudget, ocsResearchObjective);
    }
}
