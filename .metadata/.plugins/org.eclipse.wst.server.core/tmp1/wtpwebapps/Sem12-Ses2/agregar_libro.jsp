<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,java.util.ArrayList,model.Genero,model.Editorial" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Agregar libro</h3>
<form method="post" action="LibroAgregar">
	<ul>
	<li>Genero:
		<select name="genero">
		<% List<Genero> generos = (ArrayList<Genero>) request.getAttribute("generos");%>
		<% if(generos!=null && generos.size()>0){ %>
				<% for(Genero genero : generos){ %>
					<option value="<%=genero.getId()%>"><%=genero.getNombre()%></option>
				<% } %>
		<% } %>
		</select>
	</li>
	<li>Editorial:
		<select name="editorial">
		<% List<Editorial> editoriales = (ArrayList<Editorial>) request.getAttribute("editoriales");%>
		<% if(editoriales!=null && editoriales.size()>0){ %>
			
				<% for(Editorial editorial : editoriales){ %>
					<option value="<%=editorial.getId()%>"><%=editorial.getNombre()%></option>
				<% } %>
		<% } %>
		</select>
	</li>
	<li>Titulo: <input type="text" name="titulo"/></li>
	<li>Descripcion: <input type="text" name="descripcion"/></li>
	<li>ISBN: <input type="text" name="isbn"/></li>
	<li>Imagen: <input type="file" name="imagen"/></li>
	</ul>
	
	<input type="submit" value="Agregar libro"/>
	
</form>
</body>
</html>