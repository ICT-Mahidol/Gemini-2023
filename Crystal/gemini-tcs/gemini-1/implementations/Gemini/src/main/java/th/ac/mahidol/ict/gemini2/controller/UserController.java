package th.ac.mahidol.ict.gemini2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import th.ac.mahidol.ict.gemini2.repository.UserRepository;
import th.ac.mahidol.ict.gemini2.model.*;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String login(){
        return "login"; // This assumes that login.html is in src/main/resources/templates directory
    }


    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/astronomer")
    public String astronomer(){
        return "astronomer";
    }

    @GetMapping("/observer")
    public String observer(){
        return "observer";
    }

    @GetMapping("/create_scienceplan")
    public String create_scienceplan(){
        return "createscienceplan";
    }

    @GetMapping("/test_scienceplan")
    public String test_scienceplan(){
        return "testscienceplan";
    }

    @GetMapping("/collect_astronomical_data")
    public String collect_astronomical_data(){
        return "collect";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/usersname")
    public String getUser(@RequestParam(value = "id") int id){
        User user = userRepository.findById(id).orElse(null);
        return user != null ? user.getUserAccountName() : "User not found";
    }

    @GetMapping("/getperms")
    public Integer getUserPermission(@RequestParam(value = "id") int id){
        User user = userRepository.findById(id).orElse(null);
        if (user != null && "Astronomer".equals(user.getUserPermission())) {
            return 1;
        }
        return 2;
    }

    @PostMapping("/adduser")
    public int addUser(@RequestBody Map<String, Object> body) {
        // Your code to add a new user
        return 0;
    }

    @PostMapping("/login")
    public int login(@RequestParam(value = "username") String username,
                     @RequestParam(value = "password") String password) {
        // Your code to authenticate the user
        return 0;
    }

    public User createUser(Map<String, Object> body) {
        int id = (int) (userRepository.count() + 1);
        String userUsername = body.get("userUsername").toString();
        String userPassword = body.get("userPassword").toString();
        String userAccountname = body.get("userAccountName").toString();
        String userPermission = body.get("userPermission").toString();

        if (body.get("userPermission").toString().equals("Astronomer")) {
            return new Astronomer(id, userUsername, userPassword, userPermission, userAccountname);
        } else {
            return new Observer(id, userUsername, userPassword, userPermission, userAccountname);
        }
    }
}
