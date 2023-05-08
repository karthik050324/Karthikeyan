package com.review2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{
	
}
