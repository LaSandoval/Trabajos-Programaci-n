/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Canino extends Mascota{
    protected int entre;

    public Canino(int entre, String nombre, String raza, String color, int edad, String tipo) {
        super(nombre, raza, color, edad, tipo);
        this.entre = entre;
    }

    public int getEntre() {
        return entre;
    }

    public void setEntre(int entre) {
        this.entre = entre;
    }
 
}
