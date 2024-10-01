package mypack2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet {
		
		public void doPost(HttpServletRequest Request,HttpServletResponse Response) throws ServletException,IOException {
		PrintWriter k = Response.getWriter();
		k.println("Welcome Prince Tiwar");
		String name = Request.getParameter("email");
		k.println(name);
		}
}
