package com.example.demo.Repositories;

import com.example.demo.Models.Astronomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AstronomerRepository extends JpaRepository<Astronomer, Integer> {


}
