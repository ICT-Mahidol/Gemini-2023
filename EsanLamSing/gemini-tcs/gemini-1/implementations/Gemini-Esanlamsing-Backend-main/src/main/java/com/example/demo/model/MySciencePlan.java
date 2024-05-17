package com.example.demo.model;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.*;



@Entity
@Table(name = "scienceplans")
public class MySciencePlan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plan_seq")
    @SequenceGenerator(name = "plan_seq", sequenceName = "plan_sequence", allocationSize = 1)
    private long planNo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "user_id", updatable = false, insertable = false)
    private Long userId;

    // Constructors, getters and setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
//        this.userId = user != null ? user.getUserID() : null;
    }

    public Long getUserId() {
        return userId;
    }
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private String starSystem;
    private Date startDate;
    private Date endDate;
    private String telescopeLocation;
    private String[] dataProcRequirements;
    private String status;


    public MySciencePlan() {
    }

    public MySciencePlan(String creator, String submitter, double fundingInUSD, String objectives, String starSystem, Date startDate, Date endDate, String telescopeLocation, String[] dataProcRequirements, String status) {
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.objectives = objectives;
        this.starSystem = starSystem;
        this.startDate = startDate;
        this.endDate = endDate;
        this.telescopeLocation = telescopeLocation;
        this.dataProcRequirements = dataProcRequirements;
        this.status = status;
    }

    public long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(long planNo) {
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

    public String getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(String starSystem) {
        this.starSystem = starSystem;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTelescopeLocation() {
        return telescopeLocation;
    }

    public void setTelescopeLocation(String telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public String[] getDataProcRequirements() {
        return dataProcRequirements;
    }

    public void setDataProcRequirements(String[] dataProcRequirements) {
        this.dataProcRequirements = dataProcRequirements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "SciencePlan{" +
                "planNo=" + planNo +
                ", creator='" + creator + '\'' +
                ", submitter='" + submitter + '\'' +
                ", fundingInUSD=" + fundingInUSD +
                ", objectives='" + objectives + '\'' +
                ", starSystem='" + starSystem + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", telescopeLocation='" + telescopeLocation + '\'' +
                ", dataProcRequirements=" + dataProcRequirements +
                ", status='" + status + '\'' +
                '}';
    }

}
