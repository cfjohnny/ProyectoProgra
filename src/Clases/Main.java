/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import Clases.Empleado;
import Vista.*;

/**
 *
 * @author fallaa8
 */
public class Main {
    public static final ArrayList<Animal> animal = new ArrayList<>();
    public static final ArrayList<Padrino> padrinos = new ArrayList<>();
    public static final ArrayList<Empleado> empleados = new ArrayList<>();
    public static String usuarioLogueado = "";
    public static InicioSesion iniciar = new InicioSesion();
    public static Animales animales = new Animales();
    public static EliminarPadrino eliminarPadrino = new EliminarPadrino();
    public static InformeAnimales informeAnimales = new InformeAnimales();
    public static MenuPrincipal menu = new MenuPrincipal();
    public static ModificarPadrino modificarPadrino = new ModificarPadrino();
    public static Padrinos padrino = new Padrinos();
    public static RegistroEmpleado registroEmpleado = new RegistroEmpleado();
    public static RegistroPadrino registroPadrino = new RegistroPadrino();
    public static Empleados empleado = new Empleados();
    public static ReportesPadrino reportesPadrinos = new ReportesPadrino();
    public static RegistroAnimales registroAnimales = new RegistroAnimales();
    public static ModificarEmpleado modificarEmpleado = new ModificarEmpleado();
    public static EliminarEmpleado eliminarEmpleado = new EliminarEmpleado();
    public static EliminarAnimal eliminarAnimal = new EliminarAnimal();
    public static ModificarAnimal modificarAnimal = new ModificarAnimal();
    
    public static int idAnimal=0;
    
    
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Test", "2003/08/11", "123", "cr", "123", "mujer", "vet", 2300.0, "admin", "1234");
    empleados.add(empleado);
        iniciar.setVisible(true);
        iniciar.setLocationRelativeTo(null);

        //PENDIENTES
        //CREAR CRUD DE ANIMALES Y EL APADRINAR
        //1 ANIMAL SOLO PUEDE TENER UN PADRINO, PERO UN PADRINO PUEDE APADRINAR VARIOS
        //BD que almacene todo y ver como relacionar con los arraylists
    }

}
