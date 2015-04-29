<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de autores</title>
</head>
<% String nombre = (String)session.getAttribute("nombre"); %>
<body>

	<h1>Bienvenido <%=nombre %></h1>
	<h2>Registro de autores</h2>
	<form action="../autor_agregar" method="post">
		<p>Nombres: <input type="text" name="nombres" /></p>
		<p>Apellidos: <input type="text" name="apellidos" /></p>
		<p>Nacionalidad: <input type="text" name="nacionalidad" /></p>
		<p><input type="submit" name="" value="Guardar autor" /></p>
	</form>
</body>
</html>