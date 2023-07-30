<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>Panel User</title>
</head>
<body>
    <h1>Hola Profe</h1>

    <!-- FORM INICIO -->

    <p>Bienvenido</p>

    <form action="" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre">

        <label for="email">Email:</label>
        <input type="email" name="email">

        <button>Guardar</button>

    </form>

    <c:forEach items="${usuarios}" var="usuario">
        <li>
            <c:out value="${usuario.nombre}"/> : <c:out value="${usuario.email}"/>
        </li>
    </c:forEach>

    <br>

    <a href="/"> <- Volver</a>

    <!-- FORM FIN -->
    
    <c:out value="${usuario.getNombre()}"/>
    <c:out value="${4+4}"/>
</body>
</html>