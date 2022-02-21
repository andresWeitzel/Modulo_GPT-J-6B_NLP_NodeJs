<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
		
		  <h1>Formulario Principal</h1>
        
        <form action="ValidacionFormularioServlet" method="POST">
            
            <p>Nombre:<input type="text" name="nombre"></p>
            
            <p>Apellido:<input type="text" name="apellido"></p>
            
            <p>Género:
            <select  name="genero">
                <option>Masculino</option>
                <option>Femenino</option>
            </select >
            </p>
            
            <p>Soy Mayor de Edad<input type="checkbox" name="mayorEdad" value="si"></p>
            
            <p><input type="submit" value="enviar"></p>
            
        </form>
</body>
</html>