package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Model.NatTeam;
@Repository
public interface Natrepo extends JpaRepository<NatTeam,Integer>
{

}