<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="Beans.AutorBean"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% AutorBean autor = (AutorBean) request.getAttribute("autor"); %>
	<h2>Edicion de autor</h2>
	<form method="post" action="<%=getServletContext().getContextPath() %>/autor_editar">
		<input type= "hidden" name="id" value="<%=autor.getId() %>">
		<p> Nombres: <br/> <input type="text" name="nombres" value="<%=autor.getNombres()%>"/>
		<p> Apellidos: <br/> <input type="text" name="apellidos" value="<%=autor.getApellidos()%>"/>
		<p> Nacionalidad: <br/> <input type="text" name="nacionalidad "value="<%=autor.getNacionalidad()%>"/>
		<p><input type="submit" value="Guardar cambios"/> </p>
	</form>
</body>
</html>