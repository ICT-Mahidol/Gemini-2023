package org.example.samyung;
import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;

import java.util.ArrayList;
import java.util.List;
public class Astronomer extends User {
    private String name;
    private List<MySciencePlan> sciencePlans;
    public Astronomer(String name, int userID, String username, String password, String roles, int accessLevel) {
        super(userID, username, password, roles, accessLevel);
        this.name = name;
        this.sciencePlans = new ArrayList<>();
    }

    public void addSciencePlan(MySciencePlan plan) {
        sciencePlans.add(plan);
    }

    public void removeSciencePlan(MySciencePlan plan) {
        sciencePlans.remove(plan);
    }

    public List<MySciencePlan> getSciencePlans() {
        return sciencePlans;
    }


}


