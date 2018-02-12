package com.wozu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// New PersonController
@RestController
@RequestMapping("/api/person")
public class PersonController {

	// Use Dependency Injection to get PersonRepository
	private PersonRepository personRepository;
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	// Create Person method
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Person addPerson(Person person) {
		return personRepository.save(person);
	}
	
	// Read Person method
	@RequestMapping(value="/{id}")
	public Person getPersonById(@PathVariable Long id) {
		return personRepository.findOne(id);
	}
}
