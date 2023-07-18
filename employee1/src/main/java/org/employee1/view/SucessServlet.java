package org.employee1.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.employee1.model.Employee;

public class SucessServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		processrequest(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		processrequest(request,response);
	}
	public void processrequest(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Employee employee=(Employee)request.getAttribute("emp");
		out.println("hello"+employee.getName()+" your age is"+employee.getAge());
		
	}

}
