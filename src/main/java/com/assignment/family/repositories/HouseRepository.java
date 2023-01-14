package com.assignment.family.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.family.entities.House;


@Repository
public interface HouseRepository extends JpaRepository<House, Long>{

	
}
