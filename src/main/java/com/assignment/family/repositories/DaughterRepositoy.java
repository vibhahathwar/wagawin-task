package com.assignment.family.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.family.entities.Daughter;

@Repository
public interface DaughterRepositoy extends JpaRepository<Daughter, Long>{
	
	
	public Daughter getColor(Long childId);

}
