package com.example.demo.Controllers;

import com.example.demo.Models.Astronomer;
import com.example.demo.Models.User;
import com.example.demo.Services.AstronomerService;
import com.example.demo.Services.UserService;
import edu.gemini.app.ocs.OCS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;


@Controller
public class UserController {
    OCS ocs = new OCS();

    @Autowired
    private UserService userService;


    @Autowired
    private AstronomerService astronomerService;

    @GetMapping("/")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user,@RequestParam(required = false) String institution, @RequestParam(required = false) String academicDegree, RedirectAttributes redirectAttributes) {
        if (userService.existsByUsername(user.getUsername())) {
            redirectAttributes.addFlashAttribute("message", "Username already exists!");
            return "redirect:/register";
        }
        if ("astronomer".equalsIgnoreCase(user.getRole())) {
            Astronomer astronomer = new Astronomer(user.getUsername(), user.getPassword(), user.getEmail(), user.getFirstName(), user.getLastName(), user.getRole(),institution, academicDegree);
            userService.save(astronomer);
            astronomerService.save(astronomer);
        } else {
            userService.save(user);
        }
        return "redirect:/";
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestParam String username, @RequestParam String password) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            Map<String, Object> userInfo = new HashMap<>();
            userInfo.put("username", user.getUsername());
            userInfo.put("fullName", user.getFullname());
            return ResponseEntity.ok().body(userInfo);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password!");
        }
    }


}
