package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2_bucles_sumar_matrizes {
    static void main() {
        Random aleatorio = new Random();

        int matriz[][] = new int[aleatorio.nextInt(1, 6)][aleatorio.nextInt(1, 6)];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(25, 65);

            }

        }
        for (int fila[] : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sumatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumatorio = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumatorio += matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ": " + sumatorio);
        }
        System.out.println();

        for (int i = 0 ; i < matriz[0].length ; i++) {
            sumatorio = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumatorio += matriz[j][i];
            }
            System.out.println("Columna " + (i+1) + ": " + sumatorio);
        }
        sumatorio = 0;
        System.out.println();
        int fila = aleatorio.nextInt(0, matriz.length);
        for (int i = 0 ; i < matriz[0].length ; i++) {
           sumatorio += matriz[fila][i];
        }
        System.out.println("1 fila (" + (fila+1) + "): " + sumatorio);

    }
}
