package com.example.demo.Services;

import com.example.demo.Models.Astronomer;
import com.example.demo.Repositories.AstronomerRepository;
import org.springframework.stereotype.Service;

@Service
public class AstronomerService {

    private final AstronomerRepository astronomerRepository;

    public AstronomerService(AstronomerRepository astronomerRepository) {
        this.astronomerRepository = astronomerRepository;
    }

    public Astronomer findById(int id) {
        return astronomerRepository.findById(id).orElseThrow(() -> new RuntimeException("Astronomer not found with id: " + id));
    }

    public void save(Astronomer astronomer) {
        astronomerRepository.save(astronomer);
    }

}
