<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Registro de autores</h2>
	<form method="post" action="../autor_agregar">
		<p> Nombres: <br/> <input type="text" name="nombres"/>
		<p> Apellidos: <br/> <input type="text" name="apellidos"/>
		<p> Nacionalidad: <br/> <input type="text" name="nacionalidad"/>
		<p><input type="submit"/> </p>
	</form>
</body>
</html>