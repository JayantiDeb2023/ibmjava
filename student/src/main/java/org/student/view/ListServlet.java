package org.student.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.student.model.Student;

public class ListServlet extends HttpServlet{
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
		List<Student> a=(List<Student>)request.getAttribute("studentlist");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(a.isEmpty())
			out.println("no student avaliable");
		else {
			out.println("<ul>");
			for(Student e:a)
			{
				out.println("<li>"+e.toString()+"</li>");
			}
			out.println("</ul>");
			out.println("done");
		}
	}
}
