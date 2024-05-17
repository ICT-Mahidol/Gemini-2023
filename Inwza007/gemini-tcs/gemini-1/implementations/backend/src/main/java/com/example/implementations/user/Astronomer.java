package com.example.implementations.user;

public class Astronomer extends User {
    public Astronomer(String email, String password, String name, String profileImg) {
        super(email, password, name, profileImg);
        setRole(Role.ASTRONOMER);
    }
}
