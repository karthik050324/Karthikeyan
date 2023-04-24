package com.example.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.app.Model.IplauctModel;
import com.example.app.Service.IplauctService;

@RestController
public class IplauctControl
{
@Autowired
public IplauctService iser;
@PostMapping("/iplpost")
public IplauctModel addDetails(@RequestBody IplauctModel ip)
{
	return iser.saveInfo(ip);
}

@GetMapping("/iplget")

	public List<IplauctModel> getDetails()
	{
		return iser.getInfo();
	}

@PutMapping("/iplput")
public IplauctModel updateDetails (@RequestBody IplauctModel pnum)
{
	return iser.updateInfo(pnum);
}

@DeleteMapping("/ipldel/{cid}")
public String deleteDetails(@PathVariable ("cid") int pnum)
{
	iser.deleteInfo(pnum);
	return "Player Number "+pnum+" is deleted";
}

@DeleteMapping("/deleteByReq")
public String deleteByRequest(@RequestParam ("cid") int pnum)
{
	iser.deleteInfo(pnum);
	return "Player Number "+pnum+" is deleted";
}


}
