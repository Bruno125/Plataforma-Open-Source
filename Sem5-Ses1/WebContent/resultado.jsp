<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
	.incorrecto {
		color: #f00
	}
	.correcto{
		color: #00f
	}
</style>
<title>Resultado</title>
</head>
<body>
	<% 
		String mensaje = (String) request.getAttribute("mensaje");
		boolean cumple = (boolean) request.getAttribute("cumple");
		String clase = (cumple)?"correcto":"incorrecto";
	%>
	<p class="<%=clase %>"><%=mensaje %></p>
	
</body>
</html>