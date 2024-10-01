package mypack2;

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

	public class LoginPage extends HttpServlet {
		
		public void doPost(HttpServletRequest Request,HttpServletResponse Response) throws ServletException,IOException {
			
		String email = Request.getParameter("email");
		String pass = Request.getParameter("pass");
		PrintWriter k = Response.getWriter();
		
		if(email.equals("prince202120")&& pass.equals("prince123")) {
//		RequestDispatcher rd =	Request.getRequestDispatcher("/WelcomePage");
		RequestDispatcher rd =	Request.getRequestDispatcher("/profile.jsp");
		Request.setAttribute("name_key","Prince Tiwari");
		HttpSession session = Request.getSession();
		session.setAttribute("name_key","Prince Tiwari");
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
