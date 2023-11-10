/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author Ariana
 */
public class Animal {

    private String nombre;
    private String fechaNacimiento;
    private String especie;
    private String estadoSalud;
    private double peso;
    private String genero;
    private String historia;
    private String tipoAlimentacion;
    private String apadrinado;
    private Padrino padrino;
    private int idAnimal;
    
    public Animal() {
        this.nombre = "";
        this.fechaNacimiento = "";
        this.especie = "";
        this.estadoSalud = "";
        this.peso = 0;
        this.genero = "";
        this.historia = "";
        this.tipoAlimentacion = "";
        this.apadrinado = "Disponible";
        this.padrino = new Padrino();//consultarle a la profe
        this.idAnimal = 0;
    }

    public Animal(String nombre, String fechaNacimiento, String especie, String estadoSalud, double peso, String genero, String historia, String tipoAlimentacion, String apadrinado, Padrino padrino, int idAnimal) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.estadoSalud = estadoSalud;
        this.peso = peso;
        this.genero = genero;
        this.historia = historia;
        this.tipoAlimentacion = tipoAlimentacion;
        this.apadrinado = apadrinado;
        this.padrino = padrino;
        this.idAnimal = idAnimal;
    }

    public Padrino getPadrino() {
        return padrino;
    }

    public void setPadrino(Padrino padrino) {
        this.padrino = padrino;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }


    public String getApadrinado() {
        return apadrinado;
    }

    public void setApadrinado(String apadrinado) {
        this.apadrinado = apadrinado;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Override
    public String toString() {
        return "Animal:"
                + "\nNombre: " + this.getNombre()
                + "\nID: " + this.getIdAnimal()
                + "\nFecha de Nacimiento: " + this.getFechaNacimiento()
                + "\nEspecie: " + this.getEspecie()
                + "\nEstado de Salud: " + this.getEstadoSalud()
                + "\nPeso: " + this.getPeso()
                + "\nGénero: " + this.getGenero()
                + "\nHistoria: " + this.getHistoria()
                + "\nTipo de Alimentación: " + this.getTipoAlimentacion()
                + "\nEstado de apadrinamiento: " + this.getApadrinado()
                + "\nPadrino: " + this.getPadrino();
    }

}
