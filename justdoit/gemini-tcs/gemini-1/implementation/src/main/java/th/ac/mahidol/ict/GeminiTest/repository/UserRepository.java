package th.ac.mahidol.ict.GeminiTest.repository;

import th.ac.mahidol.ict.GeminiTest.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
