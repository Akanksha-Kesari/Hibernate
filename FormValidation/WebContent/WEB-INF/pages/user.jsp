<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>Create User</title>
</head>
<body>
   <form:form action="createUser" method="post" commandName="user">
  <table>
  <tr>
	  <td>Name:</td>
	  <td><form:input  path="name"/></td>
	   <td><font color="red"> <form:errors path="name"></form:errors></font></td>
	   </tr>
	   <tr>
	   <td>Age :</td>
	   <td><form:input path="age"/></td>
	  <td> <font color="red"><form:errors path="age"></form:errors></font></td>
	   </tr>
	   <tr>
	  <td> Location :</td>
	  <td><form:input path="location"/></td>
	   <td><font color="red"><form:errors path="location" ></form:errors></font></td>
	   </tr>
	   <tr>
	  <td> Email: </td>
	  <td><form:input path="email"/></td>
	  <td> <font color="red"><form:errors path="email"></form:errors> </font></td>
	   </tr>
	   <tr>
	   <td>Mobile:</td>
	   <td> <form:input path="mob"/></td>
	   <td><font color="red"><form:errors path="mob" cssClass="error"></form:errors></font></td>
	   </tr>
	   <tr>
	  <td colspan="2" align="center"> <input type="submit" value="Register"></td>
	  </tr>
	   </table>
	     </form:form>
</body>
</html>
 

