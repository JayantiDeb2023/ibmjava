package com.employee2.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.employee2.config.SpringConfig;
import com.employee2.model.Employee;

public class SuccessServlet extends HttpServlet {
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
		ApplicationContext con= new AnnotationConfigApplicationContext(SpringConfig.class);
		SessionFactory sessionFactory=con.getBean("getsession",SessionFactory.class);
		Session session=sessionFactory.openSession();
		String name=(String)request.getAttribute("name");
		String city=(String)request.getAttribute("city");
		Employee e=new Employee(name,city);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		session.getTransaction().begin();
		session.save(e);
		session.getTransaction().commit();
		out.println("inserted successfully");
		out.println(e.toString());
	}

}
