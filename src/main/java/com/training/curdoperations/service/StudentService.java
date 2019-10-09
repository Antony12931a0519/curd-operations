package com.training.curdoperations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.curdoperations.dao.StudentDAO;
import com.training.curdoperations.models.Student;

@Service
public class StudentService {
	@Autowired
	StudentDAO studentDAO;

	public List<Student> getStudentList() {

		List<com.training.curdoperations.entities.Student> studentList = (List<com.training.curdoperations.entities.Student>) studentDAO
				.findAll();
		List<Student> students = new ArrayList<Student>();

		if (studentList != null && studentList.size() > 0) {
			for (com.training.curdoperations.entities.Student student : studentList) {
				Student s = new Student();
				s.setName(student.getInitial() + "" + student.getName());
				s.setMarks(student.getMarks());
				students.add(s);
			}

		}

		if (students != null && students.size() > 0)
			return students;
		else

			return null;

	}

}
