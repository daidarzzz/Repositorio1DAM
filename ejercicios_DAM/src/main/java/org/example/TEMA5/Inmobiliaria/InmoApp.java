package org.example.TEMA5.Inmobiliaria;

public class InmoApp {

    static void main(String[] args) {
        Casa pisito = new Casa("Calle falsa 123");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("cocina", 28);

        pisito.crearHabitacion("baño", 7);

        pisito.crearHabitacion("dormitorio", 31);

        pisito.mostrarHabitaciones();

        System.out.println("la habitación más gramde es " + pisito.getHabitacionMasGrande().getNombre());

        pisito.crearHabitacion("dormitorio", 214);

        pisito.eliminarHabitacion("baño");
        pisito.mostrarHabitaciones();
        pisito.eliminarHabitacion("baño");

        pisito.getListaHabitaciones().get(0).crearElectrodomestico("Batidora", 0.4);
        pisito.getListaHabitaciones().get(0).crearElectrodomestico("Tostadora", 40.6);

        pisito.getListaHabitaciones().get(0).mostrarElectrodomesticos();

        pisito.habitacionMayorConsumo();
    }

}
