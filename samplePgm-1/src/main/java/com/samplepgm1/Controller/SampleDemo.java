package com.samplepgm1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDemo {
	@GetMapping("/login")
	
	public String Login()
	{
		return " Login..!!";
	}

}
