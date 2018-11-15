package com.infogain.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infogain.model.Employee;
import com.infogain.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		return new ModelAndView("addEmployee", "command", new Employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(Employee emp) {
		employeeService.addEmployee(emp);
		return new ModelAndView("redirect:/employees.html");
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView listEmployee() {
		Map<String, Object> model=new HashMap<String,Object>();
		model.put("employees", employeeService.listEmployees());
		
		return new ModelAndView("employeesList",model);
	}
}
