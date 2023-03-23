/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases1;

/**
 *
 * @author User
 */
public class AtAt extends AlianzaRebelde{
     public AtAt(int capacidad, double consumo, int cantidad, int parsecs) {
        super(capacidad, consumo, cantidad, parsecs);
    }

    @Override
    public double calcularCombustibleRequerido() {
        double consumo= super.calcularCombustibleRequerido()*0.25;
        return super.calcularCombustibleRequerido()-consumo;  
    }
}


