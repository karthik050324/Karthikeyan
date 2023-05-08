package com.review2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Integer> {

}  
