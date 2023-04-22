/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.*;

/**
 *
 * @author User
 */
@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet {

    ArrayList list = new ArrayList();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tipo = request.getParameter("tipo");
        String nom = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int entre = Integer.parseInt(request.getParameter("nivelEntrenamiento"));
        String toxo = request.getParameter("toxoplasmosis");
        
        
        switch (tipo) {
            case "felino":
                Mascota fel = new Felino(toxo, nom, raza, color, edad, tipo);
                list.add(fel);
                break;

            case "canino":
                Mascota can = new Canino(entre, nom, raza, color, edad, tipo);
                list.add(can);
                break;
        }
        int numPerros=0;
        int numGatos=0;
        double sumEdades=0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Mascota objeto = (Mascota) it.next();
            sumEdades+=objeto.getEdad();
            if (objeto instanceof Canino) {
                numPerros = numPerros+1;
            } else if (objeto instanceof Felino) {
                numGatos = numGatos+1;
            }
            
        }
        int totalAnimales = list.size();
        
        double prom=sumEdades/totalAnimales;
        
        String eliminar = request.getParameter("eliminar");
        //int indice = Integer.parseInt(request.getParameter("indice"));
        //if(eliminar!=null && !eliminar.isEmpty() && eliminar.equals("si")){
        //    list.remove(indice);
        //}
        
        request.getSession().setAttribute("Tipo", tipo);
        request.getSession().setAttribute("Promedio", prom);
        request.getSession().setAttribute("numGatos", numGatos);
        request.getSession().setAttribute("numPerros", numPerros);
        request.getSession().setAttribute("totalANi", totalAnimales);
        request.getSession().setAttribute("Lista1", list);
        response.sendRedirect("imprimir.jsp");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
