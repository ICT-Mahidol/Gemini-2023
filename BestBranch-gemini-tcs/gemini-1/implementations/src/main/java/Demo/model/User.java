package Demo.model;

import Demo.model.OurSciencePlan;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    private String email;

    private String password;
    private String name;

    public List<OurSciencePlan> getSciencePlans() {
        return sciencePlans;
    }

    public void setSciencePlans(List<OurSciencePlan> sciencePlans) {
        this.sciencePlans = sciencePlans;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_science_plans",
            joinColumns = @JoinColumn(name = "user_email", referencedColumnName = "email"),
            inverseJoinColumns = @JoinColumn(name = "plan_no", referencedColumnName = "planNo")
    )
    private List<OurSciencePlan> sciencePlans;

    public User() {
        this.email = "";
        this.password = "";
        this.name = "";
    }

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}