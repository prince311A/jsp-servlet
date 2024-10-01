package mypack2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/Searchhere")

public class SendRedirect extends HttpServlet {
	
	public void service(HttpServletRequest Request,HttpServletResponse Response) throws ServletException,IOException {
		
	String search = Request.getParameter("search");
	
	 Response.sendRedirect("Https://www.google.com/search?q="+search); // for outside things
//	 Response.sendRedirect("WelcomePage"); // this is for servlet redirect
 
		
	}

}
