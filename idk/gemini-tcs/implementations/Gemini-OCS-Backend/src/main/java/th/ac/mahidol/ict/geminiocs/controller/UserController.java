package th.ac.mahidol.ict.geminiocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.mahidol.ict.geminiocs.model.User;
import th.ac.mahidol.ict.geminiocs.repository.UserRepository;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Account already exists");
        }

        userRepository.save(user);

        return ResponseEntity.ok("Account created successfully");

    }

    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {

        User user1 = userRepository.findByUsername(user.getUsername());

        if (user1 == null) {
            return ResponseEntity.badRequest().body("Account does not exist");
        }

        if (!user1.getPassword().equals(user.getPassword())) {
            return ResponseEntity.badRequest().body("Incorrect password");
        }

        if (!user1.getRole().equals("astronomer")) {
            return ResponseEntity.badRequest().body("Authentication failed: not an astronomer");
        }

        return ResponseEntity.ok("Login successful");
    }

    @CrossOrigin
    @GetMapping("/getAllUsers")
    public ResponseEntity<Iterable<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

}
