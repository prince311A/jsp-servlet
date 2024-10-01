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
Cookie cookies[]= request.getCookies();
boolean f = false;
String name= "";
if(cookies==null){
	out.println("<h1> You are new user</h1>");
	return;
}
else{
	for(Cookie c:cookies){
		String tname = c.getName();
		if(tname.equals("user_name")){
			f = true;
			name = c.getValue();
		}
	}
}
if(f){
out.println("<h3>Hello, "+name+ " Welcome to my Cookies2 Page</h3>");
out.println("<h3>Thankyou.....</h3>");
}
else{
	out.println("<h1> You are new user</h1>");
}
%>

</body>
</html>