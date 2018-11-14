package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	@RequestMapping("/my")
	public ModelAndView myData() {
		return new ModelAndView("welcome", "msg", "Welcome to spring MVC");
	}

	@RequestMapping("/my2")
	public ModelAndView myData1(HttpServletRequest req, HttpServletResponse res) {
		String unm = req.getParameter("unm");
		String pwd = req.getParameter("pwd");
		ModelAndView model = new ModelAndView("info");
		model.addObject("unm", unm);
		model.addObject("pwd", pwd);
		return model;
	}
	
	@RequestMapping("/my3")
	public ModelAndView myData2(@RequestParam String unm,@RequestParam String pwd ) {
		ModelAndView model = new ModelAndView("info");
		model.addObject("unm", unm);
		model.addObject("pwd", pwd);
		return model;
	}

}
