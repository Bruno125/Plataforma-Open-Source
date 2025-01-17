<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.List,Beans.AutorBean"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Autores</title>
</head>
<body>
	<h2>Autores</h2>
	
	<%
			List<AutorBean> autores = (List<AutorBean>) request.getAttribute("data"); 
				if(autores==null || autores.size()==0) {
		%>
		<p>No hay información disponible</p>
	<%
		}else{
	%>
		<table>
		<thead>
			<tr>
				<td>Nombres</td>
				<td>Apellidos</td>
			</tr>
		</thead>
		<tbody>
		<%
			for(AutorBean autor : autores) {
		%>
			<tr>
				<td><%=autor.getNombres() %></td>
				<td><%=autor.getApellidos() %></td>
				<td><a href="autor_editar?id=<%=autor.getId()%>">Editar</a></td>
				<td><a href="eliminar_autor?id=<%=autor.getId()%>">Borrar</a></td>
			</tr>
		<%}%>
		</tbody>
		</table>
	<%}%>
</body>
</html>