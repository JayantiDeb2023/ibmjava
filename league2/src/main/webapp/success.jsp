<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
 <%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<%@page import="org.league.entity.LeagueEntity"%>
<%@page import="org.league2.factory.MyHibernateFactory"%>
<%@page import="org.league.model.League"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
		response.setContentType("text/html");
		PrintWriter out1 = response.getWriter();
		League league = (League) request.getAttribute("LEAGUE");
		LeagueEntity entity=new LeagueEntity(league.getYear(), league.getSeason(), league.getTitle());
		try {
			
		
		Session session1=MyHibernateFactory.getHibernateSession();
		session1.getTransaction().begin();
		session1.save(entity);
		session1.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		out1.println("<h2>League Added Sucessfully</h2><hr><br/>" + "League year: " + league.getYear()
				+ "<br/>League season: " + league.getSeason() + "<br/>" + "League title: " + league.getTitle()
				+ "<br/><br/>");

		out1.println("<a href='index.html'>Home</a>");
		%>
</body>
</html>