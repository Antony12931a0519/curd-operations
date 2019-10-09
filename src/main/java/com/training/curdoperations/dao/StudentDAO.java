package com.training.curdoperations.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.curdoperations.entities.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {

}
