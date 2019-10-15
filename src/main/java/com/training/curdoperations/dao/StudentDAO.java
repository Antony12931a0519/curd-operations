package com.training.curdoperations.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.training.curdoperations.entities.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {
	
	public List<Student> findStudentsByMarks(float marks);

}
