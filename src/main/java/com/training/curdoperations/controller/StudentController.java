package com.training.curdoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.curdoperations.models.Student;
import com.training.curdoperations.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/students/list", produces = "application/json", method = { RequestMethod.GET })
	public List<Student> getStudentList() {

		return studentService.getStudentList();

	}

}
