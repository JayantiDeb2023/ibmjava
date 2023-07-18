package org.example1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.employee1.model.Employee;

public class MyController extends HttpServlet{
protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	processRequest(request,response);
}
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	processRequest(request,response);
}
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<String> error=new ArrayList<String>();
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	if(name.length()<=0)
		error.add("name cannot be blank");
	int age=0;
	try {
		age=Integer.parseInt(request.getParameter("age"));
	} catch (Exception e) {
		error.add("age must be numeric");
	}
	if(age<18)
		error.add("Age must be above 18");
	if(!error.isEmpty())
	{   request.setAttribute("Error", error);
		RequestDispatcher view=request.getRequestDispatcher("error.view");
		view.forward(request, response);
	}
	else {
		Employee employee=new Employee(name,age);
		request.setAttribute("emp",employee);
		RequestDispatcher view=request.getRequestDispatcher("success.view");
		view.forward(request, response);
	}
}
}
