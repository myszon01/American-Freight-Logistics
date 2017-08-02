package com.americanfreight.af.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	 @RequestMapping(value= {"/", "/index"})
	    String index(){
	        return "index";
	    }
	 
	 @RequestMapping("/contact")
	    String contact(){
	        return "contact";
	    }
}
