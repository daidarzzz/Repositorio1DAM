package org.example.TEMA4;

import java.util.Scanner;

public class Modo3 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        if (!read.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            int mayor = 0;
            int toros = read.nextInt();

            for (int i = 0; i < toros; i++) {
                int velocidad_toro = read.nextInt();
                if (velocidad_toro > mayor) mayor = velocidad_toro;
            }
            System.out.println(mayor);
            return true;
        }
    } // casoDePrueba


}
