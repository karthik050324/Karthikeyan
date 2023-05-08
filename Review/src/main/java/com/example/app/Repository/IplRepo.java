package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Model.IplTeam;
@Repository
public interface IplRepo extends JpaRepository<IplTeam,Long>
{

}