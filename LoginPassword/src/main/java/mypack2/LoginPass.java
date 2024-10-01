package mypack2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/LoginPassmy")
public class LoginPass extends HttpServlet{
public void doPost(HttpServletRequest Request,HttpServletResponse Response)throws IOException,ServletException {
	
	String Username = (String)Request.getParameter("username");
	String Password = (String)Request.getParameter("password");
	PrintWriter k = Response.getWriter();
	
	if(Username.equals("prince202120")&& Password.equals("prince123")) {
		
		k.println("Welcome to the Login Page");
	}
	else {
		k.print("Wrong Username And Password");
	}
}
}
