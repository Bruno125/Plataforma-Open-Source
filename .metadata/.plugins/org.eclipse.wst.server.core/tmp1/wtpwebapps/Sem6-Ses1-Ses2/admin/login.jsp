<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="util.MD5"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/style.css"/>
</head>
<body>
<div class="loginform-in">
<h1>User Login</h1>
	<% 

	String usuario="";
	String clave ="";
	try{

		//Consultar las cookies y verificar las cookies
		Cookie[] cookies = request.getCookies();
		
		for(Cookie c : cookies){
			if(c.getName().equals("usuario"))
				usuario = c.getValue();
			else if(c.getName().equals("clave"))
				clave= c.getValue();
		}
		System.out.print("Clave: " + clave);

	}catch(Exception e){
	}
	
	
	
	String mensaje = (String) request.getAttribute("mensaje");
	mensaje = (mensaje==null)?"":mensaje;%>
	<div class="err" id="add_err"></div>
	<p><%=mensaje%></p>
	<form action="<%=getServletContext().getContextPath()%>/login" method="post">
		
		<p> <label for="name">Username </label>
		<input type="text" size="30"  name="usuario" value="<%=usuario %>" /></p>
		<p> <label for="name">Password</label>
		<input type="password" size="30"  name="clave" value="<%=clave %>" /></p>
		<p><input type="checkbox" checked="true" name="recordar"/>Mantenerme logeado</p>
		<input type="submit" id="login" name="login" value="Login" class="loginbutton" ></p>
    </form>	
	</div>
</body>
</html>