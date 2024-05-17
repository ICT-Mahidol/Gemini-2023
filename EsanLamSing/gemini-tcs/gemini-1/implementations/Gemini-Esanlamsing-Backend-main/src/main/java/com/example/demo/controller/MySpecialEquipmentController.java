package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.MySpecialEquipment;
import com.example.demo.repository.MySpecialEquipmentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipment")
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allow requests from all origins
public class MySpecialEquipmentController {

    @Autowired
    private MySpecialEquipmentRepository specialEquipmentRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addEquipment(@RequestBody MySpecialEquipment equipment) {
        // Check if the equipment already exists
        Optional<MySpecialEquipment> existingEquipment = specialEquipmentRepository.findByEquipmentName(equipment.getEquipmentName());
        if (existingEquipment.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Equipment already exists!");
        }

        // Save the new equipment
        specialEquipmentRepository.save(equipment);
        return ResponseEntity.ok("Equipment added successfully!");
    }

    @GetMapping("/all")
    public ResponseEntity<List<MySpecialEquipment>> getAllEquipment() {
        List<MySpecialEquipment> equipmentList = specialEquipmentRepository.findAll();
        return ResponseEntity.ok(equipmentList);
    }

    @GetMapping("/{equipmentName}")
    public ResponseEntity<MySpecialEquipment> getEquipmentByName(@PathVariable String equipmentName) {
        Optional<MySpecialEquipment> equipment = specialEquipmentRepository.findByEquipmentName(equipmentName);
        if (equipment.isPresent()) {
            return ResponseEntity.ok(equipment.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{equipmentName}")
public ResponseEntity<String> editEquipment(@PathVariable String equipmentName, @RequestBody MySpecialEquipment updatedEquipment) {
    Optional<MySpecialEquipment> existingEquipment = specialEquipmentRepository.findByEquipmentName(equipmentName);
    if (existingEquipment.isPresent()) {
        MySpecialEquipment equipment = existingEquipment.get();
        // Update the properties of the existing equipment
        equipment.setEquipmentName(updatedEquipment.getEquipmentName());
        equipment.setOwnerName(updatedEquipment.getOwnerName());
        equipment.setInstalledDate(updatedEquipment.getInstalledDate());
        // Save the updated equipment
        specialEquipmentRepository.save(equipment);
        return ResponseEntity.ok("Equipment updated successfully!");
    } else {
        return ResponseEntity.notFound().build();
    }
}

    @DeleteMapping("/{equipmentName}")
    public ResponseEntity<String> deleteEquipment(@PathVariable String equipmentName) {
        Optional<MySpecialEquipment> equipment = specialEquipmentRepository.findByEquipmentName(equipmentName);
        if (equipment.isPresent()) {
            specialEquipmentRepository.delete(equipment.get());
            return ResponseEntity.ok("Equipment deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
