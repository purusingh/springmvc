package com.test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.web.models.containers.EmailContainer;
import com.test.web.services.EmailService;

@Controller
public class IndexController {
	
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String index(Model model) {
		return  "index";
	}
	
	
	@RequestMapping(value = "frmText", method = RequestMethod.GET)
	public String frmTest() {
		
		return "frmText";
	}
	
	/*@RequestMapping(value = "frmText", method = RequestMethod.POST)
	public String frmTest1(@RequestParam("email") String email, @RequestParam("subject") String subject
			, @RequestParam("body") String body) {
	
		EmailService emailSrv = new EmailService();
		emailSrv.send(email, subject, body);
		
		return "frmText";
	}*/
	
	@RequestMapping(value = "frmText", method = RequestMethod.POST)
	public String frmTest1(@ModelAttribute("email") EmailContainer  emailContainer) {
	
		EmailService emailSrv = new EmailService();
		emailSrv.send(emailContainer);
		
		return "frmText";
	}

}
