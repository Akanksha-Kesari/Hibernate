package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;

@Controller

public class UserController {

	@RequestMapping(value="/user" ,method=RequestMethod.GET)
	public ModelAndView user()
	{
		return new ModelAndView("user","user",new User());
	}
	
	@RequestMapping(value="/createUser" ,method=RequestMethod.POST)
	public ModelAndView createUser(@Valid User user,BindingResult result,ModelMap model)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("user");
		}
		else
		{
			model.addAttribute("name",user.getName());
			model.addAttribute("age",user.getAge());
			model.addAttribute("location",user.getLocation());
			model.addAttribute("email",user.getEmail());
			model.addAttribute("mob",user.getMob());
			return new ModelAndView("success");
		}
		
	}
	
}
