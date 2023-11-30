/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariana
 */
public class DatosPadrinos {

    public void insertar(Padrino padrino) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("INSERT INTO padrino VALUES (?,?,?,?,?,?,?,?,?)");
            misql.setString(1, padrino.getNombre());
            misql.setString(2, padrino.getFechaNacimiento());
            misql.setString(3, padrino.getCedula());
            misql.setString(4, padrino.getDireccion());
            misql.setString(5, padrino.getNumeroTelefono());
            misql.setString(6, padrino.getSexo());
            misql.setString(7, padrino.getMetodoPago());
            misql.setDouble(8, padrino.getMontoDonado());
            misql.setString(9, padrino.getOcupacion());
    
            //3. ejecutar el comando sql
            misql.executeUpdate();
            //4.Cerrar la conexion
        } catch (SQLException e) {
            Logger.getLogger(DatosPadrinos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificar(String nombre, String fechaNacimiento, String cedula, String direccion, String numeroTelefono, String sexo, String metodoPago, double montoDonado, String ocupacion) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("UPDATE padrino SET nombre='"+nombre+"',fechaNacimiento='"+fechaNacimiento+"',cedula='"+cedula+"',direccion='"+direccion+
                    "',numeroTelefono='"+numeroTelefono+"',sexo='"+sexo+"',metodoPago='"+metodoPago+"',montoDonado="+montoDonado+",ocupacion='"+ocupacion+"' WHERE cedula=" + cedula);
            misql.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DatosPadrinos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void eliminar(String cedula) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            Statement st = con.crearStatement();//crea el statement
           String instruccion="DELETE FROM padrino WHERE cedula=" + cedula; //de una vez ejecuta la secuencia
            //4.Cerrar la conexion
            int filaEliminar=st.executeUpdate(instruccion);
            if(filaEliminar>0){
                JOptionPane.showMessageDialog(null, "Padrino eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el padrino deseado");
            }
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosPadrinos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Padrino> todosPadrinos() {
        ArrayList<Padrino> padrinos = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            Statement st = con.crearStatement();//crea el statement
            ResultSet rs = st.executeQuery("SELECT * FROM padrino"); //de una vez ejecuta la secuencia
            while (rs.next()) {
                Padrino padrino = new Padrino(rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("cedula"),
                         rs.getString("direccion"), rs.getString("numeroTelefono"), rs.getString("sexo"), rs.getString("metodoPago"),
                        rs.getDouble("montoDonado"), rs.getString("ocupacion"));
                padrinos.add(padrino);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosPadrinos.class.getName()).log(Level.SEVERE, null, e);
        }
        return padrinos;
    }

    public ArrayList<Padrino> BuscarPadrino(String cedula) {
        ArrayList<Padrino> listaPadrinos = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement //preparedstatement que busque y luego haga algo
            PreparedStatement st = con.crearPreparedStatement("SELECT * FROM padrino WHERE cedula like ?");
            cedula = '%' + cedula + '%';
            st.setString(1, cedula);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Padrino padrino = new Padrino(rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("cedula"),
                         rs.getString("direccion"), rs.getString("numeroTelefono"), rs.getString("sexo"), rs.getString("metodoPago"),
                        rs.getDouble("montoDonado"), rs.getString("ocupacion"));
                listaPadrinos.add(padrino);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosPadrinos.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaPadrinos;
    }
    //arraylist que almacena los animales apadrinados de un padrino
     public ArrayList<Animal> BuscarAnimales(String cedula) {
        ArrayList<Animal> listaAnimalesApadrinados = new ArrayList<>();
        ArrayList<Animal> listaPadrinos = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement //preparedstatement que busque y luego haga algo
            PreparedStatement st = con.crearPreparedStatement("SELECT * FROM animal WHERE padrino like ?");
            cedula = '%' + cedula + '%';
            st.setString(1, cedula);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                 Animal animal = new Animal(rs.getInt("id"), rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("especie"),
                         rs.getString("estadoSalud"), rs.getDouble("peso"), rs.getString("genero"), rs.getString("historia"),
                        rs.getString("tipoAlimentacion"), rs.getString("apadrinado"), rs.getString("padrino"));
                listaAnimalesApadrinados.add(animal);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosPadrinos.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaAnimalesApadrinados;
    }
}
