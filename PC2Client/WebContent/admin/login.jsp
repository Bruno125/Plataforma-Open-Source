<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iniciar sesion</title>
</head>
<body>
<h2>Iniciar sesion</h2>
<form method="post" action="<%=request.getContextPath()%>/login">
	<p>Usuario: <input type="text" name="usuario"/></p>
	<p>Contraseņa: <input type="password" name="clave"/></p>
	<p><input type="submit" value="Ingresar" name="submit"/></p>
</form>

<% String mensaje = (String) request.getAttribute("mensaje"); %>
<% if(mensaje!=null && !mensaje.equals("")){ %>
	<p><%=mensaje %></p>
<% } %>
</body>
</html>