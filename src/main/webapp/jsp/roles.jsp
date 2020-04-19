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
<a href="${pageContext.request.contextPath}/roles/0">Add</a>
	<table border="1">
		<c:forEach items="${listRoles}" var="role">
			<tr>
				<td>${role.id}</td>
				<td>${role.name}</td>
				<td><a
					href="${pageContext.request.contextPath}/roles/${role.id}">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/roles/${role.id}/delete">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
<a href="${pageContext.request.contextPath}">back to index</a>
</body>
</html>