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
    private String direccion;
    private String numeroTelefono;
    private String sexo;

    public Persona() {
        this.nombre = "";
        this.fechaNacimiento = "";
        this.cedula = "";
        this.direccion = "";
        this.numeroTelefono = "";
        this.sexo="";
    }

    public Persona(String nombre, String fechaNacimiento, String cedula, String direccion, String numeroTelefono, String sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.sexo=sexo;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + 
                "\nFecha de Nacimiento: " + this.getFechaNacimiento() + 
                "\nCédula: " + this.getCedula() + 
                "\nDirección: " + this.getDireccion() + 
                "\nNúmero de Teléfono: " + this.getNumeroTelefono()+
                "\nSexo: "+this.getSexo();
    }
    
}
