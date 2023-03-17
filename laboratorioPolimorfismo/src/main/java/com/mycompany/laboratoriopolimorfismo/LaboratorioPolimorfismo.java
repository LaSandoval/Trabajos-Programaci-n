/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.laboratoriopolimorfismo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LaboratorioPolimorfismo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Que calculadora desea usar:\n1:Cliente Calculadora Normal\n2:Cliente Calculadora Especial");
        int opcion;
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("CALCULADORA NORMAL");
                ClienteCalculadoraNormal.principal();
                break;
            case 2:
                System.out.println("CALCULADORA ESPECIAL");
                ClienteCalculadoraEspecial.principal();
                break;
        }
        
    }
}
