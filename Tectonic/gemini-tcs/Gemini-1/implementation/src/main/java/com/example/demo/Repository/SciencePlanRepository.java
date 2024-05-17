package com.example.demo.Repository;

import com.example.demo.Model.SciencePlan;
import org.springframework.data.repository.CrudRepository;

public interface SciencePlanRepository extends CrudRepository<SciencePlan, Integer> {
    SciencePlan findById(int id);
}
