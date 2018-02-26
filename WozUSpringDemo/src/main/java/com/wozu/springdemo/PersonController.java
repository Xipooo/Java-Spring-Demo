package com.wozu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	private PersonRepository personRepository;
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Person addPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@RequestMapping(value="/{id}")
	public Person getPersonById(@PathVariable Long id) {
		return personRepository.findOne(id);
	}
	
	@RequestMapping(value="/")
	public Iterable<Person> getAllPeople() {
		return personRepository.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public Person updatePersonById(@PathVariable Long id, @RequestBody Person updatePerson) {
		Person person = personRepository.findOne(id);
		person.setFirstName(updatePerson.getFirstName());
		person.setLastName(updatePerson.getLastName());
		person.setEmail(updatePerson.getEmail());
		return personRepository.save(person);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deletePersonById(@PathVariable Long id) {
		personRepository.delete(id);
	}
}
