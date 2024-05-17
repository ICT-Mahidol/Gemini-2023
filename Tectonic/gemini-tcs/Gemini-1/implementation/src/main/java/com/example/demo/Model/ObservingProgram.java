package com.example.demo.Model;

import edu.gemini.app.ocs.model.ObservingProgramConfigs;
import edu.gemini.app.ocs.model.TelePositionPair;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class ObservingProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public ObservingProgram(int planNo, String opticsPrimary, double fStop, double opticsSecondaryRMS,
                            double scienceFoldMirrorDegree, ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType,
                            int moduleContent, ObservingProgramConfigs.CalibrationUnit calibrationUnit,
                            ObservingProgramConfigs.LightType lightType, TelePositionPair[] telePositionPair) {
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

    public boolean getValidationStatus() {
        return validationStatus;
    }

    public ObservingProgram validateObservingCondition(ObservingProgram op) {
        String opticPriGN = "GNZ";
        String opticPriGS = "GSZ";
        double fStopGNMin = 1.8;
        double fStopGNMax = 8.1;
        double fStopGSMin = 2.9;
        double fStopGSMax = 18.0;
        double opticSecNMin = 5.0;
        double opticSecNMax = 17.0;
        double opticSecSMin = 5.0;
        double opticSecSMax = 13.0;
        double sciFoldDegreeMin = 30.0;
        double sciFoldDegreeMax = 45.0;
        double movDirMin = 0.0;
        double movDirMax = 360.0;
        double movDegMin = 0.0;
        double movDegMax = 70.0;
        boolean validStatus = false;
        String geminiLoc = op.getGeminiLocation();
        String errMsg = "";
        String opticPriValue = op.getOpticsPrimary();
        double opticSecRMS = op.getOpticsSecondaryRMS();
        double fStopValue = op.getFStop();
        double scienceFoldValue = op.getScienceFoldMirrorDegree();
        if (!"GNZ".equals(opticPriValue) && !"GSZ".equals(opticPriValue)) {
            validStatus = false;
            errMsg = "OpticPrimary is not correct.";
        } else if (opticPriValue.equals("GNZ")) {
            if (fStopValue >= 1.8 && fStopValue <= 8.1) {
                validStatus = true;
                errMsg = "Validate: true";
            } else {
                validStatus = false;
                errMsg = "f-stop out of range.";
            }
        } else if (fStopValue >= 2.9 && fStopValue <= 18.0) {
            validStatus = true;
            errMsg = "Validate: true";
        } else {
            validStatus = false;
            errMsg = "f-stop out of range.";
        }

        if (validStatus) {
            if (geminiLoc == "N") {
                if (opticSecRMS >= 5.0 && opticSecRMS <= 17.0) {
                    validStatus = true;
                    errMsg = "Validate: true";
                } else {
                    validStatus = false;
                    errMsg = "OpticsSecondary(rms surface) out of range.";
                }
            } else if (opticSecRMS >= 5.0 && opticSecRMS <= 13.0) {
                validStatus = true;
                errMsg = "Validate: true";
            } else {
                validStatus = false;
                errMsg = "OpticsSecondary(rms surface) out of range.";
            }
        }

        if (validStatus) {
            if (scienceFoldValue >= 30.0 && scienceFoldValue <= 45.0) {
                validStatus = true;
                errMsg = "Validate: true";
            } else {
                validStatus = false;
                errMsg = "Science Fold Mirror degree out of range.";
            }
        }

        if (validStatus) {
            TelePositionPair[] telePositionPairs = op.getTelePositionPair();
            TelePositionPair[] var43 = telePositionPairs;
            int var44 = telePositionPairs.length;

            for(int var45 = 0; var45 < var44; ++var45) {
                TelePositionPair tp = var43[var45];
                if (!(tp.getDirection() >= 0.0) || !(tp.getDirection() <= 360.0)) {
                    validStatus = false;
                    errMsg = "Direction out of range.";
                    break;
                }

                if (!(tp.getDegree() <= 70.0)) {
                    validStatus = false;
                    errMsg = "Degree out of range.";
                    break;
                }

                validStatus = true;
                errMsg = "Validate: true";
            }
        }

        if (validStatus) {
            op.setValidationStatus(true);
        } else {
            op.setValidationStatus(false);
        }

        System.out.println(errMsg);
        return op;
    }

}
