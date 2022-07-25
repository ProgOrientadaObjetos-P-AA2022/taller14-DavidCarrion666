/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarCalificaciones(Calificaciones estudiante) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Calificaciones (nombre,"
                    + " cal1, cal2, cal3, promedio) "
                    + "values ('%s', '%.2f', '%.2f','%.2f', '%.2f')",
                    estudiante.obtenerNombre(),
                    estudiante.obtenerCal1(),
                    estudiante.obtenerCal2(),
                    estudiante.obtenerCal3(),
                    estudiante.obtenerPromedio());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCalificaciones");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Calificaciones> obtenerDataCalificaciones() {
        ArrayList<Calificaciones> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Calificaciones miCalificaciones = new Calificaciones(
                        rs.getString("nombre"),
                        rs.getDouble("estudiante1"),
                        rs.getDouble("estudiante2"),
                        rs.getDouble("estudiante3"));
                lista.add(miCalificaciones);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCalificaciones");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
