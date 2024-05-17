package echo.gemini.backend.model;

import edu.gemini.app.ocs.model.ObservingProgramConfigs;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "OBSERVING_PROGRAM")
public class ObservingProgramEcho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private int planNo;

    @Column(name = "optics_primary")
    private String opticsPrimary;

    @Column(name = "f_stop")
    private double fStop;

    @Column(name = "optics_secondary_rms")
    private double opticsSecondaryRMS;

    @Column(name = "science_fold_mirror_degree")
    private double scienceFoldMirrorDegree;

    @Enumerated(EnumType.STRING)
    @Column(name = "science_fold_mirror_type")
    private ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType;

    @Column(name = "module_content")
    private int moduleContent;

    @Enumerated(EnumType.STRING)
    @Column(name = "calibration_unit")
    private ObservingProgramConfigs.CalibrationUnit calibrationUnit;

    @Enumerated(EnumType.STRING)
    @Column(name = "light_type")
    private ObservingProgramConfigs.LightType lightType;

//    @OneToMany(
//            mappedBy = "observingProgram",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<TelePositionPair> telePositionPair = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "telePositionPair_id", referencedColumnName = "id")
    private TelePositionPairEcho telePositionPair;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "observer_id")
//    private Observer observer;

    @ManyToOne
    @JoinColumn(name = "observer_id")
    private Observer observer;

    @OneToOne
    @JoinColumn(name = "sciencePlan_id", referencedColumnName = "planNo")
    private SciencePlanEcho sciencePlanEcho;


    public ObservingProgramEcho(int planNo, String opticsPrimary, double fStop,
                                double opticsSecondaryRMS, double scienceFoldMirrorDegree,
                                ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType,
                                int moduleContent,
                                ObservingProgramConfigs.CalibrationUnit calibrationUnit,
                                ObservingProgramConfigs.LightType lightType,
                                TelePositionPairEcho telePositionPair) {
        this.planNo = planNo;
        this.opticsPrimary = opticsPrimary;
        this.fStop = fStop;
        this.opticsSecondaryRMS = opticsSecondaryRMS;
        this.scienceFoldMirrorDegree = scienceFoldMirrorDegree;
        this.scienceFoldMirrorType = scienceFoldMirrorType;
        this.moduleContent = moduleContent;
        this.calibrationUnit = calibrationUnit;
        this.lightType = lightType;
        this.telePositionPair = telePositionPair;
    }

    public ObservingProgramEcho() {

    }

    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public String getOpticsPrimary() {
        return opticsPrimary;
    }

    public void setOpticsPrimary(String opticsPrimary) {
        this.opticsPrimary = opticsPrimary;
    }

    public double getfStop() {
        return fStop;
    }

    public void setfStop(double fStop) {
        this.fStop = fStop;
    }

    public double getOpticsSecondaryRMS() {
        return opticsSecondaryRMS;
    }

    public void setOpticsSecondaryRMS(double opticsSecondaryRMS) {
        this.opticsSecondaryRMS = opticsSecondaryRMS;
    }

    public double getScienceFoldMirrorDegree() {
        return scienceFoldMirrorDegree;
    }

    public void setScienceFoldMirrorDegree(double scienceFoldMirrorDegree) {
        this.scienceFoldMirrorDegree = scienceFoldMirrorDegree;
    }

    public ObservingProgramConfigs.FoldMirrorType getScienceFoldMirrorType() {
        return scienceFoldMirrorType;
    }

    public void setScienceFoldMirrorType(ObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType) {
        this.scienceFoldMirrorType = scienceFoldMirrorType;
    }

    public ObservingProgramConfigs.CalibrationUnit getCalibrationUnit() {
        return calibrationUnit;
    }

    public void setCalibrationUnit(ObservingProgramConfigs.CalibrationUnit calibrationUnit) {
        this.calibrationUnit = calibrationUnit;
    }

    public ObservingProgramConfigs.LightType getLightType() {
        return lightType;
    }

    public void setLightType(ObservingProgramConfigs.LightType lightType) {
        this.lightType = lightType;
    }

    public int getModuleContent() {
        return moduleContent;
    }

    public void setModuleContent(int moduleContent) {
        this.moduleContent = moduleContent;
    }

    public void setFStop(double fStop) {
        this.fStop = fStop;
    }

//    public List<TelePositionPair> getTelePositionPairs() {
//        return telePositionPair;
//    }

public TelePositionPairEcho getTelePositionPairs() {
    return telePositionPair;
}

    public int getObservingprogramId() {
        return planNo;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public void setSciencePlan(SciencePlanEcho sciencePlanEcho) {
        this.sciencePlanEcho = sciencePlanEcho;
    }

    public SciencePlanEcho getSciencePlan() {
        return sciencePlanEcho;
    }


    public void setTelePositionPair(TelePositionPairEcho telePositionPair) {
        this.telePositionPair = telePositionPair;
    }
}
