package com.employee2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends HttpServlet {
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
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		System.out.println(name);
		List<String> error=new ArrayList<String>();
		if(name.length()==0)
		{
			error.add("enter name");
			
			
		}
		if(city.length()==0)
		{
			error.add("enter city");
		}
		if(error.isEmpty())
		{
			request.setAttribute("name",name);
			request.setAttribute("city",city );
			RequestDispatcher view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		else {
			request.setAttribute("error",error);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
	}

}
