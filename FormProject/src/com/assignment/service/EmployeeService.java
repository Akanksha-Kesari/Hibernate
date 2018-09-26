package com.assignment.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.assignment.dao.EmployeeDAOImpl;
import com.assignment.model.Employee;

@Path("empser")
public class EmployeeService {
	
	EmployeeDAOImpl obj=new EmployeeDAOImpl();
	@Path("add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String add(Employee emp)
	{
		
		return obj.add(emp);
		
	}
	
	@Path("getall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getall()
	{
		return obj.getall();
	}
	
	@Path("getsal/{x}/{y}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllSalary(@PathParam ("x") float x1,@PathParam ("y") float y1)
	{
		return obj.getAllSalary(x1, y1);
		
	}
	
	@Path("getid/{x}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getById(@PathParam ("x") int x1)
	{
		return obj.getById(x1);
		
	}

	@Path("updateall")
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateAll(Employee emp)
	{
		return obj.updateAll(emp);
		
	}
	
	@Path("updatename")
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public String updateName(Employee emp)
	{
		return obj.updateName(emp);
	}
	
	@Path("deleteall")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteAll()
	{
		return obj.deleteAll();
		
	}
	
	@Path("deleteone/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteById(@PathParam ("id") int x){
		return obj.deleteById(x);
		
	}
	
	/*@Path("reverse")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> reverse()
	{
		return obj.reverse();
	}*/
	
	 @POST
		@Path("insert")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		public void addProject(@FormParam("employeeId") int Id,@FormParam("empName") String Name,
				@FormParam("designation")  String designation,@FormParam("salary")  float sal){
			System.out.println("enter controller");
			Employee e=new Employee(Id, Name, designation, sal);
			
		obj.insert(e);
				}
}
