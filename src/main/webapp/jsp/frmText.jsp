<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="frmText" method="post" >
	<label>Email</label>
	<input type="email" name="email" />
	<label>Subject</label>
	<input type="text" name="subject" />
	<label>body</label>
	<textarea rows="3" cols="10" name="body"></textarea>
	<input type="submit" />
	</form>
</body>
</html>