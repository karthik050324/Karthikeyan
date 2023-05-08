package com.review2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,String>{

	void deleteByPass(String password);

	

}
