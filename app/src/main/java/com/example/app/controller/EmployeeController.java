package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Employee;
import com.example.app.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeService serobj;
	@GetMapping("/emp")
	public List<Employee> getAllemployee()
	{
		List<Employee>empList=serobj.getAllemployee();
		return empList;
	}

}



