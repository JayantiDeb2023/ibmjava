package org.controller.view;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.product.model.Product;

public class ViewServlet extends HttpServlet{
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
		FileInputStream file=new FileInputStream("file.txt");
		ObjectInputStream output=new ObjectInputStream(file);
		boolean read=true;
		try {
			out.println("<ul>");
			while(read)
			{
			{Product e=(Product)output.readObject();
					out.println("<li>"+e.toString()+"</li>");
			        }
				out.println("</ul>");
				out.println("done");
			}
		}
		catch(EOFException e)
		{
	       read=false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
