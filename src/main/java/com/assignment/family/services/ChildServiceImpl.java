package com.assignment.family.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.family.entities.Child;
import com.assignment.family.entities.Meal;
import com.assignment.family.repositories.ChildRepository;
import com.assignment.family.repositories.MealRepository;

@Service
public class ChildServiceImpl implements ChildService{
	
	@Autowired
	ChildRepository childRepository;
	
	@Autowired
	MealRepository mealRepository;
	

	@Override
	public Optional<Meal> getMealDetails(Long childId) {
		Optional<Meal> meal = mealRepository.findById(childId);
		return meal;
	}

	@Override
	public Child getColor(Long childId) {
		
		Optional<Child> childDeatils = childRepository.findById(childId);
		return childDeatils.get();
	}
	
	
	
	
	


}
