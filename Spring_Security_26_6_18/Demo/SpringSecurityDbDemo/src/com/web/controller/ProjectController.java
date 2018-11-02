package com.web.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 UsernamePasswordAuthenticationToken(Class) at runtime, 
 injects Username  
 into the Principal interface. 
 
 Principal  has a method named as getName() which Returns currently logedin user.
    //get logged in username
    String name = principal.getName();
   */
@Controller
public class ProjectController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String printMessage(ModelMap model, Principal principal) {

		String username = principal.getName();
		
		model.addAttribute("user", username);
		model.addAttribute("msg", "Spring Security Customized Login from Database Table");
		return "welcome";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {

		return "login";

	}

	@RequestMapping(value = "/failLogin", method = RequestMethod.GET)
	public String failedLogin(ModelMap model) {

		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logoff", method = RequestMethod.GET)
	public String logoff(ModelMap model) {

		return "login";

	}
}
