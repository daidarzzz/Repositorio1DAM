package org.example.TEMA5.Inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;


public class Casa {

    static Scanner read = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa (String direccion) {
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();
    }

    public void crearHabitacion (String nombre, double metros) {

        for (Habitacion habitacion : listaHabitaciones) {

            if (habitacion.getNombre().equals(nombre)) {
                System.out.println("La habitación " + nombre + " ya existe.");
                return;
            }

        }

        Habitacion habitacion = new Habitacion(nombre, metros);

        listaHabitaciones.add(habitacion);
        System.out.println("Se ha creado la habitación " + nombre + " correctamente.");
        //opcion 2
        //listaHabitaciones.add(new Habitacion(nombre, metros))
    }

    public void mostrarHabitaciones() {

        System.out.println("Casa en " + direccion + " tiene " + listaHabitaciones.size() + " habitaciones");
        System.out.println("Propietario de la casa: " + propietario.getNombre() + " de " + propietario.getEdad() + " años");

        for (Habitacion habitacion : listaHabitaciones) {

            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");

        }

    }

    public Habitacion getHabitacionMasGrande() {

        Habitacion mayor = listaHabitaciones.get(0);

        for (Habitacion habitacion : listaHabitaciones) {

            if (habitacion.getMetros() > mayor.getMetros()) {
                mayor = habitacion;
            }

        }

        return mayor;
    }

    public void eliminarHabitacion(String nombre) {

       for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitación " + nombre + " borrada con éxito.");
                return;
            }
       }

        System.out.println("La habitación " + nombre + " no existe.");

    }

    public void habitacionMayorConsumo () {

        int indice = -1;
        double mayor = 0;
        for (int i = 0; i < listaHabitaciones.size(); i++) {

            mayor = 0;
            if (listaHabitaciones.get(i).calcularConsumo() > mayor) {
                mayor = listaHabitaciones.get(i).calcularConsumo();
                indice = i;
            }
        }

        System.out.println("La habitación con mayor consumo es " + listaHabitaciones.get(indice).getNombre() + " con un consumo de " + mayor + "kwh");

    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario: ");
        String nombre = read.next();
        System.out.println("Introduce la edad: ");
        int edad = read.nextInt();
        read.nextLine();
        Propietario propietario = new Propietario(nombre, edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombre + " añadido con éxito");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario=" + propietario +
                '}';
    }
}
