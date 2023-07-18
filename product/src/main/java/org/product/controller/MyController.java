package org.product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.product.model.Product;

public class MyController extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		processRequest(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		List<Product> products=new ArrayList<Product>();
		 String urlString=request.getRequestURI().toString();
		 if(urlString.equals("view_list.html"))
		 {   
			 RequestDispatcher view=request.getRequestDispatcher("view_list.view");
		     view.forward(request, response); 
		 }
		 else {
			
		RequestDispatcher view=request.getRequestDispatcher("add_list.view");
		view.forward(request, response);}
		
	}

}
