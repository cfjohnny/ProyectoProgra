/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Ariana
 */
public class Empleado extends Persona {

    private String cargo;
    private Double salario;
    private String idEmpleado;
    private String contrasena;
    
    public Empleado() {
        this.cargo = "";
        this.salario = 0.0;
        this.idEmpleado = "";
        this.contrasena = "";
    }

    public Empleado(String nombre, String fechaNacimiento, String cedula, String direccion, String numeroTelefono, String sexo, String cargo, Double Salario, String idEmpleado, String contrasena) {
        super(nombre, fechaNacimiento, cedula, direccion, numeroTelefono, sexo);
        this.cargo = cargo;
        this.salario = Salario;
        this.idEmpleado = idEmpleado;
        this.contrasena = contrasena;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public boolean equals(ArrayList<Empleado> empleados, Empleado empleado){ //no esta funcionando
        boolean existe=false;
        for (int i = 0; i < empleados.size() ; i++) {
            if(empleado.getCedula()==empleados.get(i).getCedula()){
                existe=true;
            } else {
                 existe=false;
            }
        }
        return existe;
    }

    @Override
    public String toString() {
        return "\nEmpleado:\n"
                + super.toString()
                + "\nCargo: " + this.getCargo()
                + "\nSalario: " + this.getSalario()
                + "\n ID de Empleado: " + this.getIdEmpleado();
    }

}
