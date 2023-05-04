package com.example.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Model.Person;
import com.example.app.Service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService pservice;
	
	
	@GetMapping("/getPersons")
	public List<Person> findAll()
	{
		return pservice.getPerson();
	}
	
	@PostMapping("/postPersons")
	public Person addPersons(@RequestBody Person p)
	{
		return pservice.postPerson(p);
	}
}