<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to My First JSP Page</h3>
<%
String name = "Prince Tiwari";
int length = name.length();
%>
The length of the String is <%=length %>
</body>
</html>