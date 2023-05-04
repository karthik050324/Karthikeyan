package com.review1.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review1.project.Model.PlayerNatTeam;

public interface QuestionRepo extends JpaRepository<PlayerNatTeam, Integer> {

}