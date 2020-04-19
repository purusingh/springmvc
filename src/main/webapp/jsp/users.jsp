<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/users/0">Add</a>
	<table border="1">
		<c:forEach items="${listUsers}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
				<td><a
					href="${pageContext.request.contextPath}/users/${user.id}">Edit</a></td>
				<td><a
					href="${pageContext.request.contextPath}/users/${user.id}/delete">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
<a href="${pageContext.request.contextPath}">back to index</a>

</body>


</html>