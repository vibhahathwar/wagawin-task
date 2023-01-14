package com.assignment.family.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.family.entities.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long>{

}
