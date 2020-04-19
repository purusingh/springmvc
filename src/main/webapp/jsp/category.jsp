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
<label>category</label>
<input type="hidden" name="id" value="${dbCategory.id}"/>
<input type="text" name="name" value="${dbCategory.name}"/>
<input type="submit"/>
</form>
<a href="${pageContext.request.contextPath}/categories">back</a>
</body>
</html>