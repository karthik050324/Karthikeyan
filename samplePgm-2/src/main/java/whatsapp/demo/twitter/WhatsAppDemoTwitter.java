package whatsapp.demo.twitter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppDemoTwitter {

	@GetMapping("/SigninPage")
	public String SigninPage()
	{
		return "SigninPage is Successful";
	}
	
	@GetMapping("/LandingPage/{username}")
	public String LandingPage(@PathVariable("username") String username)
	{
		return "LandingPage is Successful "+ username;
	}

}
