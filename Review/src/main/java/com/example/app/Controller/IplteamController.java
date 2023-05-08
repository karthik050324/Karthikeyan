package com.example.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Model.IplTeam;
import com.example.app.Service.IplteamService;

@RestController
public class IplteamController {

	@Autowired
	IplteamService pservice;
	
	
	@GetMapping("/getPersons")
	public List<IplTeam> findAll()
	{
		return pservice.getPerson();
	}
	
	@PostMapping("/postPersons")
	public IplTeam addPersons(@RequestBody IplTeam p)
	{
		return pservice.postPerson(p);
	}
}