package com.training.curdoperations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.curdoperations.dao.FacultyDAO;
import com.training.curdoperations.dao.StudentDAO;
import com.training.curdoperations.entities.Faculty;
import com.training.curdoperations.models.ConsolidatedModel;
import com.training.curdoperations.models.Student;

@Service
public class FacultyService {
	@Autowired
	StudentDAO studentDAO;
	@Autowired
	FacultyDAO facultyDAO;

	public ConsolidatedModel getConsolidatedList() {

		List<com.training.curdoperations.entities.Student> students = (List<com.training.curdoperations.entities.Student>) studentDAO
				.findAll();

		List<Faculty> faculty = (List<Faculty>) facultyDAO.findAll();

		ConsolidatedModel model = new ConsolidatedModel();
		model.setStudents(students);
		model.setFaculty(faculty);
		return model;

	}

}
