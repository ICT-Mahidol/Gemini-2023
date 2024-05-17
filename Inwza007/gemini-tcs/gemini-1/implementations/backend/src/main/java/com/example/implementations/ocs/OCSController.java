package com.example.implementations.ocs;

import edu.gemini.app.ocs.model.SciencePlan;
import java.util.List;

public class OCSController {

    public OCSController() { }
    private OCS ocs = new OCS();

    public List<SciencePlan> getAllSciencePlans() {
        List<edu.gemini.app.ocs.model.SciencePlan> plans = this.ocs.getAllSciencePlans();

        return plans;
    }

    public edu.gemini.app.ocs.model.SciencePlan getSciencePlanByPlanNo(int id) {
        return this.ocs.getSciencePlanByNo(id);
    }

    public String testSciencePlan(edu.gemini.app.ocs.model.SciencePlan sp) {
        return this.ocs.testSciencePlan(sp);
    }

    public String createSciencePlan(edu.gemini.app.ocs.model.SciencePlan sp) {
        return this.ocs.createSciencePlan(sp);
    }
}
