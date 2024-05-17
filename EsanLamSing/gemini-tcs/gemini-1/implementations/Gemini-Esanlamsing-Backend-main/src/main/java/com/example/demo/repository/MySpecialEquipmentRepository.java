package com.example.demo.repository;

import com.example.demo.model.MySpecialEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MySpecialEquipmentRepository extends JpaRepository<MySpecialEquipment, Long> {

    Optional<MySpecialEquipment> findByEquipmentName(String equipmentName);
    
}
