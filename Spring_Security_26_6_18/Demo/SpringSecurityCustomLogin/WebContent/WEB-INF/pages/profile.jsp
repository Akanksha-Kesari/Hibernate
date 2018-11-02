<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true" %>
<html>
<head>
<title>This is Profile Page</title>
</head>
<body>
<!-- , logout functionality to work we has to make the spring specific link '/j_spring_security_logout'.
 By clicking the link spring-security will logged out the current logged in used.  -->

<%-- <c:url value="/j_spring_security_logout" var="logoutUrl" /> --%>
	<center>
		<br /> <br /> <br />
<h2>This Profile Page | You are now logged in</h2>
<a href="<c:url value="/j_spring_security_logout" />" >Logout</a>
		<%--  <h3><a href="${logoutUrl}">Logout</a></h3> --%> 
		</center>
</body>
</html>