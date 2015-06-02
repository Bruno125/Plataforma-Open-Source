<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script>
	$(document).ready(function() {
		$('#submit').click(function(event) {
			var valor1 = $('#valor1').val();
			var valor2 = $('#valor2').val();
			var opcion = $('#opcion').val();
			console.log('valor1: ' + valor1);
			console.log('valor2: ' + valor2);
			console.log('opcion: ' + opcion);      
			$form = $(this);     
			$.post($form.attr('action'), $form.serialize(), {
				opcion : opcion,
				valor1: valor1,
				valor2: valor2
			}, function(responseText) {
				//$('#al').innerHtml=responseText;
				//alert('Resultado: ' + responseText);
				console.log('Resultado: ' + responseText);
			});
		});
	});
</script>
</head>
<body>
	<form action="<%=getServletContext().getContextPath() %>/calculadora">
		<p>Operacion: 
			<select name="opcion" id="opcion">
				<option value="suma">Suma</option>
				<option value="resta">Resta</option>
				<option value="multiplicacion">Multiplicacion</option>
				<option value="division">Division</option>
			</select>
		</p>
		<p>Valor 1: <br/><input type="text" name="valor1" id="valor1"/></p>
		<p>Valor 2: <br/><input type="text" name="valor2" id="valor2"/></p>
		<input type="submit" id="submit" value="Calcular"/>
		<p>Resultado: <label id="resultado"></label>
	</form>
</body>
</html>


