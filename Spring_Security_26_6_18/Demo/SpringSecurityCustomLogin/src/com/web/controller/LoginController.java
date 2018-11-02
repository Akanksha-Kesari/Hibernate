package com.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * 
 * 
 *  @RequestParam annotation to retrieve the URL
 *   parameter and map it to the method argument
 */

@Controller
public class LoginController {

	@RequestMapping("home")
	public String getHome() {
		return "home";
	}
	@RequestMapping("login")
	public ModelAndView getLoginForm(@RequestParam(required = false) String authfailed, String logout) {
		String message = "";
		if (authfailed != null) {
			
			message = "Invalid username or password, try again !"+authfailed;
		} else if (logout != null) {
			System.out.println(logout);
			message = "Logged Out successfully, login again to continue !";
		}
		return new ModelAndView("login", "message", message);
	}
	
	
	@RequestMapping("profile/page")
		public String geProfilePage() {
		return "profile";
	
    }

}
