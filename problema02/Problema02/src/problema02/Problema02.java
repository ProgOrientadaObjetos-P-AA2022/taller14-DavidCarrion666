/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace c = new Enlace();
        // TODO code application logic here

        /* boolean bandera = true;
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Ingrese el nombre del Estudiante");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la calificacion 1 del Estudiante");
            double cal1 = sc.nextDouble();
            System.out.println("Ingrese la calificacion 2 del Estudiante");
            double cal2 = sc.nextDouble();
            System.out.println("Ingrese la calificacion 3 del Estudiante");
            double cal3 = sc.nextDouble();
            sc.nextLine();

            Calificaciones t = new Calificaciones(nombre, cal1, cal2, cal3);
            t.calcularPromedio();
            c.insertarCalificaciones(t);


            System.out.println("Si desea seguir ingresando datos escriba si,"
                    + " caso contrario escriba no");
            String condicion = sc.nextLine();

            if (condicion.equals("no")) {
                bandera = false;
            }

        } while (bandera);*/
        for (int i = 0; i < c.obtenerDataCalificaciones().size(); i++) {
            System.out.printf("%s", c.obtenerDataCalificaciones().get(i));
        }

    }
}
