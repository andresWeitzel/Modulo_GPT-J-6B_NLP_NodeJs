<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validacion Formulario</title>
</head>
<body>

	  <h1>Datos Ingresados</h1>
        
        <!--
        Para mostrar codigo java en jsp se coloca en 
        Recordar colocar el igual seguido de las Signos de apertura
        sin colocar ; luego de cada linea
        -->
        <p>Nombre <%= session.getAttribute("nombre")  %></p>
        <p>Apellido <%= session.getAttribute("apellido")  %></p>
        <p>Género   <%= session.getAttribute("genero")  %></p>
        <p>Es el Usuario Mayor de Edad?   <%= session.getAttribute("mayorEdad")  %></p>

</body>
</html>