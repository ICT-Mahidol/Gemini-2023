package com.example.implementations.user;

import com.example.implementations.models.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Map<String, String> requestBody) {
        String email = requestBody.get("email");
        String password = requestBody.get("password");
        return userService.loginUser(email, password);
    }
    @PostMapping("/logout")
    public void logoutUser(@RequestBody User user) {

    }

    @GetMapping("/me")
    public ResponseEntity<?> getUserInfoFromToken(HttpServletRequest request) {
        String authorizationHeader = request.getHeader("Authorization");
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            String token = authorizationHeader.substring(7);
            if (UserService.JwtUtil.validateToken(token)) {
                String email = UserService.JwtUtil.getUsernameFromToken(token);
                return userService.getUserByEmail(email);
            } else {
                ApiResponse<String> errorResponse = new ApiResponse<>(401, "Invalid or expired token");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
            }
        }

        ApiResponse<String> errorResponse = new ApiResponse<>(400, "No token provided");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}