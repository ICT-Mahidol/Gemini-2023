package com.example.demo.Repositories;

import com.example.demo.Models.Astronomer;
import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Astronomer findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    void deleteById(int uid);

}