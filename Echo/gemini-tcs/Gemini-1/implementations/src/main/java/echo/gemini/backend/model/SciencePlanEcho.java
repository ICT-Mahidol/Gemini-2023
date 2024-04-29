package echo.gemini.backend.model;

import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "science_plan")
public class SciencePlanEcho {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name = "plan_no")
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private Integer planNo;

    @Column(name = "creator")
    private String creator;

    @Column(name = "submitter")
    private String submitter;

    @Column(name = "funding_in_usd")
    private double fundingInUSD;

    @Column(name = "objectives")
    private String objectives;

    @Enumerated(EnumType.STRING)
    @Column(name = "star_system")
    private StarSystem.CONSTELLATIONS starSystem;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    private SciencePlan.TELESCOPELOC TELESCOPELOC;

    @OneToOne
    @JoinColumn(name="dataProcRequirements_id", referencedColumnName = "id")
    private DataProcRequirementEcho dataProcRequirementsEcho;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

//    @ManyToMany(mappedBy = "sciencePlans")
//    private List<Astronomer> astronomers = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name ="science_plans_astro",
            joinColumns = @JoinColumn(name = "astronomer_id"),
            inverseJoinColumns = @JoinColumn(name = "science_plan_no")
    )
    private List<Astronomer> astronomers = new ArrayList<>();

//    @OneToOne
//    @JoinColumn(name = "observing_program_id", referencedColumnName = "planNo")
//    private ObservingProgramEcho observingProgramEcho;

//    @OneToOne
//    @JoinColumn(name = "observing_id")
//    private ObservingProgramEcho observingProgramEcho;

//    public SciencePlanEcho(Integer planNo, String creator, String submitter, Double fundingInUSD, String objectives, Constellation starSystem, Date startDate, Date endDate, TELESCOPELOC TELESCOPELOC, DataProcRequirementEcho dataProcRequirementsEcho, Status status) {
//        this.planNo = planNo;
//        this.creator = creator;
//        this.submitter = submitter;
//        this.fundingInUSD = fundingInUSD;
//        this.objectives = objectives;
//        this.starSystem = starSystem;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.TELESCOPELOC = TELESCOPELOC;
//      this.dataProcRequirementsEcho = dataProcRequirementsEcho;
//        this.status = status;
//    }

public SciencePlanEcho(String creator, String submitter, Double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, SciencePlan.TELESCOPELOC TELESCOPELOC, DataProcRequirementEcho dataProcRequirementsEcho, Status status) {
    this.creator = creator;
    this.submitter = submitter;
    this.fundingInUSD = fundingInUSD;
    this.objectives = objectives;
    this.starSystem = starSystem;
    this.startDate = startDate;
    this.endDate = endDate;
    this.TELESCOPELOC = TELESCOPELOC;
    this.dataProcRequirementsEcho = dataProcRequirementsEcho;
    this.status = status;
}

    public SciencePlanEcho() {
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

    public StarSystem.CONSTELLATIONS getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(StarSystem.CONSTELLATIONS starSystem) {
        this.starSystem = starSystem;
    }

    public String getStartDate() {
        String sDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

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
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

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
        return TELESCOPELOC;
    }

    public void setTelescopeLocation(SciencePlan.TELESCOPELOC TELESCOPELOC) {
        this.TELESCOPELOC = TELESCOPELOC;
    }

//     public ArrayList<DataProcRequirement> getDataProcRequirements() {
//        return this.dataProcRequirements;
//    }
    public DataProcRequirementEcho getDataProcRequirements() {
        return dataProcRequirementsEcho;
    }

    public void setDataProcRequirements(DataProcRequirementEcho dataProcRequirementsEcho) {
        this.dataProcRequirementsEcho = dataProcRequirementsEcho;
    }

    public int getPlanNo() {
        return planNo;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Astronomer> getAstronomers() {
        return astronomers;
    }
    public void addAstronomers(Astronomer astronomer) {
        astronomers.add(astronomer);
    }

    public void setId(int sciencePlanId) {
    this.planNo = sciencePlanId;
    }

//    public AstronomicalData retrieveAstroData(ArrayList<String> imgURL) throws IOException {
//        return this.astroData.getAstronomicalData(imgURL);
//    }
//
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        } else if (o != null && this.getClass() == o.getClass()) {
//            SciencePlan that = (SciencePlan)o;
//            return this.planNo == that.planNo && Double.compare(that.fundingInUSD, this.fundingInUSD) == 0 && this.creator.equals(that.creator) && this.submitter.equals(that.submitter) && this.objectives.equals(that.objectives) && this.starSystem == that.starSystem && this.startDate.equals(that.startDate) && this.endDate.equals(that.endDate) && this.TELESCOPELOC == that.TELESCOPELOC && Objects.equals(this.dataProcRequirements, that.dataProcRequirements) && Objects.equals(this.astroData, that.astroData) && this.status == that.status;
//        } else {
//            return false;
//        }
//    }
//
//    public int hashCode() {
//        return Objects.hash(new Object[]{this.planNo, this.creator, this.submitter, this.fundingInUSD, this.objectives, this.starSystem, this.startDate, this.endDate, this.TELESCOPELOC, this.dataProcRequirements, this.astroData, this.status});
//    }
//
//    public String toString() {
//        if (this.creator != null && this.submitter != null && this.objectives != null && this.starSystem != null && this.startDate != null && this.endDate != null && this.TELESCOPELOC != null && this.dataProcRequirements != null && this.status != null) {
//            int var10000 = this.planNo;
//            return "{planNo=" + var10000 + ", creator='" + this.creator + "', submitter='" + this.submitter + "', fundingInUSD=" + this.fundingInUSD + ", objectives='" + this.objectives + "', starSystem=" + String.valueOf(this.starSystem) + ", startDate=" + (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(this.startDate) + ", endDate=" + (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(this.endDate) + ", TELESCOPELOC='" + String.valueOf(this.TELESCOPELOC) + "', status='" + String.valueOf(this.status) + "', " + String.valueOf(this.dataProcRequirements) + "}\n";
//        } else {
//            return "ERROR: Cannot print the science plan. Some of the attributes are null.";
//        }
//    }

    public static enum TELESCOPELOC {
        HAWAII,
        CHILE;

        private TELESCOPELOC() {
        }
    }

    public static enum STATUS {
        SAVED,
        COMPLETE,
        TESTED,
        CANCELLED,
        RUNNING,
        SUBMITTED,
        VALIDATED,
        INVALIDATED;

        private STATUS() {
        }
    }
};
