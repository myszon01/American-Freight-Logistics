package com.americanfreight.af.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.americanfreight.af.EmailService;
import com.americanfreight.model.Email;

@Controller
public class IndexController {
	
	@Autowired
	private EmailService emailService;
	
	 @RequestMapping(value= {"/", "/index"})
	    String index(){
		 
	        return "index";
	    }
	 
	 @RequestMapping("/contact")
	    String contact(Model model){
		 model.addAttribute("emial", new Email());
	        return "contact";
	    }
	 
	 @RequestMapping("/services")
	    String sercives(){
		    
	        return "services";
	    }
	 
	 @RequestMapping("/sendEmail")
	    String sendEmail(@ModelAttribute Email e){
		 
		 emailService.sendMail(e.getEmailAddress(),e.getSubject(),e.getMessage(), e.getName());
	        return "success";
	    }
}
