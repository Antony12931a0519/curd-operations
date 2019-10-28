package com.training.curdoperations.models;

import java.util.List;

import com.training.curdoperations.entities.Faculty;
import com.training.curdoperations.entities.Student;

public class ConsolidatedModel {
	
	private List<Student> students;
	private List<Faculty> faculty;
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}

}
