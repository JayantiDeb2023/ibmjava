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

import antlr.debug.NewLineEvent;

public class RegisterServlet extends HttpServlet{
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
		session.getTransaction().begin();
		String name=(String)request.getParameter("name");
		String course1=(String)request.getParameter("course");
		TypedQuery<Course> query=session.createQuery("From Course I where I.coursename=:name1",Course.class);
		query.setParameter("name1", course1);
		List<Course>course2=query.getResultList();
		if(!course2.isEmpty())
		{session.save(new Student(name,course2.get(0)));
		out.println("registered successfully");
		}
		session.getTransaction().commit();
	}
	

}
