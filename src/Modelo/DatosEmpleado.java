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
public class DatosEmpleado {

    public void insertar(Empleado empleado) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("INSERT INTO empleado VALUES (?,?,?,?,?,?,?,?,?,?)");
            misql.setString(1, empleado.getNombre());
            misql.setString(2, empleado.getFechaNacimiento());
            misql.setString(3, empleado.getCedula());
            misql.setString(4, empleado.getDireccion());
            misql.setString(5, empleado.getNumeroTelefono());
            misql.setString(6, empleado.getSexo());
            misql.setString(7, empleado.getCargo());
            misql.setDouble(8, empleado.getSalario());
            misql.setString(9, empleado.getIdEmpleado());
            misql.setString(10, empleado.getContrasena());
            //3. ejecutar el comando sql
            misql.executeUpdate();
            //4.Cerrar la conexion
        } catch (SQLException e) {
            Logger.getLogger(DatosEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificar(String idEmpleado, String nombre, String fechaNacimiento, String cedula, String direccion, String numeroTelefono, String sexo, String cargo,
            double salario, String contrasena) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("UPDATE empleado SET nombre='"+nombre+"',fechaNacimiento='"+fechaNacimiento+"',cedula='"+cedula+"',direccion='"+direccion+
                    "',numeroTelefono='"+numeroTelefono+"',sexo='"+sexo+"',cargo='"+cargo+"',salario="+salario+",contrasena='"+contrasena+"' WHERE idEmpleado=" + idEmpleado);
            misql.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DatosEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void eliminar(String idEmpleado) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            Statement st = con.crearStatement();//crea el statement
           String instruccion="DELETE FROM empleado WHERE idEmpleado=" + idEmpleado; //de una vez ejecuta la secuencia
            //4.Cerrar la conexion
            int filaEliminar=st.executeUpdate(instruccion);
            if(filaEliminar>0){
                JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el empleado deseado");
            }
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Empleado> todosEmpleado() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            Statement st = con.crearStatement();//crea el statement
            ResultSet rs = st.executeQuery("SELECT * FROM empleado"); //de una vez ejecuta la secuencia
            while (rs.next()) {
                Empleado empleado = new Empleado(rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("cedula"),
                         rs.getString("direccion"), rs.getString("numeroTelefono"), rs.getString("sexo"), rs.getString("cargo"),
                        rs.getDouble("salario"), rs.getString("idEmpleado"), rs.getString("contrasena"));
                empleados.add(empleado);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        return empleados;
    }
    
    

    public ArrayList<Empleado> BuscarEmpleado(String idEmpleado) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement //preparedstatement que busque y luego haga algo
            PreparedStatement st = con.crearPreparedStatement("SELECT * FROM empleado WHERE idEmpleado like ?");
            idEmpleado = '%' + idEmpleado + '%';
            st.setString(1, idEmpleado);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado(rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("cedula"),
                         rs.getString("direccion"), rs.getString("numeroTelefono"), rs.getString("sexo"), rs.getString("cargo"),
                        rs.getDouble("salario"), rs.getString("idEmpleado"), rs.getString("contrasena"));
                listaEmpleados.add(empleado);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaEmpleados;
    }

}
