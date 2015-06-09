<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Crear autor</h3>
<form action="AutorCrear" method="post">
	<p>Nombres: <input type="text" name="nombres"/></p>
	<p>Apellidos: <input type="text" name="apellidos"/></p>
	<p>Nacionalidad: <input type="text" name="nacionalidad"/></p>
	<p><input type="submit" name="guardar" value="Guardar"/>
</form>
<% String mensaje = (String) request.getAttribute("mensaje"); %>
<% if(mensaje!=null && !mensaje.equals("")){ %>
	<p><%=mensaje %></p>
<% } %>
</body>
</html>