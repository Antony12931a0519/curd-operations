package com.training.curdoperations.controller;

import java.util.List;

import com.training.curdoperations.models.Student;

public interface BasicCrudOperations {
	
	public String insertStudentDetails(Student student);
	public String updateStudentDetails(Student student);
	public List<Student> getStudentDetail(Student student);
	public String deleteStudentDetails(Student student);

}
