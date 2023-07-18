package org.employee1.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	processrequest(request,response);
}
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	processrequest(request,response);
}
public void processrequest(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	List<String> err=(List<String>)request.getAttribute("Error");
	out.println("</ul>");
	for(String s:err)
	{
		out.println("<li>"+s+"</li>");
	}
	out.println("</ul><br/>");
	out.println("<a href='index.html'>Try Again</a>");
}
}
