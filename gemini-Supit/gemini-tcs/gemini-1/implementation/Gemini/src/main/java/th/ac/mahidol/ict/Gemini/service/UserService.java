package th.ac.mahidol.ict.Gemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.mahidol.ict.Gemini.model.User;
import th.ac.mahidol.ict.Gemini.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void registerUser(String username, String password) {
        if (userRepository.findByUsername(username) != null) {
            throw new RuntimeException("Username already exists");
        }
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);

        userRepository.save(u);
    }
}
