package com.example.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 


import com.example.app.Model.iplauct_model;
import com.example.app.Service.IplauctService;

@RestController
public class IplauctControl
{
@Autowired
public IplauctService iser;
@PostMapping("/iplpost")
public iplauct_model addDetails(@RequestBody iplauct_model ip)
{
	return iser.saveInfo(ip);
}

@GetMapping("/iplget")

	public List<iplauct_model> getDetails()
	{
		return iser.getInfo();
	}

@PutMapping("/iplput")
public iplauct_model updateDetails (@RequestBody iplauct_model pnum)
{
	return iser.updateInfo(pnum);
}

@DeleteMapping("/ipldel/{cid}")
public String deleteDetails(@PathVariable ("cid") int pnum)
{
	iser.deleteInfo(pnum);
	return "Player Number "+pnum+" is deleted";
}
@GetMapping("/sortResttraining/{name}")
public List<iplauct_model>sortRestraining(@PathVariable String name)
{
	return iser.sortIplauctModel(name);
}
@GetMapping("/pagingStudent/{offset}/{pageSize}")
public Page<iplauct_model> pagingStudent(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
{
	return iser.pagingStudent(offset,pageSize);

}
@GetMapping("/pagingAndSortingStudents/{offset}/{pageSize}/{field}")

public List<iplauct_model> pagingAndSortingEmployees(@PathVariable int offset,
		@PathVariable int pageSize,
		@PathVariable String field) 
{
	return iser.pagingAndSortingEmployees(offset, pageSize, field);
}
@GetMapping("/kirthick")
public List<iplauct_model>fetchStudentsByPnamePrefix(@RequestParam String Prefix)
{
	return iser.fetchStudentsByPnamePrefix(Prefix);
}
@GetMapping("/sortdscteams/{field}")
public List<iplauct_model> sortdscTeams(@PathVariable("field") String field)
{
	return iser.sortdesTeams(field);
}
@DeleteMapping("/detele/{name}")
public String deleteStudentByName(@PathVariable String name)
{
	int result=iser.deleteStudentByName(name);
	if(result>0)
		return "Student record deleted";
	else
		return "Problem occured while deleting";
}
@PutMapping("/update/{department}/{name}")
public int updateStudentByName(@PathVariable String department,@PathVariable String name)
{
	return iser.updateStudentByName(department,name);
}

@GetMapping("/getbyquery")
public List<iplauct_model>getStudentsByPteam(String pteam,String pname)
{
	return iser.getStudentsByPteam(pteam, pname);
}
@GetMapping("/getby")
public List<iplauct_model>getStudentsByPteam(String pteam)
{
	return iser.getStudentByPteam(pteam);
}
}
