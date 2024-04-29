package com.example.demo.Models;

import edu.gemini.app.ocs.model.StarSystem;
import jakarta.persistence.*;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "science_plans")
@Data
@Getter
@Setter
public class SciencePlan {
    @ManyToMany
    @JoinTable(
            name = "astronomer_scienceplan",
            joinColumns = @JoinColumn(name = "plan_no"),
            inverseJoinColumns = @JoinColumn(name = "astronomer_id")
    )
    private List<Astronomer> creators;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planNo;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC telescopeLocation;
    @OneToOne(cascade = CascadeType.ALL)
    private DataProcRequirement dataProcRequirements;


    public SciencePlan(int planNo, String creator, String submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
        this.planNo = planNo;
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.objectives = objectives;
        this.starSystem = starSystem;
        this.startDate = startDate;
        this.endDate = endDate;
        this.telescopeLocation = telescopeLocation;
        this.dataProcRequirements = dataProcRequirements;
    }

    public SciencePlan() {
    }

    public String getStartDate() {
        String sDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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
            ParseException e = var3;
            e.printStackTrace();
        }

    }

    public String getEndDate() {
        String eDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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
            ParseException e = var3;
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "SciencePlan [" +
                "planNo="+ planNo +
                ",creator=" + creator +
                ", dataProcRequirements=" + dataProcRequirements +
                ", endDate=" + endDate +
                ", fundingInUSD=" + fundingInUSD
                + ", objectives=" + objectives +
                ", starSystem=" + starSystem +
                ", startDate=" + startDate +
                ", submitter=" + submitter +
                ", telescopeLocation="
                + telescopeLocation + "]";
    }
}