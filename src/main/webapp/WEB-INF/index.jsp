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
    
    <c:out value="${usuario.getNombre()}"/>
    <c:out value="${4+4}"/>

    <a href="/datos">Ir a datos -></a>
</body>
</html>