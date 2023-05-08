package com.example.app.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Repository.IplRepo;
import com.example.app.Model.IplTeam;
@Service
public class IplteamService
{
@Autowired
 IplRepo prepo;
 public List<IplTeam> getPerson()
 {
	 return prepo.findAll();
 }
 public IplTeam postPerson(IplTeam p)
 {
	 return prepo.save(p);
 }
}