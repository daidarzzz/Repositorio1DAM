package org.example.TEMA5.PRACTICA1;

public class AppProgramas {

    public static void main(String[] args) {

        Empleado andrea = new Empleado("Andrea", "director");
        System.out.println(andrea.getId() + " " + andrea.getCargo());

        Cadena telecinco = new Cadena("Telecinco");
        Programa minecraft = new Programa("Minecraft", telecinco, andrea);
        Programa roblox = new Programa("Roblos", telecinco, andrea);


        System.out.println(telecinco.getListaProgramas());
    }


}
