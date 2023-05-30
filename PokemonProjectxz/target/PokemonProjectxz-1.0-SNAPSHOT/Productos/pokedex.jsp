<%-- 
    Document   : index
    Created on : 22/05/2023, 11:52:32 p. m.
    Author     : juans
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Productos/style_pokedex.css" rel="stylesheet" type="text/css">
        <title>Pokédex</title>
    </head>
    <body>
        <header class="header">
            <a class="logo" href="  index.html"><img src="Imagenes/pokeball.png" width="90px" height="90px"></a>
            <nav class="mainNav">           
                <ul class="items">
                    <li class="items__primero"><a href="ProductosController">Pokédex</a></li>
                    <li class="items__otros">VGC</li>
                    <li class="items__otros">Smogon</li>
                    <li class="items__ultimo">Contact</li>
                </ul>
            </nav> 
        </header>
        <main class="content">
            <article class="content__tools">
                <a href="ProductosController?accion=nuevo">
                    <button class="content-tools__button">Agregar</button>
                </a>
            </article>
            <article class="content__tabla-dex">
                <table class="tabla" border="1" width="80%">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Pokemon</th>
                            <th>Tipo1</th>
                            <th>Tipo2</th>
                        </tr>
                    </thead>
                    
                    <tbody class="cuerpo">
                        <c:forEach var="producto" items="${lista}">
                            <tr class="cuerpo">
                                <td class="c1">${producto.id}</td>
                                <td class="c2">${producto.pokemon}</td>
                                <td class="c3">${producto.tipo1}</td>
                                <td class="c4">${producto.tipo2}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </article>
        </main>
    </body>
</html>