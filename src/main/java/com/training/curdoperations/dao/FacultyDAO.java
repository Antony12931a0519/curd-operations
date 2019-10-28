package com.training.curdoperations.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.curdoperations.entities.Faculty;

@Repository
public interface FacultyDAO extends CrudRepository<Faculty, Integer> {
	
	
	
	

}
