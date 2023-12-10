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

public class DatosAnimales {

    public void insertar(Animal animal) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("INSERT INTO animal VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            misql.setInt(1, animal.getIdAnimal());
            misql.setString(2, animal.getNombre());
            misql.setString(3, animal.getFechaNacimiento());
            misql.setString(4, animal.getEspecie());
            misql.setString(5, animal.getEstadoSalud());
            misql.setDouble(6, animal.getPeso());
            misql.setString(7, animal.getGenero());
            misql.setString(8, animal.getHistoria());
            misql.setString(9, animal.getTipoAlimentacion());
            misql.setString(10, animal.getApadrinado());
            misql.setString(11, animal.getPadrino());

            //3. ejecutar el comando sql
            misql.executeUpdate();
            //4.Cerrar la conexion
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificar(int idAnimal, String nombre, String fechaNacimiento, String especie, String estadoSalud, double peso, String genero, String historia, String tipoAlimentacion, String apadrinado, String padrino) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("UPDATE animal SET nombre='" + nombre + "',fechaNacimiento='" + fechaNacimiento + "',especie='" + especie + "',estadoSalud='" + estadoSalud
                    + "',peso='" + String.valueOf(peso) + "',genero='" + genero + "',historia='" + historia + "',tipoAlimentacion='" + tipoAlimentacion + "',apadrinado='" + apadrinado + "',padrino='"+padrino+"' WHERE id=" + idAnimal);
            misql.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void modificarApadrinado(int idAnimal, String apadrinado, String cedula) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            PreparedStatement misql = con.crearPreparedStatement("UPDATE animal SET apadrinado='" + apadrinado + "',padrino='"+cedula+"' WHERE id=" + idAnimal);
            misql.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void eliminar(String idAnimal) {
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            Statement st = con.crearStatement();//crea el statement
            String instruccion = "DELETE FROM animal WHERE id=" + idAnimal; //de una vez ejecuta la secuencia
            //4.Cerrar la conexion
            int filaEliminar = st.executeUpdate(instruccion);
            if (filaEliminar > 0) {
                JOptionPane.showMessageDialog(null, "Animal eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el animal deseado");
            }
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Animal> todosAnimales() {
        ArrayList<Animal> animales = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            Statement st = con.crearStatement();//crea el statement
            ResultSet rs = st.executeQuery("SELECT * FROM animal"); //de una vez ejecuta la secuencia
            while (rs.next()) {
                Animal animal = new Animal(rs.getInt("id"), rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("especie"),
                        rs.getString("estadoSalud"), rs.getDouble("peso"), rs.getString("genero"), rs.getString("historia"),
                        rs.getString("tipoAlimentacion"), rs.getString("apadrinado"), rs.getString("padrino"));
                animales.add(animal);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
        return animales;
    }

    public ArrayList<Animal> BuscarAnimal(String idAnimal) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement //preparedstatement que busque y luego haga algo
            PreparedStatement st = con.crearPreparedStatement("SELECT * FROM animal WHERE id like ?");
            idAnimal = '%' + idAnimal + '%';
            st.setString(1, idAnimal);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Animal animal = new Animal(rs.getInt("id"), rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("especie"),
                        rs.getString("estadoSalud"), rs.getDouble("peso"), rs.getString("genero"), rs.getString("historia"),
                        rs.getString("tipoAlimentacion"), rs.getString("apadrinado"), rs.getString("padrino"));
                listaAnimales.add(animal);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaAnimales;
    }

    public ArrayList<Animal> listaAnimalesPorEspecie(String especie) {
        ArrayList<Animal> animales = new ArrayList<>();
        try {
            //1. Crear la conexion con la BD
            ConexionBD con = new ConexionBD();
            //2. Crear el statement
            PreparedStatement st = con.crearPreparedStatement("SELECT * FROM animal WHERE especie like ?");
            especie = '%' + especie + '%';
            st.setString(1, especie);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Animal animal = new Animal(rs.getInt("id"), rs.getString("nombre"), rs.getString("fechaNacimiento"), rs.getString("especie"),
                        rs.getString("estadoSalud"), rs.getDouble("peso"), rs.getString("genero"), rs.getString("historia"),
                        rs.getString("tipoAlimentacion"), rs.getString("apadrinado"), rs.getString("padrino"));
                animales.add(animal);
            }
            //4.Cerrar la conexion
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosAnimales.class.getName()).log(Level.SEVERE, null, e);
        }
        return animales;
    }

}
