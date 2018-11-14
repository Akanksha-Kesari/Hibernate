package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;

@Controller
public class MvcController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView employee() {
		return new ModelAndView("emp", "command", new Employee());
	}

	@RequestMapping(value = "/addemp", method = RequestMethod.POST)
	public ModelAndView addEmployee(Employee e, ModelAndView model) {
		model.addObject("eid", e.geteId());
		model.addObject("name", e.getName());
		model.addObject("dept", e.getDept());
		model.setViewName("empinfo");
		return model;
	}

	@RequestMapping(value = "/addemp1", method = RequestMethod.POST)
	public ModelAndView addEmployee1(@ModelAttribute("emp") Employee e, ModelMap map) {
		map.addAttribute("emp");

		return new ModelAndView("empinfo1");
	}
}
