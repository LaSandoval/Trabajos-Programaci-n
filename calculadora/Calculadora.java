

package com.mycompany.calculadora;
import javax.swing.JOptionPane;


 public class Calculadora {
public static void main(String[] args)
{
//Se crea el objeto calculadora para llamar los métodos
ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Con el método set se le da el valor a los números por medio de un JOption
 calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
 calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
 //Se hace un flujo de control para que haga las opreciones siempre y cuando los números sean mayores de 0
 if (calculadora.getNumero1()>0 && calculadora.getNumero2()>0){
 JOptionPane.showMessageDialog(null,"Suma: " + calculadora.calcularSuma()) ;
 JOptionPane.showMessageDialog(null,"Resta: " + calculadora.calcularResta() ); 
 JOptionPane.showMessageDialog(null,"Multiplicacion: " +calculadora.calcularMultiplicacion());
 JOptionPane.showMessageDialog(null,"Dvision: " + calculadora.calcularDivision());
}
 else{
 JOptionPane.showMessageDialog(null,"No es posible hacer los calculos");
 }
} 
}
