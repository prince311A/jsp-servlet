package mypack;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/*import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
*/
public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Prince Tiwari");
		response.setContentType("text/html");
		PrintWriter k = response.getWriter();
		k.print("I am do get method");
		k.println("<body bgcolor=cyan> ");

		k.println("WELCOME TO THIS <b> HttpServlet</b> APPLICATION");

		k.println("<br><br>");

		k.println("HELLO , HOW ARE YOU ? I am server side servlet application");

		k.println("<br><br><br>");

		String s = "I <b>HOPE</b> YOU ARE <br><br><center>F<br>I<br>N<br>E<br></center>";

		k.println(s);

		k.println("<br><br>");

		k.println("HAVE A NICE DAY");

		k.println("<br><br>");
		message(k);
		k.println("BYE,BYE");

	}// service()

	public void message(PrintWriter k) {
		k.println("This is message function ");
		k.println("<br><br>");
		k.println("It is called inside service methods");
		k.println("<br><br>");
		k.println("</body>");
	}

}
