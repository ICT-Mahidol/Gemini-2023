package th.ac.mahidol.ict.gemini_david.service;

import org.springframework.stereotype.Service;
import th.ac.mahidol.ict.gemini_david.model.User;
import th.ac.mahidol.ict.gemini_david.model.UserExampleGen;

import java.util.ArrayList;

@Service
public class UserService {
    UserExampleGen userExampleGen = new UserExampleGen();
    ArrayList<User> users = userExampleGen.generateUsers();

    public boolean authenticate(String username, String password) {
        User user = null;
        for (User i : users) {
            if (i.getUsername().equals(username)) {
                user = i;
            }
        }
        assert user != null;
        return user.getPassword().equals(password);
    }
    
    
}
