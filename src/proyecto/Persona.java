/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Ariana
 */
public class Persona {
    private String nombre;
    private String fechaNacimiento;
    private String cedula;
    private String ocupacion;
    private String direccion;
    private String numeroTelefono;

    public Persona() {
        this.nombre = "";
        this.fechaNacimiento = "";
        this.cedula = "";
        this.ocupacion = "";
        this.direccion = "";
        this.numeroTelefono = "";
    }

    public Persona(String nombre, String fechaNacimiento, String cedula, String ocupacion, String direccion, String numeroTelefono) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + 
                "\nFecha de Nacimiento: " + this.getFechaNacimiento() + 
                "\nCédula: " + this.getCedula() + 
                "nOcupación: " + this.getOcupacion() + 
                "\nDirección: " + this.getDireccion() + 
                "\nNúmero de Teléfono: " + this.getNumeroTelefono();
    }
    
}
