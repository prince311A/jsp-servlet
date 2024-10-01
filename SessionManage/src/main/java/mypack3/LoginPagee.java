package mypack3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Loginpage")
public class LoginPagee extends HttpServlet {
	public void doPost(HttpServletRequest Request,HttpServletResponse Response) throws ServletException,IOException {
		
	String email = Request.getParameter("email");
	String pass = Request.getParameter("pass");
	PrintWriter k = Response.getWriter();
	
	if(email.equals("prince202120")&& pass.equals("prince123")) {
		HttpSession session = Request.getSession();
		session.setAttribute("name_key","Prince Tiwari");
//		Request.setAttribute("name_key","Prince Tiwari");// this can also work but it is lengthy process
	RequestDispatcher rd =	Request.getRequestDispatcher("/profile.jsp");
	rd.forward(Request, Response);
	}
	else {
		Response.setContentType("text/html");
		k.println("<h3> Wrong Email and Password </h3>");
		RequestDispatcher rd =	Request.getRequestDispatcher("/index.html");
		rd.include(Request, Response);
	}

		}

}
