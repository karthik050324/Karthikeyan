package com.example.app.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.Employee;

@Repository
public interface EmployeeRepositery extends JpaRepository<Employee, Integer> {

}
