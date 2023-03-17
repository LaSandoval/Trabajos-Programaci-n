/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratoriopolimorfismo;

/**
 *
 * @author User
 */
public class CalculadoraEspecial implements InterfazCalculadora {
    
@Override
    public double sumarEnteros(double numero1, double numero2) {
        return ((numero1 + numero2) / 2);
    }
@Override
    public double restarEnteros(double numero1, double numero2) {
        return ((numero1 - numero2) / 2);
    }
@Override
    public double multiplicarEnteros(double numero1, double numero2) {
        return ((numero1 * numero2) / 2);
    }
@Override
    public double dividirEnteros(double numero1, double numero2) {
        double resultado=0;
        if (numero2!=0){
        resultado= ((numero1 / numero2) / 2);
    }
        else{
            System.out.println("No es posible hacer la división");
        }
        return resultado;
    }
@Override
    public double calcularRaizCuadrada(double numero1) {
        return ((Math.sqrt(numero1)) / 2);

    }
}
