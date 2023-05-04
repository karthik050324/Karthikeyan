package com.example.app.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Repository.PersonRepo;
import com.example.app.Model.Person;
@Service
public class PersonService
{
@Autowired
 PersonRepo prepo;
 public List<Person> getPerson()
 {
	 return prepo.findAll();
 }
 public Person postPerson(Person p)
 {
	 return prepo.save(p);
 }
}