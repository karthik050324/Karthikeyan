package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.Model.IplLoginModel;

public interface IplLoginRepo extends JpaRepository<IplLoginModel, Integer>{
	public IplLoginModel findByUsername(String username);
}
