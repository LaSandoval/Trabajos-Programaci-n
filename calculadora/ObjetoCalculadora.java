
package com.mycompany.calculadora;

import javax.swing.JOptionPane;


public class ObjetoCalculadora {
//Se crean las variables(atributos de la clase) con visibilidad protected
protected double numero1;
protected double numero2;
//Se crea el método que llama la clase padre
public ObjetoCalculadora() {
super();
}
//Se crea el constructor, setters y getters para cada número
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        if (numero1>0){
        this.numero1 = numero1;
        }
        else {
           JOptionPane.showMessageDialog(null, "El número no es válido");
        }
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        if (numero2>0){
        this.numero2 = numero2;
        }
        else {
           JOptionPane.showMessageDialog(null, "El número no es válido");
        }
    }

    public ObjetoCalculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }



//Se crea un método para cada operación con sus respectivo retorno
public double calcularSuma (){
        return(numero1+numero2);
}

public double calcularResta (){
        return(numero1-numero2);
}

public double calcularMultiplicacion (){
        return(numero1*numero2);
}

public double calcularDivision () {
double resultado=0;
    if (numero2 != 0){
        resultado=(numero1/numero2);
}
    else{ 
        JOptionPane.showMessageDialog(null, "No se puede hacer la división");
                }
    return resultado;
}

}
