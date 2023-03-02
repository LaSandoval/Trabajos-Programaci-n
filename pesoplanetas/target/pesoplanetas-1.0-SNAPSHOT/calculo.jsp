<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="calculo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CALCULO</title>
    </head>
    <body>
        <h1 class="form_tittle">Calculadora del peso en el planeta deseado</h1>
    <% 
    double peso= Double.parseDouble(request.getParameter("peso"));
    String planeta=request.getParameter("planeta");
     
    switch(planeta){
            case "venus":peso=(peso*8.87)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
            <%break;
            case "marte":peso=(peso*3.7)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
            <%break;
            case "mercurio":peso=(peso*3.7)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
            <%break;
            case "jupiter":peso=(peso*24.79)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
            <%break;
            case "saturno":peso=(peso*10.44)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
            <%break;
            case "urano":peso=(peso*8.87)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
            <%break;
            case "neptuno":peso=(peso*11.15)/9.8;%>
                <p>Su peso en <%=planeta%> es <%=peso%>Kg</p>
           <% break;
           }
            %>
            <p><img src="https://www.shutterstock.com/image-vector/cute-childish-planets-stars-solar-600w-1803639019.jpg" alt="alt"
            onclick="window.alert('Gracias por hacer uso de esta calculadora')";></p>
    </body>
    
</html>
