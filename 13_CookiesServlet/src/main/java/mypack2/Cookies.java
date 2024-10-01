package mypack2;
 import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
 import java.io.*;
 
 @WebServlet("/Cookies")
public class Cookies extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		PrintWriter k = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		k.println("<h3>Hello "+name+" Welcome to my Cookies1 Page</h3>");
		 k.println("<br>");
		 Cookie c = new Cookie("user_name",name);
		 response.addCookie(c);
		 
		k.println("<a href = 'Cooky.jsp'> Click Cooky</a>");
	}
	

}
