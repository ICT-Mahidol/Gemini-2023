package th.ac.mahidol.ict.crystal.model;

import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;


import java.util.Date;

public class SciPlan {
    private int id;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String obj;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date start;
    private Date end;
    private SciencePlan.TELESCOPELOC telescopeLocation;
    private DataProcRequirement dataProcRequirements;

    // Constructor
    public SciPlan(String creator, String submitter, double fundingInUSD, String obj, StarSystem.CONSTELLATIONS starSystem,
                   Date start, Date end, SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.obj = obj;
        this.starSystem = starSystem;
        this.start = start;
        this.end = end;
        this.telescopeLocation = telescopeLocation;
        this.dataProcRequirements = dataProcRequirements;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public StarSystem.CONSTELLATIONS getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(StarSystem.CONSTELLATIONS starSystem) {
        this.starSystem = starSystem;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public SciencePlan.TELESCOPELOC getTelescopeLocation() {
        return telescopeLocation;
    }

    public void setTelescopeLocation(SciencePlan.TELESCOPELOC telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public DataProcRequirement getDataProcRequirements() {
        return dataProcRequirements;
    }

    public void setDataProcRequirements(DataProcRequirement dataProcRequirements) {
        this.dataProcRequirements = dataProcRequirements;
    }


}
