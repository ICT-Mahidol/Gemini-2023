package Demo.model;

import edu.gemini.app.ocs.model.AstronomicalData;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import jakarta.persistence.*;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class OurSciencePlan implements Serializable {

    @Column(name = "CREATOR", columnDefinition = "BLOB")
    private User creator;
    @Column(name = "SUBMITTER", columnDefinition = "BLOB")
    private User submitter;
    @Id
    private int planNo;

    public OurSciencePlan() {

    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @ManyToMany(mappedBy = "sciencePlans", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> users;


    private double fundingInUSD;
    private String objectives;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private SciencePlan.TELESCOPELOC telescopeLocation;
    @Column(name = "DATA_PROC_REQUIREMENTS", columnDefinition = "BLOB")
    private ArrayList<DataProcRequirement> dataProcRequirements = new ArrayList();
    private SciencePlan.STATUS status;

    public OurSciencePlan(User creator, User submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
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


    public User getCreator() {
        return this.creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getSubmitter() {
        return this.submitter;
    }

    public void setSubmitter(User submitter) {
        this.submitter = submitter;
    }

    public double getFundingInUSD() {
        return this.fundingInUSD;
    }

    public void setFundingInUSD(double fundingInUSD) {
        this.fundingInUSD = fundingInUSD;
    }

    public String getObjectives() {
        return this.objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public StarSystem.CONSTELLATIONS getStarSystem() {
        return this.starSystem;
    }

    public void setStarSystem(StarSystem.CONSTELLATIONS starSystem) {
        this.starSystem = starSystem;
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

    public void setStartDate(String startDate) {
        try {
            this.startDate = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).parse(startDate);
        } catch (ParseException var3) {
            var3.printStackTrace();
        }

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

    public void setEndDate(String endDate) {
        try {
            this.endDate = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).parse(endDate);
        } catch (ParseException var3) {
            var3.printStackTrace();
        }

    }

    public SciencePlan.TELESCOPELOC getTelescopeLocation() {
        return this.telescopeLocation;
    }

    public void setTelescopeLocation(SciencePlan.TELESCOPELOC telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public ArrayList<DataProcRequirement> getDataProcRequirements() {
        return this.dataProcRequirements;
    }

    public void setDataProcRequirements(DataProcRequirement dataProcRequirements) {
        this.dataProcRequirements.add(dataProcRequirements);
    }

    public int getPlanNo() {
        return this.planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SciencePlan.STATUS getStatus() {
        return this.status;
    }

    public void setStatus(SciencePlan.STATUS status) {
        this.status = status;
    }

}