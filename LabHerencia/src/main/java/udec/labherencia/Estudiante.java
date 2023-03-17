/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udec.labherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

public class Estudiante extends Persona {
    
    private String carnet; 
    private double promedioNotas; 
    private int numeroMaterias; 
    
    public Estudiante() {
    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre,apellido,edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }
    
public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getCarnet() {
        return carnet;
    }

    
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }
 public double leerNotasEstudiante(int numeroMaterias){
        double suma=0;
        double notasMaterias=0;
        for(int i=1; i<=numeroMaterias; i++){
           notasMaterias= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la materia  "+i));
           suma=suma+notasMaterias;
           
        }
        return suma;
    }
    public double calcularPromedio(int numeroMaterias, double suma){
        promedioNotas = suma/numeroMaterias;
        return promedioNotas;
    }
    
    public Estudiante ingresarDatosEstudiante(){
            Estudiante ne = new Estudiante();
            String nombre = "";
            String apellido = "";
            int edad = 0;
            double peso = 0.0;
            String carnet=""; 
            double promedioNotas=0.0; 
            int numeroMaterias=0; 
            double leerNotasEstudiante=0;
            nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante ");
            apellido = leerDatoTipoCadena("Ingrese el apellido del estudiane ");
            edad = leerDatoTipoEntero("Ingrese la edad del estudiante ");
            peso = leerDatoTipoReal("Ingrese el peso del estudiante ");
            carnet= leerDatoTipoCadena("Ingrese el carnet ");
            numeroMaterias = leerDatoTipoEntero("Ingrese la cantidad de materias ");
            
            ne.setNombre(nombre);
            ne.setApellido(apellido);
            ne.setEdad(edad);
            ne.setPeso(peso);
            ne.setCarnet(carnet);
            ne.setNumeroMaterias(numeroMaterias);
            double suma = ne.leerNotasEstudiante(numeroMaterias);
            ne.setPromedioNotas(calcularPromedio(numeroMaterias,suma));
        return (ne);
    }
    
    public void imprimirReporteNotasEstudiante(){
    
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null,"El carnet del estudiante es: " + carnet);
        JOptionPane.showMessageDialog(null, "El numero de materias es: " + numeroMaterias);
        JOptionPane.showMessageDialog(null, "El promedio es: " + getPromedioNotas());
    }
}


