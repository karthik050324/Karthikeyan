package com.review2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, String>{

	void deleteByPassword(String password);

}
