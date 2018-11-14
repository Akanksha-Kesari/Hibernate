<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Submitted Employee Information</h2>
		   <table border="1">
		   <tr>
		        <td>Employee ID </td>
		        <td>${emp.empId}</td>
		    </tr>
		    <tr>
		        <td>Employee Name</td>
		        <td>${emp.name}</td>
		    </tr>
		    <tr>
		        <td>Employee Age</td>
		        <td>${emp.age}</td>
		    </tr>
		    <tr>
		        <td>Employee Salary</td>
		        <td>${emp.salary}</td>
		    </tr>
		</table>  

	
	</body>
</html>