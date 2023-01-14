package com.assignment.family.repositories;

import org.springframework.stereotype.Repository;

import com.assignment.family.entities.Person;

import jakarta.persistence.EntityManager;

@Repository
public class ChildRepositoryImpl implements ChildRepositoryCustom{
	
	
	EntityManager em;

	@Override
	public Person getMealDetailsBYId(Long childId) {
		
		
		
		
		return null;
	}

}
