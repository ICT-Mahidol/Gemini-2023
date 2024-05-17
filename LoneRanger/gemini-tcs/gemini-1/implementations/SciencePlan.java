package com.example.Gemini3.model;

import java.util.Date;


public class SciencePlan {
    private String planTitle;
    private String hypothesis;
    private Date observationStart;
    private Date observationEnd;

    // Default constructor
    public SciencePlan() {}

    // Constructor with all fields
    public SciencePlan(String planTitle, String hypothesis, Date observationStart, Date observationEnd) {
        this.planTitle = planTitle;
        this.hypothesis = hypothesis;
        this.observationStart = observationStart;
        this.observationEnd = observationEnd;
    }

    // Getters and setters
    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    public String getHypothesis() {
        return hypothesis;
    }

    public void setHypothesis(String hypothesis) {
        this.hypothesis = hypothesis;
    }

    public Date getObservationStart() {
        return observationStart;
    }

    public void setObservationStart(Date observationStart) {
        this.observationStart = observationStart;
    }

    public Date getObservationEnd() {
        return observationEnd;
    }

    public void setObservationEnd(Date observationEnd) {
        this.observationEnd = observationEnd;
    }

    // toString method for logging and debugging purposes
    @Override
    public String toString() {
        return "SciencePlan{" +
                "planTitle='" + planTitle + '\'' +
                ", hypothesis='" + hypothesis + '\'' +
                ", observationStart=" + observationStart +
                ", observationEnd=" + observationEnd +
                '}';
    }
}

