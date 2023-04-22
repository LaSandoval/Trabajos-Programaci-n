/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Mascota { 
    
    protected String nombre;
    protected String raza;
    protected String color;
    protected int edad;
    protected String tipo;
    
    public Mascota() {
    }
    
    public Mascota(String nombre, String raza, String color, int edad, String tipo) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.tipo = tipo;
    }
        
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
    
   
