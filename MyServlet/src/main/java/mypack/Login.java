package mypack;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest Request,HttpServletResponse Response)throws IOException,ServletException {
		PrintWriter k= Response.getWriter();
		k.println("Welcome to the login page");
		
	}

}
