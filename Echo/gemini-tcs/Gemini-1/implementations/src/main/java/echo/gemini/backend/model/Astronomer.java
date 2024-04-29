package echo.gemini.backend.model;
//import edu.gemini.app.ocs.model.*;
//import edu.gemini.app.ocs.OCS;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Astronomer")
public class Astronomer extends User{
    @Column(name = "institution")
    private String institution;
    @Column(name = "academic_degree")
    private String academicDegree;
//    @ManyToMany
//    @JoinTable(
//            name ="science_plans",
//            joinColumns = @JoinColumn(name = "astronomer_id"),
//            inverseJoinColumns = @JoinColumn(name = "science_plan_no")
//    )
//    private List<SciencePlanEcho> sciencePlans = new ArrayList<>();
    public Astronomer() { }
    public Astronomer(Integer id ,String username, String password, String firstname,
                      String lastname, String role, String institution, String academicDegree) {
        super(id, username, password, firstname, lastname, role);
        this.institution = institution;
        this.academicDegree = academicDegree;
    }



    public String getInstitution() {
        return institution;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

//    public List<SciencePlanEcho> getSciencePlans() {
//        return sciencePlans;
//    }
//
//    public void addSciencePlans(SciencePlanEcho sciencePlan) {
//        sciencePlans.add(sciencePlan);
//    }

}
