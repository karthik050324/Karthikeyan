package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.model.Employee;
import com.example.app.repositery.EmployeeRepositery;

public class EmployeeService {
	@Autowired
	public EmployeeRepositery repobj;

	public List<Employee> getAllemployee() {
		List<Employee>empList= repobj.findAll();
		return empList;
	}

}
