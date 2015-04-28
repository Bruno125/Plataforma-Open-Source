<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<% String titulo = (String) request.getAttribute("titulo");  %>
<title><%=titulo %></title>
</head>
<body>
	<%	String descripcion = (String) request.getAttribute("descripcion");
		String fecha = (String) request.getAttribute("fecha");	%>
	<h2><%=titulo %></h2>
	<p><%=descripcion %></p>
	<p><%=fecha %></p>
</body>
</html>