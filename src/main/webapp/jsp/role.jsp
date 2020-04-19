<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save" method="post">
		<label>role</label> 
		<input type="hidden" name="id"
			value="${dbRole.id}" /> 
			<input type="text" name="name"
			value="${dbRole.name}" /> 
			<input type="submit"/>
			</form>
			<a href="${pageContext.request.contextPath}/roles">back</a>
	
