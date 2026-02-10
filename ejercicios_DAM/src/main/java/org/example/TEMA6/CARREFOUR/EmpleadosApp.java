package org.example.TEMA6.CARREFOUR;

public class EmpleadosApp {

    static void main(String[] args) {

        Cajero jorge = new Cajero(147, "Jorge", 1800);

        jorge.mostrarInfo();

        Seguridad juan = new Seguridad(123, "Juan", 2000, "Joaquin Milk", "Manzana", "Carlos", "Navaja");

        juan.mostrarInfo();
    }

}
