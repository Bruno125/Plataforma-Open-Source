<%@page import="beans.GeneroBean"%>
<%@page import="beans.EditorialBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de libros</title>
</head>
	<% String nombre = (String)session.getAttribute("nombre"); %>s
<body>
	<%
		List<GeneroBean> generos = (List<GeneroBean>)request.getAttribute("listaEditorial");
		List<EditorialBean> editoriales = (List<EditorialBean>)request.getAttribute("listaGenero");
	%>

	<h1>Registro de libros</h1>
	<form action="<%=getServletContext().getContextPath() %>/libro_agregar" method="post">
		<p>Genero*:</p>
		<select name="genero">
		<% for(int i=0;i<generos.size();i++){%>
			<option value="<%=generos.get(i).getNombre()%>"><%=generos.get(i).getNombre()%></option>
		<% } %>
		</select>
		<p>Editorial*:</p>
		<select name="editorial">
		<% for(int i=0;i<editorials.size();i++){%>
			<option value="<%=editoriales.get(i).getNombre()%>"><%=editoriales.get(i).getNombre()%></option>
		<% } %>
		</select>
		<p>Titulo*: <input type="text" name="titulos"/></p>
		<p>ISBN*: <input type="text" name="ISBN" /></p>
		<p>Sinopsis*:</p>
			<textarea name="sinopsis" rows="3">
		</textarea>
		<p><input type="submit" name="" value="Guardar Libro" /></p>
	</form>
</body>
</html>