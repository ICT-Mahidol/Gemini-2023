package echo.gemini.backend.model;
import jakarta.persistence.*;
//import edu.gemini.app.ocs;
//import edu.gemini.app.ocs.model.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Observer")
public class Observer extends User {
    @Column(name = "academic_degree")
    private String academicDegree;
    @Column(name = "employmentDate")
    private String employmentDate;
    @Column(name = "salary")
    private double salary;

//    @OneToMany
//    @JoinColumn(name = "observing_program_id", referencedColumnName = "planNo")
//    private List<ObservingProgramEcho> observingProgramEcho;


//    @OneToMany (fetch = FetchType.LAZY, mappedBy = "observer")
//    private List<ObservingProgramEcho> observingProgramEcho;

//    @OneToMany(
//            mappedBy = "observer",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true)
//    private List<ObservingProgramEcho> observingProgramEcho = new ArrayList<>();

    public Observer() { }

    public Observer(Integer id ,String username, String password, String firstname,
                    String lastname, String role, String academicDegree, String employmentDate, double salary) {
        super(id, username, password, firstname, lastname, role);
        this.academicDegree = academicDegree;
        this.employmentDate = employmentDate;
        this.salary = salary;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int observerId) {
    }
}