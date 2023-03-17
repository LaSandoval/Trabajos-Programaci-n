/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratoriopolimorfismo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ClienteCalculadoraEspecial {
    static void principal() {
        double numero1;
        double numero2;
        CalculadoraEspecial ce = new CalculadoraEspecial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1=");
        numero1=sc.nextInt();
        System.out.println("Número 2=");
        numero2=sc.nextInt();
        System.out.println("La suma es: " + ce.sumarEnteros(numero1, numero2));
        System.out.println("La resta es: " + ce.restarEnteros(numero1, numero2));
        System.out.println("La multiplicación es: " + ce.multiplicarEnteros(numero1, numero2));
        System.out.println("La división es" +ce.dividirEnteros(numero1, numero2));
        System.out.println("La raiz cuadrada es: " + ce.calcularRaizCuadrada(numero1));
        
    }
}
