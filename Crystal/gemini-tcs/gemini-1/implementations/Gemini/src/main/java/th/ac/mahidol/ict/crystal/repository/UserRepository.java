package th.ac.mahidol.ict.crystal.repository;
import org.springframework.data.repository.CrudRepository;
import  th.ac.mahidol.ict.crystal.model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
     public User findByUsernameAndPassword(String username,String password);
}