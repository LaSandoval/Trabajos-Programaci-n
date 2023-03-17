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
public class ClienteCalculadoraNormal {

    static void principal() {
        double numero1;
        double numero2;
        CalculadoraNormal cn = new CalculadoraNormal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1=");
         numero1=sc.nextInt();
        System.out.println("Número 2=");
        numero2=sc.nextInt();
        System.out.println("La suma es: " + cn.sumarEnteros(numero1, numero2));
        System.out.println("La resta es: " + cn.restarEnteros(numero1, numero2));
        System.out.println("La multiplicación es: " + cn.multiplicarEnteros(numero1, numero2));
        System.out.println("La división es" +cn.dividirEnteros(numero1, numero2));
        System.out.println("La raiz cuadrada es: " + cn.calcularRaizCuadrada(numero1));
        
    }
}
