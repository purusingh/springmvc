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
		<label>product</label> 
		<input type="hidden" name="id"
			value="${dbProduct.id}" /> 
			<input type="text" name="name"
			value="${dbProduct.name}" /> 
			<select name="category.id">
				<c:forEach items="${CategoryList}" var="category">
					<option value="${category.id}"
					<c:if test="${dbProduct.category.id==category.id}">
						selected
					</c:if>
					>${category.name}</option>
				</c:forEach>
			</select>
			<input type="submit"/>
			</form>
			<a href="${pageContext.request.contextPath}/products">back</a>
	
</body>
</html>