<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<%!
		public String mensaje(int dato){
			return "Mensaje: " + dato;
		}
	%>
	<h2>Intro a JSP</h2>
	
	<p>La hora actual es: <%=(new Date()).toString() %></p>
	<p>Hola tu edad es: 50 </p>
	
	<p>Table del 12 usando for</p>
	<%for(int i=0;i<=12;i++){%>
		<%out.print("12 * " +i + " = " + i*12 ); %><br/>
	<%}%>
	
	
	
	<%@ include file="footer.jsp" %>
	<!-- Comentario HTML -->
	<%-- Comentario JSP --%>
</body>
</html>