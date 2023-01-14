package com.assignment.family.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.family.entities.Child;
import com.assignment.family.entities.House;
import com.assignment.family.entities.Meal;
import com.assignment.family.services.ChildServiceImpl;
import com.assignment.family.services.PersonServiceImpl;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
	
		@Autowired
		PersonServiceImpl personServiceImpl;
		
		@Autowired
		ChildServiceImpl childServiceImpl;

		@GetMapping(value = "/house/{personId}")
		public ResponseEntity<House> getHouseDetails(@PathVariable Long personId) {
			
			
			Optional<House> houseDetails = personServiceImpl.getHouseDetailsById(personId);
			//System.out.println(houseDetails.getId());
			
			if(houseDetails.isPresent()) 
				return new ResponseEntity<>(houseDetails.get(), HttpStatus.OK);
				
			else
				
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
		
		@GetMapping(value = "/child/info/{childId}")
		public ResponseEntity<Meal> getMealByChildId(@PathVariable Long childId){
			
			
			Optional<Meal> mealInfo = childServiceImpl.getMealDetails(childId);
			
			if(mealInfo.isPresent())
				return new ResponseEntity<>(mealInfo.get(), HttpStatus.OK);
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		@GetMapping(value = "/child/color/childId")
		public ResponseEntity<Child> getChildColor(@PathVariable Long childId){
			
			return null;
			
		}
}
