package th.ac.mahidol.ict.Gemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import th.ac.mahidol.ict.Gemini.repository.UserRepository;
import th.ac.mahidol.ict.Gemini.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //private UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(username, password);
        return "redirect:/login";
    }
}

    //public @ResponseBody String welcome() {
        // show the welcome page at the root
        //return "Welcome to the Gemini application"; }
