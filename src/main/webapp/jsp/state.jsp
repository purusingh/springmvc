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
		<label>state</label> 
		<input type="hidden" name="id"
			value="${dbState.id}" /> 
			<input type="text" name="code"
			value="${dbState.code}" /> 
			<input type="text" name="name"
			value="${dbState.name}" /> 
			<select name="country.id">
				<c:forEach items="${CountryList}" var="country">
					<option value="${country.id}"
					<c:if test="${dbState.country.id==country.id}">
						selected
					</c:if>
					>${country.name}</option>
				</c:forEach>
			</select>
			<input type="submit"/>
			</form>
			<a href="${pageContext.request.contextPath}/states">back</a>
	

</body>
</html>