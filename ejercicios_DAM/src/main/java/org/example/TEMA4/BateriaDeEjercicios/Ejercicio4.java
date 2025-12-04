package org.example.TEMA4.BateriaDeEjercicios;

import org.example.TEMA4.Prefabs;

public class Ejercicio4 {
    static void main(String[] args) {
        int[] vector = new int[5];
        Prefabs.rellenarArrayInt(vector);
        Prefabs.printlnArrayInt (vector);
        int opcion = Prefabs.menu("CAJERO AUTOMÁTICO", "Ingresar dinero", "Sacar dinero", "Salir");
        if (opcion == 3) System.out.printf("ADIOSS");
    }


}
