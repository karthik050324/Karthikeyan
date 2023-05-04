
package com.example.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Model.IplLoginModel;
import com.example.app.Repository.IplLoginRepo;
@Service
public class IplLoginService {
	@Autowired
	public IplLoginRepo lrepo;
	
	public String checkLogin(String username,String psword)
	{
		IplLoginModel user= lrepo.findByUsername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPsword().equals(psword))
			{
				return "Login Succesfull";
			}
			
			else
			{
				return "Login Failed";
			}
		}
	} 
	public IplLoginModel addUser(IplLoginModel cl)
	{
		return lrepo.save(cl);
	}
	public List <IplLoginModel> getUser()
	{
		return lrepo.findAll();
	}

}
