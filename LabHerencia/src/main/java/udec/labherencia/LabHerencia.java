
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udec.labherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LabHerencia {
    //Constructor de la clase
    public LabHerencia() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
    // TODO Auto-generated method stub
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el tipo de persona : \n 1. Empleado \n 2. Estudiante"));

        switch (opcion) {

            case 1:
                JOptionPane.showMessageDialog(null, "Usted ha escogido el tipo Empleado ");
                Persona sistemaInformacion = new Persona();
                try {
                    //Usamos la herencia de la superclase para acceder a los
                    //métodos de lectura de datos
                    do {
                        opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado, 3 para salir: ");
                        if (opcion == 1) {
                            JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                            Empleado manejadorEmpleado = new Empleado();
                            //Leemos los datos
                            manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
                            //Mostramos el reporte de datos
                            manejadorEmpleado.imprimirReporteEstadoEmpleado();
                        } else if (opcion == 3) {
                            JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    } while (opcion <= 1 || opcion >= 3);//fin del do-while
                }//Fin del try
                catch (Exception errorMain) {
                    JOptionPane.showMessageDialog(null, "Error en la digitación: ");
                    errorMain.printStackTrace();
                }

            case 2:
                JOptionPane.showMessageDialog(null, "Usted ha escogido el tipo Estudiante");
                Persona sistemaInformacion1 = new Persona();
                try {
                    //Usamos la herencia de la superclase para acceder a los
                    //métodos de lectura de datos
                    do {
                        opcion = sistemaInformacion1.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del estudiante, 3 para salir: ");
                        if (opcion == 1) {
                            JOptionPane.showMessageDialog(null, "Procesando datos del estudiante");
                            Estudiante manejadorEstudiante = new Estudiante();
                            //Leemos los datos
                            manejadorEstudiante = manejadorEstudiante.ingresarDatosEstudiante();
                            //Mostramos el reporte de datos
                            manejadorEstudiante.imprimirReporteNotasEstudiante();
                        } else if (opcion == 3) {
                            JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    } while (opcion <= 1 || opcion >= 3);//fin del do-while
                }//Fin del try
                catch (Exception errorMain) {
                     JOptionPane.showMessageDialog(null, "Error en la digitación: ");
                     errorMain.printStackTrace();
                }
        }
    }
}
