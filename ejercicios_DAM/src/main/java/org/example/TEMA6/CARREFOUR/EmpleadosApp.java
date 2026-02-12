package org.example.TEMA6.CARREFOUR;

import java.util.ArrayList;

public class EmpleadosApp {

    static void main(String[] args) {

        Cajero jorge = new Cajero(147, "Jorge", 1800);

        jorge.mostrarInfo();

        Seguridad juan = new Seguridad(123, "Juan", 2000, "Joaquin Milk", "Manzana", "Carlos", "Navaja");

        juan.mostrarInfo();

        Persona manuel = new Cajero(1232, "Manuel", 2000);

        ArrayList<Persona> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(juan);

        System.out.println(listaEmpleados);

        for (Persona persona : listaEmpleados) {

            System.out.println(persona.getNombre());

        }

        fichar(manuel);
        fichar(juan);

    }

    public static void fichar(Persona persona) {

        System.out.println("Fichando...");

    }

}
