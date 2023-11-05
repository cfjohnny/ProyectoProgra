/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Ariana
 */
public class Empleado extends Persona {
    private String cargo;
    private String salario;
    private String idEmpleado;

    public Empleado() {
        this.cargo = "";
        this.salario = "";
        this.idEmpleado = "";
    }

    public Empleado(String nombre, String fechaNacimiento, String cedula, String ocupacion, String direccion, String numeroTelefono, String cargo, String Salario, String idEmpleado) {
        super(nombre, fechaNacimiento, cedula, ocupacion, direccion, numeroTelefono);
        this.cargo = cargo;
        this.salario = Salario;
        this.idEmpleado = idEmpleado;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpleado:"+
                super.toString()+ 
                "\nCargo: " + this.getCargo() + 
                "\nSalario: " + this.getSalario() + 
                "\n ID de Empleado: " + this.getIdEmpleado();
    }
    
}
