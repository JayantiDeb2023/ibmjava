package org.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.student.model.Student;

public class MyController extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		processRequest(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{   List<String> error=new ArrayList<String>();
	    List<Student>stud=new ArrayList<Student>();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		if(name.length()==0)
			error.add("please write your name");
		int age=0;
		try {
			age=Integer.parseInt(request.getParameter("age"));
		} catch (Exception e) {
			error.add("wrong format");
		}
		if(age<4)
			{error.add("you are not a school going student");
			}
		if(!error.isEmpty())
		{
			request.setAttribute("error", error);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
		else {
			Student a=new Student(name,age);
			stud.add(a);
			request.setAttribute("student", a);
			request.setAttribute("studentlist", stud);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
			
		}
		
	}

}
