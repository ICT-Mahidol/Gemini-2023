package com.example.demo.Model;

import edu.gemini.app.ocs.model.StarSystem.CONSTELLATIONS;
import edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC;

import jakarta.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import lombok.*;

@Entity
@SequenceGenerator(name = "planIdSequence", allocationSize = 1)
@Table(name = "SCIENCE_PLANS")
@NoArgsConstructor
@Getter
@Setter
public class SciencePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planIdSequence")
    private int planNo;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private TELESCOPELOC telescopeLocation;
    @OneToOne(cascade = CascadeType.ALL)
    private DataProcRequirement dataProcRequirements;

    public SciencePlan(String creator, String submitter,
                       double fundingInUSD, String objectives,
                       CONSTELLATIONS starSystem,
                       Date startDate, Date endDate, TELESCOPELOC telescopeLocation,
                       DataProcRequirement dataProcRequirements) {
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
                "planId = "+ planNo +
                ",creator = " + creator +
                ", dataProcRequirements = " + dataProcRequirements +
                ", endDate = " + endDate +
                ", fundingInUSD = " + fundingInUSD
                + ", objectives = " + objectives +
                ", starSystem = " + starSystem +
                ", startDate = " + startDate +
                ", submitter = " + submitter +
                ", telescopeLocation = "
                + telescopeLocation + "]";
    }

}