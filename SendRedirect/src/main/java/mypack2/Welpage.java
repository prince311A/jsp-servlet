package mypack2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/WelcomePage")
public class Welpage extends HttpServlet {
	public void doGet(HttpServletRequest Request,HttpServletResponse Response) throws ServletException,IOException {
		PrintWriter k = Response.getWriter();
		k.println("Welcome Prince Tiwar");
			
		}
}
