package com.review1.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.review1.project.Model.PlayerNatTeam;
import com.review1.project.Service.QuestionService;

@RestController
@RequestMapping("/ans")
public class QuestionController 
{
	@Autowired
	public QuestionService obj1;
	public PlayerNatTeam add(@RequestBody PlayerNatTeam smodel)
	{
		return obj1.addStudent(smodel);
	}
	@GetMapping("")
	public List<PlayerNatTeam> get()
	{
		return obj1.getStudent();
	}
	@PutMapping("")
	public PlayerNatTeam put(@RequestBody PlayerNatTeam smodel)
	{
		return obj1.putData(smodel);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id)
	{
		obj1.deletedata(id);
		return id+"deleted";
		
	}
}