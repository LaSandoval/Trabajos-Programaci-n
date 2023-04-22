<%@page import="modelo.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    ArrayList list=new ArrayList();
    list=(ArrayList) session.getAttribute("Lista1");
    int totalAni=(int)session.getAttribute("totalANi");
    int numPerros=(int)session.getAttribute("numPerros");
    int numGatos=(int)session.getAttribute("numGatos");
    double prom=(double)session.getAttribute("Promedio");
%>
<!DOCTYPE html>
<html>
    <head>
        <link href="imprimir.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Veterinaria</title>
    </head>
    <body>
    <body style="background-image:url('https://heidysign.nl/flat_thumb/coole-jongens-uitnodiging-panter-sjabloon-foto/2')"></body> 

    <div id="main-container">    
        <h1 class="form_tittle">REGISTRO MASCOTAS</h1>
        <table>
            <thead>
                <tr>  
                    <th>TIPO</th>    
                    <th>NOMBRE</th>
                    <th>RAZA</th>
                    <th>COLOR</th>
                    <th>EDAD</th>
                    <th>NIVEL ENTRENAMMIENTO</th>
                    <th>TOXOPLASMOSIS</th>
                    <th>ELIMINAR</th>
                </tr>

            </thead>
            <tbody>
                <% Iterator it = list.iterator();
                int cont=0;
                while ( it.hasNext() ) { 
                //Mascota objeto = (Mascota)it.next();
                %>
                <tr>

                    <th><p><%= objeto.getTipo()%></p></th>
                    <th><p><%= objeto.getNombre() %></p></th>
                    <th><p><%= objeto.getRaza() %></p></th>
                    <th> <p><%= objeto.getColor() %></p></th>
                    <th><p><%= objeto.getEdad() %></p></th>

                    <% 
                        if(objeto instanceof Canino){
                            int entreno=0;
                            entreno = ((Canino)objeto).getEntre(); 
                    %>
                    <th><p><%= entreno %></p></th> 
                            <% 
                   }else{%>
                    <th><p>El felino no cuenta con este dato</p> </th>
                        <% } %>
                        <% 
                            if(objeto instanceof Felino){
                                String toxo;
                                toxo = ((Felino)objeto).isToxo();
                
                        %>
                    <th><p><%= toxo %></p> </th>
                            <% 
                   }else{%>
                    <th>  <p>El canino no toma este dato</p> </th>
                        <% } %>

                    <th><form id="eliminar_<%=cont%>" action="registro" method="POST">

                            <input type="hidden" name="indice" value="<%=cont%>">
                            <input type="hidden" name="eliminar" value="si">
                            <input type="submit" value="Eliminar"/>
                        </form>
                    </th>
                </tr>
                <% cont++;} %>
            </tbody>

            <%
     if (request.getParameter("eliminar") != null && request.getParameter("eliminar").equals("si")) {
    String indiceStr = request.getParameter("indice");
    if (indiceStr != null && !indiceStr.isEmpty()) {
        int indice = Integer.parseInt(indiceStr);
        ArrayList lista = (ArrayList) session.getAttribute("Lista1");
        lista.remove(indice);
        session.setAttribute("Lista1", lista);
    }
}
            %> 
        </table>


        <p>Cantidad de perros: <%= numPerros %></p>
        <p>Cantidad de gatos: <%= numGatos %></p>
        <p>Promedio edades de las mascotas: <%= prom%></p>
        <p>Número total de mascotas: <%= totalAni%></p>
        <a id="boton_enviar" href="index.html">AGREGAR OTRA MASCOTA</a>

    </div>

</body>
</html>
