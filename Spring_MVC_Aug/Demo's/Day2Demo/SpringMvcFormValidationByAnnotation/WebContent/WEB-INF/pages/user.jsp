<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>Create User</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-size: 20px;
    
}
</style>

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
 
	 	   
	  <%--  <table>
	        <!-- inline style -->
			<tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
			<!-- style by class css. -->
			<tr><td colspan="2"><form:errors path="*" cssClass="error"/></td></tr> 
			<tr><td>Name : </td><td><form:input path="name" /></td></tr>
			<tr><td>Age : </td><td><form:input path="age" /></td></tr>
			<tr><td>Location : </td><td><form:input path="location" /></td></tr>
			<tr><td>Email : </td><td><form:input path="email" /></td></tr>
			<tr><td>Phone: </td><td><form:input path="mob" /></td></tr>
			<tr><td colspan="2"><input type="submit" value="Register" /></td></tr>
		</table> --%>  
	     </form:form>
</body>
</html>
 

