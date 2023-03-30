<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Platform 3 Solutions</title>
</head>
<body>

	Welcome to Web Page
	<%=request.getParameter("pagename")%>

	<img src="company_logo.png" alt="Company Logo" id="logo">
	
	<form action="login" method="post">
		<label for="email">Email:</label> 
		<input type="text" id="email"
			name="email" required> 
			<label for="password">Password:</label>
		<input type="password" id="password" name="password" required>
		<input type="submit" value="Submit">
	</form>
	<a href="http://www.p3.com">www.p3.com</a>


</body>
</html>