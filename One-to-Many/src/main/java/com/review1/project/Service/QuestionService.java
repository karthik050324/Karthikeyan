package com.review1.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review1.project.Model.PlayerNatTeam;
import com.review1.project.Repository.QuestionRepo;

@Service
public class QuestionService 
{
	@Autowired
	public QuestionRepo obj;
	public PlayerNatTeam addStudent(PlayerNatTeam smodel)
	{
		return obj.save(smodel);
	}
	public List<PlayerNatTeam>getStudent()
	{
		return obj.findAll();
	}
	public PlayerNatTeam putData(PlayerNatTeam smodel)
	{
		return obj.saveAndFlush(smodel);
	}
   public void deletedata(int studentid)
   {
	   obj.deleteById(studentid);
   }

}
