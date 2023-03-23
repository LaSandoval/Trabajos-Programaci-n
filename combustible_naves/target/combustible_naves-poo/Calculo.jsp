<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases1.*"%>
<% 
    double comTot = (double)session.getAttribute("COMTOT");
    double Con1=(double)session.getAttribute("Con1");
    double Con2=(double)session.getAttribute("Con2");
    double Con3=(double)session.getAttribute("Con3");
    double Con4=(double)session.getAttribute("Con4");
    double Con5=(double)session.getAttribute("Con5");
    
    HalconMilenario obj1 = (HalconMilenario)session.getAttribute("OBJ1");
    DestructorEstelar obj2 = (DestructorEstelar)session.getAttribute("OBJ2");
    LanzaderaImperial obj3 = (LanzaderaImperial)session.getAttribute("OBJ3");
    Supremacy obj4 = (Supremacy)session.getAttribute("OBJ4");
    AtAt obj5 = (AtAt)session.getAttribute("OBJ5");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <link href="newcss1.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        
        <h1>Este ha sido su reporte </h1>
        <h3>La cantidad total de combustible requerido es: </h3>
        <p><%= comTot %> </p>
        
        <h2>HALCON MILENARIO</h2>
        <p>La capacidad es: <%= obj1.getCapacidad() %></p>
        <p>El consumo es: <%= obj1.getConsumo() %></p>
        <p>La cantiadad de naves es: <%= obj1.getCantidad() %></p>
        <p>Los pársecs: <%= obj1.getParsecs() %></p>
        <p>El combustible de la nave es: <%= Con1 %></p>
        
        <h2>DESTRUCTIR ESTELAR</h2>
        <p>La capacidad es: <%= obj2.getCapacidad() %></p>
        <p>El consumo es: <%= obj2.getConsumo() %></p>
        <p>La cantiadad de naves es: <%= obj2.getCantidad() %></p>
        <p>Los pársecs: <%= obj2.getParsecs() %></p>
        <p>El combustible de la nave es: <%= Con2 %></p>
        
        <h2>LANZADERA IMPERIAL</h2>
        <p>La capacidad es: <%= obj3.getCapacidad() %></p>
        <p>El consumo es: <%= obj3.getConsumo() %></p>
        <p>La cantiadad de naves es: <%= obj3.getCantidad() %></p>
        <p>Los pársecs: <%= obj3.getParsecs() %></p>
        <p>El combustible de la nave es: <%= Con3 %></p>
        
        <h2>SUPREMACY</h2>
        <p>La capacidad es: <%= obj4.getCapacidad() %></p>
        <p>El consumo es: <%= obj4.getConsumo() %></p>
        <p>La cantiadad de naves es: <%= obj4.getCantidad() %></p>
        <p>Los pársecs: <%= obj4.getParsecs() %></p>
        <p>El combustible de la nave es: <%= Con4 %></p>
        
        <h2>AT-AT</h2>
        <p>La capacidad es: <%= obj5.getCapacidad() %></p>
        <p>El consumo es: <%= obj5.getConsumo() %></p>
        <p>La cantiadad de naves es: <%= obj5.getCantidad() %></p>
        <p>Los pársecs: <%= obj5.getParsecs() %></p>
        <p>El combustible de la nave es: <%= Con5 %></p>
        
    <center><img src="https://media.istockphoto.com/id/1346401654/es/foto/lanzamiento-de-cohetes-del-transbordador-espacial-en-las-nubes-con-estrellas-al-espacio.jpg?s=612x612&w=0&k=20&c=2pzyM1l8VeFdEsLcOWytoC1QVFAQd95l10tizh1F5ds=" alt="alt"/></center>
    </body>
</html>
