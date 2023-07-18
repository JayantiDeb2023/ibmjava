<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.TypedQuery"%>
<%@page import=" javax.servlet.ServletException"%>
<%@page import=" javax.servlet.http.HttpServlet"%>
<%@page import=" javax.servlet.http.HttpServletRequest"%>
<%@page import=" javax.servlet.http.HttpServletResponse"%>

<%@page import=" org.league.entity.LeagueEntity"%>
<%@page import=" org.league2.factory.MyHibernateFactory"%>
<%@page import=" org.league.model.League"%>
<%@page import=" org.hibernate.Session"%>
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
		List<LeagueEntity> leagueList=null;
		response.setContentType("text/html");
		PrintWriter out1 = response.getWriter();
		// Create the set of leagues
		try {
			Session session1=MyHibernateFactory.getHibernateSession();
			TypedQuery<LeagueEntity> query=session1.createQuery(" FROM LeagueEntity L",LeagueEntity.class);
			leagueList=query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		out1.println("<html>");
		out1.println("<head>");
		String pageTitle = "Duke’s Soccer League: List Leagues";
		out1.println("<title>" + pageTitle + "</title>");
		out1.println("</head>");
		out1.println("<body bgcolor='white'>");

		// Generate page heading
		out1.println("<!-- Page Heading -->");
		out1.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
		out1.println("<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>");

		out1.println(" <td><h3>" + pageTitle + "</h3></td>");
		out.println("</tr>");
		out.println("</table>");

		// Generate main body
		out1.println("<p>");
		out1.println("The set of soccer leagues are:");
		out1.println("</p>");

		out.println("<ul>");
		Iterator<org.league.entity.LeagueEntity> items = leagueList.iterator();
		while (items.hasNext()) {
			org.league.entity.LeagueEntity league = items.next();
			out1.println(" <li>" + league.getTitle() + "</li>");
		}
		out1.println("</ul><br/><br/>");
		out1.println("<a href='index.html'>Home</a>");
		out1.println("</body>");
		out1.println("</html>");%>
</body>
</html>