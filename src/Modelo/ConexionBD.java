/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class ConexionBD {

    private Connection conexion = null;
    private String servidor = "localhost:3306";
    private String database = "proyecto";
    private String usuario = "root";
    private String password = "";
    private String url = "";

    //constructor sin parametros
    public ConexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //constructor con parametros
    public ConexionBD(String servidor, String database, String usuario, String password) {
        try {
            this.servidor = servidor;
            this.database = database;
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }    

    public PreparedStatement crearPreparedStatement(String sql) throws SQLException { 
        return conexion.prepareStatement(sql);
    }

    public Statement crearStatement() throws SQLException { 
        return conexion.createStatement();
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
            System.err.println("Cerrando la conexion a la BD");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        conexion = null;
        return conexion;
    }

}


