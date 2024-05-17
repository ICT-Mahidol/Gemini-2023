package com.example.implementations.SciencePlan;

import com.example.implementations.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.StarSystem;
import edu.gemini.app.ocs.model.AstronomicalData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SciencePlan extends edu.gemini.app.ocs.model.SciencePlan{
    private int planNo;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private TELESCOPELOC telescopeLocation;
    private ArrayList<DataProcRequirement> dataProcRequirements = new ArrayList();
    private AstronomicalData astroData = new AstronomicalData();
    private STATUS status;
    private OCS ocs = new OCS();

    public SciencePlan() {

    }

    public SciencePlan(String creator, String submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.objectives = objectives;
        this.starSystem = starSystem;
        this.startDate = startDate;
        this.endDate = endDate;
        this.telescopeLocation = telescopeLocation;
        this.dataProcRequirements.add(dataProcRequirements);
    }

    public String getCreator() {
        return this.creator;
    }

    public String getSubmitter() {
        return this.submitter;
    }

    public double getFundingInUSD() {
        return this.fundingInUSD;
    }

    public String getObjectives() {
        return this.objectives;
    }

    public StarSystem.CONSTELLATIONS getStarSystem() {
        return this.starSystem;
    }

    public StarSystem.CONSTELLATIONS getStarSystem2() {
        return this.starSystem;
    }

    public String getStartDate() {
        String sDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            sDate = formatter.format(this.startDate);
        } catch (Exception var4) {
            sDate = "-1";
        }

        return sDate;
    }

    public String getEndDate() {
        String eDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            eDate = formatter.format(this.endDate);
        } catch (Exception var4) {
            eDate = "-1";
        }

        return eDate;
    }

    public TELESCOPELOC getTelescopeLocation() {
        return this.telescopeLocation;
    }

    public int getPlanNo() {
        return this.planNo;
    }

    public STATUS getStatus() {
        return this.status;
    }
}