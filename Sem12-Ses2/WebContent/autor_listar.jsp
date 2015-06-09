<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,model.Autor"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de autores</title>
</head>
<body>
<h3>Listado de autores</h3>

<% String mensaje = (String) request.getAttribute("mensaje"); %>
<% if(mensaje!=null && !mensaje.equals("")){ %>
	<p><%=mensaje %></p>
<% } %>

<%List<Autor> autores = (List<Autor>) request.getAttribute("autores"); %>
<%if(autores!=null && autores.size()>0){ %>
<table border="1">
	<tr>
		<td>Id</td>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Nacionalidad</td>
		<td>Acciones</td>
	</tr>
	<% for(Autor autor : autores){%>
		<tr>
			<td><%=autor.getId() %></td>
			<td><%=autor.getNombres() %></td>
			<td><%=autor.getApellidos() %></td>
			<td><%=autor.getNacionalidad() %></td>
			<td><a href="AutorEliminar?id=<%=autor.getId()%>">Eliminar</a>
		</tr>
	<%} %>
</table>
<%} else{ %>
	<p>No hay autores disponibles.</p>
<%} %>
</body>
</html>