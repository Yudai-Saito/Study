package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns= {"/HelloServlet"})
public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("Hello");
	}
}
