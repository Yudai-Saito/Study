package servlet;

import main.Status;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns= {"/sts"})
public class StatusServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		Status sts = new Status();
		out.println("your fortune is " + sts.getResult());		
	}
}
