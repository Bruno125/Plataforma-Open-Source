<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,java.util.ArrayList,model.Libro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Libro> libros = (ArrayList<Libro>) request.getAttribute("libros"); %>
<% if(libros!=null && libros.size()>0){ %>
	<table>
		<tr>
			<td>Titulo</td>
			<td>ISBN</td>
			<td>Genero</td>
			<td>Editorial</td>
		</tr>
		<% for(Libro libro : libros){ %>
			<tr>
				<td><%=libro.getTitulo()%></td>
				<td><%=libro.getIsbn() %></td>
				<td><%=libro.getGenero().getNombre() %></td>
				<td><%=libro.getEditorial().getNombre() %></td>
			</tr>
		<% } %>
	</table>
	

	<ul>
		<% for(Libro libro : libros){ %>
			<li><%=libro.getTitulo()%></li>
			<ul>
				<li>
			</ul>
		<% } %>
	</ul>
<% }else{ %>
	<p>No hay libros disponibles</p>
<% } %>
</body>
</html>