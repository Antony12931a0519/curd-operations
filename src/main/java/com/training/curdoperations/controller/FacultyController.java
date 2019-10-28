package com.training.curdoperations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.curdoperations.models.ConsolidatedModel;
import com.training.curdoperations.service.FacultyService;

@RestController
public class FacultyController {

	@Autowired
	FacultyService facultyService;

	@RequestMapping(value = "/consolidated/list", produces = "application/json", method = { RequestMethod.GET })
	public ConsolidatedModel getConsolidatedList() {

		return facultyService.getConsolidatedList();

	}
}
