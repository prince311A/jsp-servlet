package mypack2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/calcu")

public class Caculator extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String s="";
		int a = Integer.parseInt(req.getParameter("fno"));
		int b = Integer.parseInt(req.getParameter("sno"));
		out.println("<body bgcolor = yellow>");
		out.println("<center> Wecome in Server side calculator app");
		
		if (req.getParameter("send").equals("ADD"))
		{
			s = String.valueOf(a+b);
		}
		if (req.getParameter("send").equals("SUB"))
		{
			s = String.valueOf(a-b);
		}
		out.println("<br><br>");
		out.println("First No : "+String.valueOf(a));
		out.println("<br><br>");
		out.println("Second No : "+String.valueOf(b));
		out.println("<br><br>");
		out.println("Result : "+s);
		out.println("<br><br>");
		out.println(" Have a nice day ");
		out.println("<br><br>");
		out.println("<a href = http://localhost:8081/calculator/calculate.html>Click Here to return</a>");
		out.println("</center></body>");
	}

}
