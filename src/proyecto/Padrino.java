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
public class Padrino extends Persona {

    private ArrayList<Animal> animalesApadrinados = new ArrayList<>();
    private String metodoPago;
    private int montoDonado;
    private String ocupacion;

    public Padrino() {
        this.metodoPago = "";
        this.montoDonado = 0;
        this.ocupacion = "";
    }

    public Padrino(String nombre, String fechaNacimiento, String cedula, String direccion, String numeroTelefono, String sexo, String metodoPago, int montoDonado, String ocupacion) {
        super(nombre, fechaNacimiento, cedula, direccion, numeroTelefono, sexo);
        this.metodoPago = metodoPago;
        this.montoDonado = montoDonado;
        this.ocupacion = ocupacion;
    }

    public int getMontoDonado() {
        return montoDonado;
    }

    public void setMontoDonado(int montoDonado) {
        this.montoDonado = montoDonado;
    }

    public ArrayList<Animal> getAnimalesApadrinados() {
        return animalesApadrinados;
    }

    public void setAnimalesApadrinados(ArrayList<Animal> animalesApadrinados) {
        this.animalesApadrinados = animalesApadrinados;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Padrino:\n"
                + super.toString()
                + "\nAnimales Apadrinados: " + this.getAnimalesApadrinados()
                + "\nMétodo de Pago: " + this.getMetodoPago()
                + "\nMonto Donado: " + this.getMontoDonado();
    }

}
