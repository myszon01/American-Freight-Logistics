package com.americanfreight.af.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.americanfreight.af.EmailService;

@Controller
public class IndexController {
	
	@Autowired
	private EmailService emailService;
	
	 @RequestMapping(value= {"/", "/index"})
	    String index(){
		 
	        return "index";
	    }
	 
	 @RequestMapping("/contact")
	    String contact(){
	        return "contact";
	    }
	 
	 @RequestMapping("/services")
	    String sercives(){
	        return "services";
	    }
	 
	 @RequestMapping("/sendEmail")
	    String sendEmail(){
		 
		 emailService.sendMail("myszon01@gmail.com","Test subject","Test mail");
	        return "services";
	    }
}
