package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "astronomer")
@Getter
@Setter
@NoArgsConstructor
public class Astronomer extends User {
    @ManyToMany(mappedBy = "creators")
    private List<SciencePlan> sciencePlans;

    private String institution;
    private String academicDegree;

    public Astronomer(String username, String password, String email, String firstName, String lastName, String role, String institution, String academicDegree) {
        super(username, password, email, firstName, lastName, role);
        this.institution = institution;
        this.academicDegree = academicDegree;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }
}
