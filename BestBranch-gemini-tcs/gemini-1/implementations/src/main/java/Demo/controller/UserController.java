package Demo.controller;

import Demo.model.User;
import Demo.repository.user.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private static User loginUser;

    public static User getLoginUser() {
        return loginUser;
    }

    @GetMapping("/login")
    public String loginForm() {
        return "index";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam("email") String email,
                              @RequestParam("password") String password,
                              Model model, HttpSession session) {
        Optional<User> user = userRepository.findById(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            session.setAttribute("loggininUser", user.get());
            this.loginUser = user.get();
            return "redirect:/dashboard";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/register")
    public String handleregister(@RequestParam("regisemail") String regisemail,
                              @RequestParam("regispassword") String regispassword, @RequestParam("regisname") String regisname,
                              Model model) {
        if (userRepository.findById(regisemail).isPresent()) {
            return "redirect:/login";
        }
        User newUser = new User(regisemail, regispassword, regisname);
        userRepository.save(newUser);
        model.addAttribute("message", "Registration successful!");
        return "redirect:/login";
    }

}
