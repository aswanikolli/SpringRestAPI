package com.journal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journal.model.Person;
import com.journal.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personservice;
	
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String savePerson(Person p){
		
		personservice.PersonSave(p);
		
		return "redirect/person";
		
		
	}

}
