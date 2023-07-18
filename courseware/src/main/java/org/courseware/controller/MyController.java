package org.courseware.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends HttpServlet{
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
		List <String> error=new ArrayList <String>();
		String coursename=request.getParameter("name");
		if(coursename.length()==0)
		{
			error.add("please add text");
		}
		double price=0;
		try {
			price=Double.parseDouble(request.getParameter("price"));
		} catch (Exception e) {
			error.add("Invalid format");
		}
		if(error.isEmpty())
		{   request.setAttribute("name", coursename);
		    request.setAttribute("price", price);
			RequestDispatcher view=request.getRequestDispatcher("addcoursename.view");
			view.forward(request, response);
		}
		else {
			request.setAttribute("error", error);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
		
	}

}
