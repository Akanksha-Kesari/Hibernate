package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MvcController {
	@RequestMapping("/my")
	public ModelAndView myData()
	{
		return new ModelAndView("welcome","msg","Welcome to spring MVC");
		
	}

}
