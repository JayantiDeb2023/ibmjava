package org.courseware.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.courseware.config.config;
import org.courseware.entity.Course;
import org.courseware.entity.Student;
import org.hibernate.Session;

public class ViewStudent extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		processRequest(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Session session=config.getSession();
		TypedQuery <Student> query=session.createQuery("From Student I ",Student.class);
		List<Student> courses=query.getResultList();
		out.println("<table style='border:1px solid black'>");
		out.println("<th>course Name</th><th>Course</th>");
		for(int i=0;i<courses.size();i++)
		{   out.println("<tr>");
			out.println("<td>"+courses.get(i).getName()+"</td>"+"<td>"+courses.get(i).getCourse()+"</td>");
		    out.println("</tr>");
		}
		out.println("</table>");
		out.println("done");
	}

}
