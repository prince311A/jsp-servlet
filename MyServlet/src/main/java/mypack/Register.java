package mypack;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
//@WebServlet("/aaa")
public class Register extends HttpServlet { 
	public void doGet(HttpServletRequest Request,HttpServletResponse Response) throws ServletException,IOException {
	PrintWriter k = Response.getWriter();
	k.print("Welcome to the resgister page");
	System.out.println("Register");
	}

}
