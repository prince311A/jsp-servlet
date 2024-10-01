package mypack1;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

//@WebServlet("/LoginForm")

public class LoginForm extends HttpServlet {
	public void doPost (HttpServletRequest Request, HttpServletResponse Response) throws IOException, ServletException {
		PrintWriter k = Response.getWriter();
		String id = Request.getParameter("id");
		String pass = Request.getParameter("password");
		Response.setContentType("text/html");
		
		k.println("User Loginid is "+id);
		k.println("<br><br>");
		k.println("User password is "+pass);
		k.println("<br><br>");

         k.println("<body bgcolor=yellow>");
         k.println("</body>");

	}
}
