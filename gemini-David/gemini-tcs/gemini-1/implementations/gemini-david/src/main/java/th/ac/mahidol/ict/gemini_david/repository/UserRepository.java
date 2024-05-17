package th.ac.mahidol.ict.gemini_david.repository;

import org.springframework.data.repository.CrudRepository;
import th.ac.mahidol.ict.gemini_david.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
