package th.ac.mahidol.ict.geminiocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.mahidol.ict.geminiocs.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}



