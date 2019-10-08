package com.training.curdoperations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping(value = "/welcome",
			produces = "application/json", 
			method = { RequestMethod.GET })
	public String showWelcomeMessage() {

		return "Welcome to my website!";

	}
	
	@RequestMapping(value = "/hello",
			produces = "application/json", 
			method = { RequestMethod.GET })
	public String showHelloMessage() {

		return "Hello to my website!";

	}

	/*
	 * @Path("/welcome")
	 * 
	 * @GET
	 * 
	 * @Produces public String showWelcomeMessage(){
	 * 
	 * }
	 */

}
