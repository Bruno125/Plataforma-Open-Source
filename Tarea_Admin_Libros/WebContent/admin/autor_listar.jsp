<%@page import="beans.AutorBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de autores</title>
</head>
<body>
	<% 
		String nombre = (String)session.getAttribute("nombre");
		List<AutorBean> autores = (List<AutorBean>)request.getAttribute("listaAutores");  %>

	<h1>Bienvenido <%=nombre %></h1>
	<h2>Listado de autores</h2>
	<table>
		<thead>
			<tr>
				<th>Nombres</th>
				<th>Apellidos</th>
				<th>Opciones</th>
			</tr>
		</thead>
		<tbody>
			<%for(int i=0; i<autores.size();i++){ %>
			<tr>
				<td><%=autores.get(i).getNombres()%></td>
				<td><%=autores.get(i).getApellidos()%></td>
				<td>
					<a href="<%=getServletContext().getContextPath() %>/Autor_Borrar?codigo=<%=autores.get(i).getId()%>">Borrar</a>
					<a href="<%=getServletContext().getContextPath() %>/Autor_Editar?codigo=<%=autores.get(i).getId()%>">Editar</a>			
				</td>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>