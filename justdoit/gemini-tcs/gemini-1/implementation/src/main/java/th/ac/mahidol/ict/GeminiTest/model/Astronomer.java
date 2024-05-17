package th.ac.mahidol.ict.GeminiTest.model;


import java.util.ArrayList;
import java.util.Map;

import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Astronomer")
public class Astronomer extends User {

    public Astronomer() { }
    public Astronomer(int userId, String userUsername, String userPassword, String userPermission, String userAccountName) {
        super(userId, userUsername, userPassword, userPermission, userAccountName);
    }
	// Java Server-Side Code to Match HTML Form Input
	public SciencePlan createSciencePlan(Map<String, Object> body) {
		SciencePlan mySP = new SciencePlan();

		mySP.setCreator(body.get("creator").toString());
		mySP.setSubmitter(body.get("submitter").toString());
		mySP.setFundingInUSD(Double.parseDouble(body.get("funding").toString()));
		mySP.setObjectives(body.get("objectives").toString());
		mySP.setStarSystem(StarSystem.CONSTELLATIONS.valueOf(body.get("starSystem").toString()));
		mySP.setTelescopeLocation(SciencePlan.TELESCOPELOC.valueOf(body.get("telescopeLocation").toString()));

		mySP.setStartDate(body.get("startDate").toString());
		mySP.setEndDate(body.get("endDate").toString());

		ocs.createSciencePlan(mySP);

		return mySP;
	}

	public String testSciencePlan(SciencePlan sp){
		return ocs.testSciencePlan(sp);
	}

}
