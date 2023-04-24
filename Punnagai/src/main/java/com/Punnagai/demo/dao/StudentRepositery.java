package com.Punnagai.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Punnagai.demo.model.Student;

@Repository

public interface StudentRepositery extends JpaRepository<Student,Integer> {
	

}
