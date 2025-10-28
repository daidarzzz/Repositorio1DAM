package org.example.TEMA2.randomEjercicios;

import java.util.Random;

public class ejercicio1 {
    static void main() {
        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(1,7);
        int dado2 = aleatorio.nextInt(1,7);

//        dado1 = aleatorio.nextInt(6) + 1;
//        dado2 = aleatorio.nextInt(6) + 1;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);


    }
}
