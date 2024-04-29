package th.ac.mahidol.ict.gemini2.repository;

import th.ac.mahidol.ict.gemini2.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}