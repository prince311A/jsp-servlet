<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = (String)request.getAttribute("name_key");
%> 
<h3> Welcome :_<%= name %></h3>
<a href = "check.jsp"> Lets Check</a>
</body>
</html>