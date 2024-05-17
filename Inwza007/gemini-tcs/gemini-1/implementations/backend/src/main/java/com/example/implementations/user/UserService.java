package com.example.implementations.user;

import com.example.implementations.models.ApiResponse;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;


@Service
public class UserService {

    private final String dbUrl = "jdbc:h2:./ocs;MV_STORE=TRUE";

    public ResponseEntity<?> createUser(User user) {
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("INSERT INTO users (email, password, name, profileImg, role) VALUES (?, ?, ?, ?, ?)");) {

            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getProfileImg());
            statement.setString(5, user.getRole().toString());

            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setuserID(generatedKeys.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

        ApiResponse<?> response = new ApiResponse<>(200, user);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<?> getUserById(int id) {
        User user = new User("","","","");
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE user_id = ?");) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user.setuserID(resultSet.getInt("user_id"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setProfileImg(resultSet.getString("profileImg"));
                user.setRole(User.Role.valueOf(resultSet.getString("role")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

        ApiResponse<?> response = new ApiResponse<>(200, user);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<?> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");) {

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = new User("","","","");
                user.setuserID(resultSet.getInt("user_id"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setProfileImg(resultSet.getString("profileImg"));
                user.setRole(User.Role.valueOf(resultSet.getString("role")));
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

        ApiResponse<?> response = new ApiResponse<>(200, users);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<?> updateUser(int id, User user) {
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("UPDATE users SET email = ?, password = ?, name = ?, profileImg = ?, role = ? WHERE user_id = ?");) {

            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getProfileImg());
            statement.setString(5, user.getRole().toString());
            statement.setInt(6, id);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

        ApiResponse<?> response = new ApiResponse<>(200, user);
        return ResponseEntity.ok(response);
    }

    public void deleteUser(int id) {
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE user_id = ?");) {

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResponseEntity<?> loginUser(String email, String password) {
        String retrievedEmail = null;
        String retrievedPassword = null;
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("SELECT email, password FROM users WHERE email = ?");) {

            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                retrievedEmail = resultSet.getString("email");
                retrievedPassword = resultSet.getString("password");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

        // Check if user exists and passwords match (assuming secure password storage)
        if (retrievedEmail == null || !retrievedPassword.equals(password)) {
            ApiResponse<String> errorResponse = new ApiResponse<>(401, "Invalid email or password");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
        }

        // Generate JWT token on successful login (assuming JWT configuration)
        User retrievedUser = new User(retrievedEmail, null, null, null); // Create a user object with only email
        String jwtToken = JwtUtil.generateToken(retrievedUser); // Using the updated JwtUtil class

        ApiResponse<?> response = new ApiResponse<>(200, jwtToken);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<?> getUserByEmail(String email) {
        User user = new User("", "", "", "");
        try (Connection connection = DriverManager.getConnection(dbUrl, "sa", "");
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE email = ?");) {

            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user.setuserID(resultSet.getInt("user_id"));
                user.setEmail(resultSet.getString("email"));
                user.setName(resultSet.getString("name"));
                user.setProfileImg(resultSet.getString("profileImg"));
                user.setRole(User.Role.valueOf(resultSet.getString("role")));
            } else {
                ApiResponse<String> errorResponse = new ApiResponse<>(404, "User not found");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ApiResponse<String> errorResponse = new ApiResponse<>(500, e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

        ApiResponse<?> response = new ApiResponse<>(200, user);
        return ResponseEntity.ok(response);
    }


    public void logoutUser(User user) {
        return ;
    }



    public class JwtUtil {

        private static final String SECRET_KEY = "secret_key-123";
        private static final long EXPIRATION_TIME = 900000; // 15 minutes

        public static String generateToken(User user) {
            return Jwts.builder()
                    .setSubject(user.getEmail())
                    .claim("roles", user.getRole().name())
                    .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .signWith(SignatureAlgorithm.HS512, Base64.getEncoder().encodeToString(SECRET_KEY.getBytes()))
                    .compact();
        }

        public static Claims getClaims(String token) {
            return Jwts.parser().setSigningKey(Base64.getEncoder().encodeToString(SECRET_KEY.getBytes())).parseClaimsJws(token).getBody();
        }

        public static boolean validateToken(String token) {
            try {
                Jwts.parser().setSigningKey(Base64.getEncoder().encodeToString(SECRET_KEY.getBytes())).parseClaimsJws(token);
                return true;
            } catch (Exception ex) {
                return false;
            }
        }

        public static String getUsernameFromToken(String token) {
            Claims claims = getClaims(token);
            return claims.getSubject();
        }
    }
}
