package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;
    
    private String role;
    private String email;
    private String password;
    
    public User() {
    }
    
    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
    
    public long getUserID() {
        return userID;
    }
    
    public void setUserID(long userID) {
        this.userID = userID;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}