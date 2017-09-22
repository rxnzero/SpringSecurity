package com.dhlee.spring.mvc.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String visitHomePage() {
		return "index";
	}

	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String visitAdministratorPage(ModelMap modelObj) {		
		modelObj.addAttribute("welcomeTitle", "Admministrator Control Panel");
		modelObj.addAttribute("messageObj", "This Page Demonstrates How To Use Spring Security!");
		return "admin";
	}
	
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String login(ModelMap modelObj) {
		return "loginpage";
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(ModelMap modelObj) {
		return "index";
	}
}