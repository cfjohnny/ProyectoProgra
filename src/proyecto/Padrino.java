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

    public Padrino() {
        this.metodoPago = "";
        this.montoDonado = 0;
    }

    public Padrino(String nombre, String fechaNacimiento, String cedula, String ocupacion, String direccion, String numeroTelefono, String metodoPago, int montoDonado) {
        super(nombre, fechaNacimiento, cedula, ocupacion, direccion, numeroTelefono);
        this.metodoPago = metodoPago;
        this.montoDonado = montoDonado;
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

    @Override
    public String toString() {
        return "Padrino:\n" + 
                super.toString()+ 
                "\nAnimales Apadrinados: " + this.getAnimalesApadrinados() + 
                "\nMétodo de Pago: " + this.getMetodoPago() + 
                "\nMonto Donado: " + this.getMontoDonado();
    }
    
}
