package com.assignment.family.services;


import java.util.Optional;

import com.assignment.family.entities.House;

public interface PersonService {
	
	public Optional<House> getHouseDetailsById(Long personId);

}
