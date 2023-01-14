package com.assignment.family.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.family.entities.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long>, ChildRepositoryCustom{
	

}
