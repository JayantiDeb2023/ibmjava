package org.courseware.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.courseware.config.*;
import org.courseware.entity.Course;
import org.hibernate.Session;

public class SearchCourse extends HttpServlet{
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
		String course=(String)request.getParameter("course");
		Session session=config.getSession();
		session.getTransaction().begin();
		TypedQuery <Course> query=session.createQuery("From Course I where I.coursename=:name1",Course.class);
		query.setParameter("name1", course);
		List<Course> course2=query.getResultList();
		if(course2.isEmpty())
			out.println("Sorry no course is found try again");
		else {
			out.println(course2.get(0));
		}
	}

}
