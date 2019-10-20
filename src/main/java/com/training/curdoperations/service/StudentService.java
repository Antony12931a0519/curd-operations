package com.training.curdoperations.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.curdoperations.custom.exceptions.NullCheckException;
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
				s.setMarks((float) student.getMarks());
				students.add(s);
			}

		}

		if (students != null && students.size() > 0)
			return students;
		else

			return null;

	}
	
	public List<Student> findStudentsByMarks(float marks) {

		List<com.training.curdoperations.entities.Student> studentList = (List<com.training.curdoperations.entities.Student>) studentDAO
				.findStudentsByMarks(marks);
		List<Student> students = new ArrayList<Student>();

		if (studentList != null && studentList.size() > 0) {
			for (com.training.curdoperations.entities.Student student : studentList) {
				Student s = new Student();
				s.setName(student.getInitial() + "" + student.getName());
				s.setMarks((float) student.getMarks());
				students.add(s);
			}

		}

		if (students != null && students.size() > 0)
			return students;
		else

			return null;

	}


	public String insertStudentDetails(Student student)
			throws NullCheckException {

		if (student == null) {
			throw new NullCheckException("Student details cannot be null.");
		}

		com.training.curdoperations.entities.Student studentEntity = new com.training.curdoperations.entities.Student();
		studentEntity.setName(student.getName());
		studentEntity.setInitial(student.getInitial());
		studentEntity.setMarks(student.getMarks());
		studentEntity = studentDAO.save(studentEntity);

		if (studentEntity == null)
			return "Student details are not inserted";

		return "Student details are  inserted";

	}

	public String updateStudentDetails(Student student)
			throws NullCheckException {

		if (student == null) {
			throw new NullCheckException("Student details cannot be null.");
		}

		Optional<com.training.curdoperations.entities.Student> studentOptionalntity = null;

		com.training.curdoperations.entities.Student studentEntity = null;

		studentOptionalntity = studentDAO.findById(student.getId());
		studentEntity = studentOptionalntity.get();

		if (studentEntity != null) {
			studentEntity.setMarks(student.getMarks());
		}

		studentEntity = studentDAO.save(studentEntity);

		if (studentEntity == null)
			return "Student details are not updated";

		return "Student details are  updated";

	}

	public String deleteStudentDetails(Student student)
			throws NullCheckException {

		if (student == null) {
			throw new NullCheckException("Student details cannot be null.");
		}

		Optional<com.training.curdoperations.entities.Student> studentOptionalntity = null;

		com.training.curdoperations.entities.Student studentEntity = null;

		studentOptionalntity = studentDAO.findById(student.getId());
		studentEntity = studentOptionalntity.get();

		if (studentEntity != null) {
			studentDAO.delete(studentEntity);

		}

		if (studentEntity == null)
			return "Student details are not Deleted";

		return "Student details are  deleted";

	}

	public String deleteStudentDetailsById(int id) throws NullCheckException {

		if (id == 0) {
			throw new NullCheckException("Student details cannot be null.");
		}

		Optional<com.training.curdoperations.entities.Student> studentOptionalntity = null;

		com.training.curdoperations.entities.Student studentEntity = null;

		studentOptionalntity = studentDAO.findById(id);
		studentEntity = studentOptionalntity.get();

		if (studentEntity != null) {
			studentDAO.delete(studentEntity);

		}

		if (studentEntity == null)
			return "Student details are not Deleted";

		return "Student details are  deleted";

	}

}
