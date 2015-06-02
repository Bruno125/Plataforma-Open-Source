<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String nombre = (String)session.getAttribute("nombre"); %>

	<h1>Bienvenido <%=nombre %></h1>
	<h2>Opciones disponibles</h2>
	<ul>
		<li><a href="admin/autor_agregar.jsp">Agregar autor</a></li>
		<li><a href="admin/genero_agregar.jsp">Agregar genero</a></li>
		<li><a href="admin/editorial_agregar.jsp">Agregar editorial</a></li>
		<li><a href="libro_agregar">Agregar libro</a></li>
		<li><a href="<%=getServletContext().getContextPath() %>/autor_listar">Listar autor</a></li>
		<li><a href="<%=getServletContext().getContextPath() %>/cerrar_sesion">Cerrar sesión</a></li>
	</ul>
</body>
</html>