<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido!</title>
</head>

<% String nombres = (String) request.getAttribute("nombres"); %>
<% String apellidos = (String) request.getAttribute("apellidos"); %>
<% String mensaje = "Bienvenido, " + nombres + " " + apellidos; %>
<body>
	<p><%=mensaje%></p>
</body>
</html>