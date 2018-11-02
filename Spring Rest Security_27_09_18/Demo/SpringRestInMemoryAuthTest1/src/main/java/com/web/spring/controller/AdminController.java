package com.web.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.Greeting;
@RestController
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping(value="hello/{name}",
			method=RequestMethod.GET,produces="application/json")
	public Greeting message(@PathVariable String name)
	{
		Greeting msg= new Greeting(name,"Hello admin"+name);
		return msg;
	}

}
