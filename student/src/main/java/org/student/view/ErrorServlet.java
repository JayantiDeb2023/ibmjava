package org.student.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		processRequest(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{ 
		List<String> error=(List<String>) request.getAttribute("error");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<ul>");
		for(String s:error)
		{
			out.println("<li>"+s+"</li>");
		}
		out.println("</ul>");
		out.println("try again");
		
	}
}
