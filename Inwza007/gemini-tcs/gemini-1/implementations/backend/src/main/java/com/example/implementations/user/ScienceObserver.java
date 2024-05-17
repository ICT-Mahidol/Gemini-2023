package com.example.implementations.user;

public class ScienceObserver extends User {
    public ScienceObserver(String email, String password, String name, String profileImg) {
        super(email, password, name, profileImg);
        setRole(Role.SCIENCEOBSERVER);
    }
}