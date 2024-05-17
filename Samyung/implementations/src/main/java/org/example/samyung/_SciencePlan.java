package org.example.samyung;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.StarSystem;
import edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.AstronomicalData;
import edu.gemini.app.ocs.model.SciencePlan.STATUS;
import java.util.ArrayList;
import java.util.Date;

public class _SciencePlan {
        private int planNo;
        private String creator;
        private String submitter;
        private double fundingInUSD;
        private String objectives;
        private StarSystem.CONSTELLATIONS starSystem;
        private Date startDate;
        private Date endDate;
        private SciencePlan.TELESCOPELOC telescopeLocation;
        private DataProcRequirement dataProcRequirements;



        public _SciencePlan() {
        }
        public _SciencePlan(String creator, String submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
            this.creator = creator;
            this.submitter = submitter;
            this.fundingInUSD = fundingInUSD;
            this.objectives = objectives;
            this.starSystem = starSystem;
            this.startDate = startDate;
            this.endDate = endDate;
            this.telescopeLocation = telescopeLocation;
            this.dataProcRequirements = dataProcRequirements;

        }
        public void createScienePlan(OCS ocs){
            MySciencePlan mySP = new MySciencePlan();
            mySP.setCreator(creator);
            mySP.setSubmitter(submitter);
            mySP.setFundingInUSD(fundingInUSD);
            mySP.setObjectives(objectives);
            mySP.setStarSystem(starSystem);
            mySP.setStartDate(startDate);
            mySP.setTelescopeLocation(telescopeLocation);
            mySP.setEndDate(endDate);

            mySP.setDataProcRequirements(dataProcRequirements);
            // submit it to the OCS system
            ocs.createSciencePlan(mySP);
        }
        public String getCreator() {
            return this.creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getSubmitter() {
            return this.submitter;
        }

        public void setSubmitter(String submitter) {
            this.submitter = submitter;
        }
    public static enum TELESCOPELOC {
        HAWAII, CHILE;

        private TELESCOPELOC() { /* compiled code */ }
    }
}
