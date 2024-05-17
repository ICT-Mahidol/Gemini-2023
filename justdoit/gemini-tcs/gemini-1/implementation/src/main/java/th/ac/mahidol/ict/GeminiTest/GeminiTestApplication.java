package th.ac.mahidol.ict.GeminiTest;

import edu.gemini.app.ocs.OCS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeminiTestApplication {

	public static void main(String[] args) {
		OCS ocs = new OCS(true);
		System.out.println("ocs");
		System.out.println(ocs.getAllSciencePlans());
		SpringApplication.run(GeminiTestApplication.class, args);
	}

}
