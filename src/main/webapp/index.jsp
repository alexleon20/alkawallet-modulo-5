<%-- 
    Document   : index
    Created on : 03-06-2024, 01:48:24
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        
        <div>
            <nav class="navbar navbar-dark bg-primary">
            <h1>AlkaWallet</h1>
            </nav>
        </div>
        
        <div class="container">
	<form method="post" action="#">
            <div class="mb-3">
                <label for="nombre" class="form-label">Usuario</label>
                 <input type="text" class="form-control" name="nombre" id="nombre" aria-describedby="tuNombre" placeholder="Ingrese su usuario">
            </div>
            
            <div class="form-group">
                <label for="exampleInputPassword1">Contraseña</label>
                <input type="password" class="form-control" id="contrasena" placeholder="Ingrese contraseña">
            </div>
            <br>
            <button type="submit" class="btn btn-primary">Ingresar</button>
            
            </div>
            
	</form>
	</div>
        
    </body>
</html>
