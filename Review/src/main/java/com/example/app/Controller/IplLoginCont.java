package com.example.app.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Model.IplLoginModel;
import com.example.app.Service.IplLoginService;
@RestController
@RequestMapping("/user")

public class IplLoginCont {
	@Autowired
	private IplLoginService lser;
	@PostMapping("/log")
	public String login(@RequestBody IplLoginModel loginData)
	{
		//String username=loginData.get("usrname");
		//String psword=loginData.get("psword");
		String result=lser.checkLogin(loginData.getUsername(),loginData.getPsword());
		return result;
	}
	@PostMapping("/addu")
	public IplLoginModel AddUser(@RequestBody IplLoginModel cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping
	public List<IplLoginModel> listAll()
	{
		return lser.getUser();
	}

}
