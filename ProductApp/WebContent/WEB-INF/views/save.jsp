<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List</h2><br>
<a href="add.html">Add new product</a><br>
<c:if test="${!empty products}">
	<table align="left" border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			</tr>

		<c:forEach items="${products}" var="product">
			<tr>
				<td><c:out value="${product.pid}"/></td>
				<td><c:out value="${product.pname}"/></td>
				<td><c:out value="${product.price}"/></td>
				</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>