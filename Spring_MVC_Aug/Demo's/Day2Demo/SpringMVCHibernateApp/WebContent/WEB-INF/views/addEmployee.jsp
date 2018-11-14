<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
		<h2>Add Employee Data</h2>
		<form:form method="POST" action="save.html">
	   		<table>
			    <tr>
			        <td>Employee ID:</td>
			        <td><form:input path="empId"  value="${employee.empId}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td>Employee Name:</td>
			        <td><form:input path="empName" value="${employee.empName}" /></td>
			    </tr>
			    <tr>
			        <td>Employee Age:</td>
			        <td><form:input path="empAge"  value="${employee.empAge}" /></td>
			    </tr>
			    <tr>
			        <td>Employee Salary:</td>
			        <td><form:input path="salary"  value="${employee.salary}" /></td>
			    </tr>
			    
			    <tr>
			        <td>Employee Address:</td>
                    <td><form:input path="empAddress" value="${employee.empAddress}" /></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
	 
	 
		<h2>List Employees</h2>
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee Salary</th>
			<th>Employee Address</th>
			
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.empId}"/></td>
				<td><c:out value="${employee.empName}"/></td>
				<td><c:out value="${employee.empAge}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><c:out value="${employee.empAddress}"/></td>
				
			</tr>
		</c:forEach>
	</table>
	</body>
</html>