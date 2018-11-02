package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SpringController {
@RequestMapping(value="home",method=RequestMethod.GET)
public ModelAndView getHome()
	{
 return new ModelAndView("home","msg","Not a Secured Page");
	}
@RequestMapping(value="profile/page",method=RequestMethod.GET)
public ModelAndView getProfile()
{
	return new ModelAndView("profile","msg","Secured Page");
}
	
	}
