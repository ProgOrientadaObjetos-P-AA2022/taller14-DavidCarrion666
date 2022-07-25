/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario iTC
 */
public class Calificaciones {

    private String nombre;
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;

    public Calificaciones(String n, double c1, double c2, double c3) {
        nombre = n;
        cal1 = c1;
        cal2 = c2;
        cal3 = c3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public void establecerCal1(double c) {
        cal1 = c;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public void establecerCal2(double c) {
        cal2 = c;
    }

    public double obtenerCal3() {
        return cal3;
    }

    public void establecerCal3(double c) {
        cal3 = c;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        promedio = (cal1 + cal2 + cal3) / 3;
    }

    @Override
    public String toString() {
        String data = String.format(""
                + "'%s\n"
                + "\tCalificaciones:"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\tPromedio: %.2f\n",
                nombre,
                cal1,
                cal2,
                cal3,
                promedio);
        return data;

    }
}
