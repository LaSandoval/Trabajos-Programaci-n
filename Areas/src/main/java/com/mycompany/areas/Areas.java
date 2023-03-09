/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areas;

import javax.swing.JOptionPane;

    
public class Areas {
 private double base = 0.0;
  private double altura = 0.0;
  private double radio = 0.0;
  private double areaCuadrado = 0.0;
  private double areaCirculo = 0.0;
  private double PI = 3.1416;
    
  public void leerDouble(){
  base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
  radio = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite el radio"));
  altura = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite la altura "));
  }
  public double calcularAreaCirculo(){   
  areaCirculo = PI * (radio * radio);
  return areaCirculo ;
  }
  public double calcularAreaCuadrado(){
   areaCuadrado = base * altura;  
   return areaCuadrado;
  }
 public void imprimirResultado(){
 JOptionPane.showMessageDialog(null, "El área del cuadrado es: "+ areaCuadrado);
 JOptionPane.showMessageDialog(null, "El área de la circunferencia es: "+ areaCirculo);
}
}
  

    

