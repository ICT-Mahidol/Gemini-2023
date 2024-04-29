package org.example.samyung;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.ObservingProgramConfigs;
import edu.gemini.app.ocs.model.TelePositionPair;
import edu.gemini.app.ocs.model.ObservingProgram;
import edu.gemini.app.ocs.model.ObservingProgramConfigs;
public class _ObservingProgram {
    private int planNo;
    private String geminiLocation;
    private String opticsPrimary;
    private double fStop;
    private double opticsSecondaryRMS;
    private double scienceFoldMirrorDegree;
    private ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType;
    private int moduleContent;
    private ObservingProgramConfigs.CalibrationUnit calibrationUnit;
    private ObservingProgramConfigs.LightType lightType;
    private TelePositionPair[] telePositionPair;
    private boolean validationStatus;
    public _ObservingProgram() {
    }
    public _ObservingProgram(int planNo, String opticsPrimary, double fStop, double opticsSecondaryRMS, double scienceFoldMirrorDegree, ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType, int moduleContent, ObservingProgramConfigs.CalibrationUnit calibrationUnit, ObservingProgramConfigs.LightType lightType, TelePositionPair[] telePositionPair) {
        this.planNo = planNo;
        this.geminiLocation = "";
        this.opticsPrimary = opticsPrimary;
        this.fStop = fStop;
        this.opticsSecondaryRMS = opticsSecondaryRMS;
        this.scienceFoldMirrorDegree = scienceFoldMirrorDegree;
        this.moduleContent = moduleContent;
        this.calibrationUnit = calibrationUnit;
        this.lightType = lightType;
        this.telePositionPair = telePositionPair;
        this.validationStatus = false;
    }
    public int getPlanNo() {
        return this.planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public void createObservingProgram(OCS ocs){
        ObservingProgram op = ocs.createObservingProgram(ocs.getSciencePlanByNo(planNo), "GNZ",
                1.9, 7, 33, foldMirrorTypes[0],
                2, calibrationunits[1], lightTypes[1], telePositionPairs);
    }
}
