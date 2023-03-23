/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import clases1.*;

/**
 *
 * @author User
 */
@WebServlet(name = "Impresion", urlPatterns = {"/Impresion"})
public class Impresion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
  

  
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        //Pársec
        int par1= Integer.parseInt(request.getParameter("Parsec"));
        int par2= Integer.parseInt(request.getParameter("Parsec1"));
        int par3= Integer.parseInt(request.getParameter("Parsec2"));
        int par4= Integer.parseInt(request.getParameter("Parsec3"));
        int par5= Integer.parseInt(request.getParameter("Parsec4"));
        //Número de personas
        int np1 = Integer.parseInt(request.getParameter("numeroPersonas"));
        int np2 = Integer.parseInt(request.getParameter("numeroPersonas1"));
        int np3 = Integer.parseInt(request.getParameter("numeroPersonas2"));
        int np4 = Integer.parseInt(request.getParameter("numeroPersonas3"));
        int np5 = Integer.parseInt(request.getParameter("numeroPersonas4"));
        //Consumo
        double con1=Double.parseDouble(request.getParameter("consumoCombustible"));
        double con2=Double.parseDouble(request.getParameter("consumoCombustible1"));
        double con3=Double.parseDouble(request.getParameter("consumoCombustible2"));
        double con4=Double.parseDouble(request.getParameter("consumoCombustible3"));
        double con5=Double.parseDouble(request.getParameter("consumoCombustible4"));
        //Número de naves
        int n1= Integer.parseInt(request.getParameter("numeroNaves"));
        int n2= Integer.parseInt(request.getParameter("numeroNaves1"));
        int n3= Integer.parseInt(request.getParameter("numeroNaves2"));
        int n4= Integer.parseInt(request.getParameter("numeroNaves3"));
        int n5= Integer.parseInt(request.getParameter("numeroNaves4"));

        int c=Integer.parseInt(request.getParameter("numeroNavesCarga"));
       
        HalconMilenario ha=new HalconMilenario(np1, con1, n1, par1);
        DestructorEstelar de=new DestructorEstelar(np2, con2, n2, par2);
        LanzaderaImperial la=new LanzaderaImperial(np3, con3, n3, par3);
        Supremacy sp=new Supremacy(c, np4, con4, n4, par4);
        AtAt at=new AtAt(np5, con5, n5, par5);
        
        double a= ha.calcularCombustibleRequerido();
        double b=de.calcularCombustibleRequerido();
        double e=la.calcularCombustibleRequerido();
        double d=sp.calcularCombustibleRequerido();
        double f=at.calcularCombustibleRequerido();
   
        double consumototal=a+b+e+d+f;
        
        
        
        request.getSession().setAttribute("OBJ1", ha);
        request.getSession().setAttribute("OBJ2", de);
        request.getSession().setAttribute("OBJ3", la);
        request.getSession().setAttribute("OBJ4", sp);
        request.getSession().setAttribute("OBJ5", at);
        request.getSession().setAttribute("COMTOT", consumototal);
        request.getSession().setAttribute("Con1", a);
        request.getSession().setAttribute("Con2", b);
        request.getSession().setAttribute("Con3", e);
        request.getSession().setAttribute("Con4", d);
        request.getSession().setAttribute("Con5", f);
        
        response.sendRedirect("Calculo.jsp");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
