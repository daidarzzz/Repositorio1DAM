package org.example.TEMA5.Inmobiliaria;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public Habitacion (String nombre, double metros) {
        this.nombre = nombre;
        this.metros = metros;
        listaElectrodomesticos = new ArrayList<>();
    }

    public void crearElectrodomestico(String nombre, double consumo) {

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico.getNombre().equals(nombre)) {
                System.out.println("Este electrodoméstico ya existe.");
                return;
            }
        }

        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);

        listaElectrodomesticos.add(electrodomestico);

    }

    public void mostrarElectrodomesticos() {
        System.out.println("Número de electrodomésticos en la habitación " + nombre + ":" );

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            System.out.println("- " + electrodomestico);
        }

    }

    public double calcularConsumo() {
        double sumatorio = 0;
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            sumatorio += electrodomestico.getConsumo();
        }
        return sumatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }


    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }
}
