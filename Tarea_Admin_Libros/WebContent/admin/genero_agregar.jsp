<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de genero</title>
</head>
<% String nombre = (String)session.getAttribute("nombre"); %>
<body>
	<h1>Bienvenido <%=nombre %></h1>
	<h2>Registro de Genero</h2>
	<form action="../genero_agregar" method="post">
		<p>Nombre: <input type="text" name="nombre" /></p>
		<p>Descripcion: <input type="text" name="descripcion"></p>
		<p><input type="submit" name="" value="Guardar genero" /></p>
	</form>
</body>
</html>