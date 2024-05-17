package th.ac.mahidol.ict.Gemini.repository;

import org.springframework.data.repository.CrudRepository;
import th.ac.mahidol.ict.Gemini.model.User;

public interface SciPlanRepository extends CrudRepository<User, Integer> {
}
