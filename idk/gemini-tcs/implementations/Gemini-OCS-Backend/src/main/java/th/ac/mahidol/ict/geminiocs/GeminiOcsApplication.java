package th.ac.mahidol.ict.geminiocs;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class GeminiOcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeminiOcsApplication.class, args);

		// OCS ocs = new OCS();
		// ArrayList<SciencePlan> sciencePlans = ocs.getAllSciencePlans();
		// for (SciencePlan sp : sciencePlans) {
		// 	System.out.println(sp);
		// }
	}

}
