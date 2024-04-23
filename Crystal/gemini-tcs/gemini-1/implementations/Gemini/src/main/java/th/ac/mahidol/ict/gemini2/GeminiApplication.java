package th.ac.mahidol.ict.gemini2;

import edu.gemini.app.ocs.OCS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GeminiApplication {

	public static void main(String[] args) {
		OCS ocs = new OCS(true);
		System.out.println("ocs");
		System.out.println(ocs.getAllSciencePlans());
		SpringApplication.run(GeminiApplication.class, args);
	}

}

