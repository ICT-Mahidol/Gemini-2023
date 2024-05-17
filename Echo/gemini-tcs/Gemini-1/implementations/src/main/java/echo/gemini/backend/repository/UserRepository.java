package echo.gemini.backend.repository;

import org.springframework.data.repository.CrudRepository;
import echo.gemini.backend.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}