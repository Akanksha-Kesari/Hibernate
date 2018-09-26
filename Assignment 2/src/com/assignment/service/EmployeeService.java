package com.assignment.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.assignment.dao.EmployeeDAOImpl;
import com.assignment.model.Employee;

@Path("empserv")
public class EmployeeService {
	 EmployeeDAOImpl obj=new EmployeeDAOImpl();
	 
	 
	 
	@Path("getall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAll() throws Exception {

		return obj.getAll();
	}
	

}
