package com.spring.controller;
/*
 path attribute – it must correspond to a getter or setter of the model attribute (in this case, the Employee class).
 When the page is loaded, the input fields are populated by Spring, which calls the getter of each field bound to an
 input field. When the form is submitted, the setters are called to save the values of the form to the object.
 Finally – when the form is submitted, the POST handler in the controller is invoked and the form is automatically
  bound to the employee argument that we passed in.
 
Command Object - a JavaBean which will be populated with the data from your forms
Think  Command Object as a POJO/JavaBean that backs the form in your presentation layer. 
Once the form is submitted, all the individual attributes are mapped/bound to this object.
 Command Object properties may be used to pre/populate the form.

An @ModelAttribute on a method argument indicates the argument should be retrieved from the model.
	The argument's fields should be populated from all request parameters that have matching names.
	This is known as data binding in Spring MVC, a very useful mechanism that saves you from having 
	to parse each form field individually.

  
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.spring.bean.Employee;
@Controller
public class EmployeeController {
	/*
	 Here the first service method employee(), we have passed a blank Employee 
	 object in the ModelAndView object with name 
	 "command" because the spring framework expects an object with name "command" if you are using tags in your JSP file. 
	  So when employee() method is called it returns employeeForm.jsp view.
	  Third service method addEmployee1() will be called against a get method on the spring/addEmployee1 URL. 
	  You will prepare your model object based on the submitted information. Finally a "employeeDetail" 
	  view will be returned from the service method, which will result in rendering employeeDetail.jsp
  
	 */
	
	/*
	 * 
	 * The commandName attribute is the key which specifies name of the model class object 
	 * that acts as a backing object for this form
	 * 
	 */
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
		public ModelAndView employee() {
		return new ModelAndView("employeeForm", "my", new Employee());
			}
	
	@RequestMapping(value = "/addEmployee1", method = RequestMethod.POST)
	public ModelAndView addEmployee1(Employee employee,ModelMap model) {
	    model.addAttribute("name", employee.getName());
	      model.addAttribute("age", employee.getAge());
	      model.addAttribute("empId", employee.getEmpId());
	      model.addAttribute("salary", employee.getSalary());
	      return new ModelAndView("employeeDetail");// "employeeDetail";
	   }
	
	
	
@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("emp") Employee emp, 
			ModelMap model) {
	   model.addAttribute("emp") ;
	   return new ModelAndView("empdetails");
	   }
	
	
}
