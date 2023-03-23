/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases1;

/**
 *
 * @author User
 */
public class Supremacy extends AlianzaRebelde{
    int navesCargadas ;
    

    public Supremacy(int navesCargadas, int capacidad, double consumo, int cantidad, int parsecs) {
        super(capacidad, consumo, cantidad, parsecs);
        this.navesCargadas = navesCargadas;
    }
    

    public int getNavesCargadas() {
        return navesCargadas;
    }

    public void setNavesCargadas(int navesCargadas) {
        this.navesCargadas = navesCargadas;
    }

    @Override
    public double calcularCombustibleRequerido() {
        double consumo=super.calcularCombustibleRequerido()*(getNavesCargadas()*0.1);
              //  super.calcularCombustibleRequerido(parsecs);
               
        return super.calcularCombustibleRequerido()+consumo ;
   
}
}

