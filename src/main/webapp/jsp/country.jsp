<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>country</title>
</head>
<body>
<form action="save" method="post">
<label>country</label>
<input type="hidden" name="id" value="${dbCountry.id}"/>
<input type="text" name="code" value="${dbCountry.code}"/>
<input type="text" name="name" value="${dbCountry.name}"/>
<input type="submit"/>
</form>
<a href="${pageContext.request.contextPath}/countries">back</a>
</body>
</html>