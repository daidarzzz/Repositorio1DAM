package org.example.TEMA3.bateria;

import java.util.Random;

public class ejercicio1 {
    static void main() {
        Random aleatorio = new Random();

        int[] vector = new int[8];
        int sumatorio = 0;
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = aleatorio.nextInt(0, 501);
            sumatorio += vector[i];
        }
        System.out.println("La suma de los elementos es: " + sumatorio);
    }
}
