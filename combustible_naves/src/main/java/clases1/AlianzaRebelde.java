/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases1;

/**
 *
 * @author User
 */
    public abstract class AlianzaRebelde {
        int parsecs;
        int capacidad;
        double consumo;
        int cantidad;
    //constructor
    public AlianzaRebelde() {
    }
//constructor sobrecargado 
    public AlianzaRebelde(int capacidad, double consumo, int cantidad, int parsecs) {
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.cantidad = cantidad;
        this.parsecs= parsecs;
    }

    public int getParsecs() {
        return parsecs;
    }

    public void setParsecs(int parsecs) {
        this.parsecs = parsecs;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 
    // calcular combustible 
    public double calcularCombustibleRequerido(){
        return parsecs*getConsumo()*getCantidad();
    }
       
    
}

