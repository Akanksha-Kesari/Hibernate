package com.assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.assignment.model.Employee;
import com.assignment.utility.ConnectionProvider;

public class EmployeeDAOImpl implements EmployeeDAO{
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement ps;
	
	
	public List<Employee> getAll() throws Exception
	{
		List<Employee> emp=new ArrayList<Employee>();
		con=ConnectionProvider.getCon();
		String q="select * from myemployee";
		ps=con.prepareStatement(q);
		rs=ps.executeQuery();
		while(rs.next())
		{
			emp.add(new Employee(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getFloat(4)));
		}
		
		return emp;
		
	}
	
	

}
