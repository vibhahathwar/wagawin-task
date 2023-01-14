package com.assignment.family.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.family.entities.House;
import com.assignment.family.repositories.HouseRepository;


@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	HouseRepository houseReposity;

	@Override
	public Optional<House> getHouseDetailsById(Long personId) {
		return houseReposity.findById(personId);
	}

	

	

}
