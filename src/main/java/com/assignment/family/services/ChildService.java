package com.assignment.family.services;

import java.util.Optional;

import com.assignment.family.entities.Child;
import com.assignment.family.entities.Meal;

public interface ChildService {
	
	public Optional<Meal> getMealDetails(Long childId);
	public Child getColor(Long childId);

}
