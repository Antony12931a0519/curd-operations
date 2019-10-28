package com.training.curdoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.curdoperations.custom.exceptions.ProjectException;
import com.training.curdoperations.dao.CustomStudentDAO;
import com.training.curdoperations.dao.StudentDAO;
import com.training.curdoperations.models.Student;
import com.training.curdoperations.service.StudentService;

@RestController
public class StudentController implements BasicCrudOperations {

	@Autowired
	StudentService studentService;

	@Autowired
	StudentDAO studentDAO;

	@Autowired
	CustomStudentDAO customStudentDAO;

	@RequestMapping(value = "/students/list", produces = "application/json", method = { RequestMethod.GET })
	public List<Student> getStudentList() {
		System.out.println(studentDAO.createCustomQuery());
		System.out.println(studentDAO.createCustomQueryNyname("Antony"));
		System.out.println(studentDAO.createCustomQueryForStudent("Antony"));
		System.out.println(studentDAO
				.createCustomQueryForStudentNativeQuery("Antony"));

		for (Object s : customStudentDAO.findSudentDetails()) {
			System.out.println(s);
		}

		return studentService.getStudentList();

	}

	@RequestMapping(value = "/studentslistbymarks/{marks}", produces = "application/json", method = { RequestMethod.GET })
	public List<Student> findStudentsByMarks(@PathVariable("marks") float marks) {

		return studentService.findStudentsByMarks(marks);

	}

	@RequestMapping(value = "/add/studentdetails", produces = "application/json", consumes = "application/json", method = { RequestMethod.POST })
	public String insertStudentDetaials(@RequestBody Student student)
			throws ProjectException {

		if (student.getId() == 0 && student.getId() == -1)
			throw new ProjectException("ïd is mandatiry/");
		if (student.getInitial() == null)
			throw new ProjectException("ïd is mandatiry");

		return studentService.insertStudentDetails(student);

	}

	@RequestMapping(value = "/update/studentdetails", produces = "application/json", consumes = "application/json", method = { RequestMethod.PUT })
	public String updateStudentDetaials(@RequestBody Student student)
			throws ProjectException {

		return studentService.updateStudentDetails(student);

	}

	@RequestMapping(value = "/delete/studentdetails", produces = "application/json", consumes = "application/json", method = { RequestMethod.DELETE })
	public String deleteStudentDetaials(@RequestBody Student student)
			throws ProjectException {

		return studentService.deleteStudentDetails(student);

	}

	@RequestMapping(value = "/delete/studentdetails/{id}", produces = "application/json", consumes = "application/json", method = { RequestMethod.DELETE })
	public String deleteStudentDetaialsById(@PathVariable("id") int id)
			throws ProjectException {

		return studentService.deleteStudentDetailsById(id);

	}

	@RequestMapping(value = "/delete/studentdetails/queryparam", produces = "application/json", consumes = "application/json", method = { RequestMethod.DELETE })
	public String deleteStudentDetaialsByQueryParam(@RequestParam("id") int id)
			throws ProjectException {

		return studentService.deleteStudentDetailsById(id);

	}

	@Override
	public String insertStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentDetail(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * spring.jpa.hibernate.ddl-auto=update
	 * spring.datasource.url=jdbc:mysql://localhost:3306/db_example
	 * spring.datasource.username=springuser
	 * spring.datasource.password=ThePassword
	 * spring.datasource.driverClassName=com.mysql.jdbc.Driver
	 */

}
