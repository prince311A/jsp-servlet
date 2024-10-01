<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
 int a = 10;
String name = "I m Prince Tiwari";
int square(){
	return a*a;
}
%>
<%
String message = "Have a good day prince";
int b = 20;
if(a>b){
	out.println(a+" is greater than "+b);
}
else{
	out.println(a+" is smaller than "+b);
}
%>
<br><br>
a = <%=a%><br><br>
b = <%=b%><br><br>
The square of the number <%=a%> is <%= square() %>
</body>
</html>