<%@page import="com.hospital.controller.Controller"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div></div>
	<div>
		<%
			if (Controller.adminRegistration == true) {
		%>

		<h3>
			Registration successfull click button to log in
			<button onclick="window.location.href='Login.jsp'">Log In</button>
		</h3>
		<%
			} else {
		%>
		<h3>Sorry registeration failed <a href="Registeration.jsp">click..</a>here to try again</h3>
		<%
			}
		%>
	</div>
</body>
</html>