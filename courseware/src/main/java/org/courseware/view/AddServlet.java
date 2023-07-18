package org.courseware.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.courseware.config.*;
import org.courseware.entity.Course;
import org.hibernate.Session;

import antlr.debug.NewLineEvent;

public class AddServlet extends HttpServlet{
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
		String name=(String)request.getAttribute("name");
		double price=(double)request.getAttribute("price");
		session.getTransaction().begin();
		session.save(new Course(name,price));
		session.getTransaction().commit();
		out.println("insertion completed");
	}
}
