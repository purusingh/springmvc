<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save" method="post">
		<label>user</label> 
		<input type="hidden" name="id"
			value="${dbProduct.id}" /> 
			<input type="text" name="firstName"
			value="${dbProduct.name}" /> 
			<input type="text" name="lastName"
			value="${dbProduct.name}" /> 
			<input type="text" name="email"
			value="${dbProduct.name}" /> 
			
				<c:forEach items="${listRoles}" var="role">
				<div>
					<input type="checkbox" value="${role.id}" />
					${role.name}
					</div>
				</c:forEach>
	
			<input type="submit"/>
			</form>
			<a href="${pageContext.request.contextPath}/users">back</a>
	
</body>
</html>