/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Felino extends Mascota{
    protected String toxo;

    public Felino(String toxo, String nombre, String raza, String color, int edad, String tipo) {
        super(nombre, raza, color, edad, tipo);
        this.toxo = toxo;
    }
    

    public String isToxo() {
        return toxo;
    }

    public void setToxo(String toxo) {
        this.toxo = toxo;
    }
    
 
}
