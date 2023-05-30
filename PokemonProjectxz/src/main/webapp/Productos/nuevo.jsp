<%-- 
    Document   : nuevo
    Created on : 22/05/2023, 11:25:28 p. m.
    Author     : juans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Pokedex</title>
    </head>
    <body>
        <h1>Nuevo Pokemon</h1>
        <br /><br/>
        
        <form action="ProductosController?accion=insert" method="POST" autocomplete="off">
            
            <p> ID:
                <input id="id" name="id" type="text"/>
            
            <p>
                Pokemon:
                <input id="codigo" name="pokemon" type="text"/>
                
            <p>
                Tipo 1:
                <input id="codigo" name="tipo1" type="text"/>
                
                
            <p>
                Tipo 2:
                <input id="codigo" name="tipo2" type="text"/>
                
            <p>
                Movimiento 1:
                <input id="codigo" name="mov1" type="text"/>
            <p>
                Movimiento 2:
                <input id="codigo" name="mov2" type="text"/>
                
            <p>
                Movimiento 3:
                <input id="codigo" name="mov3" type="text"/>
                
            <p>
                Movimiento 4:
                <input id="codigo" name="mov4" type="text"/>
                
            <p>
                Uso VGC:
                <input id="codigo" name="vgc" type="text"/>
                
                
            <p>
                Uso Smogon  :
                <input id="codigo" name="smogon" type="text"/>
                
                
                <button id="guardar" name="guardar" type="submit"> Guardar </button>
            
        </form>
    </body>
</html>
