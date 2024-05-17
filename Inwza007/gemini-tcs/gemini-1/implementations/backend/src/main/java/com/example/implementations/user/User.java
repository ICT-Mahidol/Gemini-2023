package com.example.implementations.user;


public class User {
    public enum Role {
    USER,  
    ASTRONOMER, 
    SCIENCEOBSERVER;
    }

    private int userID;
    private String profileImg;
    private String name;
    private String email;
    private String password;
    private Role role;
    public User(String email, String password, String name, String profileImg){
        this.profileImg = profileImg;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = Role.USER;
    }

    public int getuserID() {
        return userID;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() { return role ; }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setuserID(int userID){
        this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
}
