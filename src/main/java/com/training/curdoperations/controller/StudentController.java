package com.training.curdoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.curdoperations.custom.exceptions.NullCheckException;
import com.training.curdoperations.models.Student;
import com.training.curdoperations.service.StudentService;

@RestController
public class StudentController implements BasicCrudOperations{

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/students/list", produces = "application/json", method = { RequestMethod.GET })
	public List<Student> getStudentList() {

		return studentService.getStudentList();

	}

	@RequestMapping(value = "/add/studentdetails",
			produces = "application/json",
			consumes = "application/json",
			method = { RequestMethod.POST })
	public String insertStudentDetaials(@RequestBody Student student)
			throws NullCheckException {

		return studentService.insertStudentDetails(student);

	}
	
	@RequestMapping(value = "/update/studentdetails",
			produces = "application/json",
			consumes = "application/json",
			method = { RequestMethod.PUT })
	public String updateStudentDetaials(@RequestBody Student student)
			throws NullCheckException {

		return studentService.updateStudentDetails(student);

	}
	
	@RequestMapping(value = "/delete/studentdetails",
			produces = "application/json",
			consumes = "application/json",
			method = { RequestMethod.DELETE })
	public String deleteStudentDetaials(@RequestBody Student student)
			throws NullCheckException {

		return studentService.deleteStudentDetails(student);

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

}
