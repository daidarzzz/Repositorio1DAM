package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    static void main() {
        Random aleatorio = new Random();
        int filas = aleatorio.nextInt(2,8);
        int matriz[][] = new int[filas][filas];

        for (int i = 0 ; i < matriz.length ; i++) {

            for (int j = 0 ; j < matriz[i].length ; j++) {

                matriz[i][j] = aleatorio.nextInt(1, 101);

            }

        }
        int matriz2[][] = new int[filas][filas];
        for (int i = 0 ; i < matriz2.length ; i++) {

            for (int j = 0 ; j < matriz2[i].length ; j++) {

                matriz2[i][j] = aleatorio.nextInt(1, 101);

            }

        }


        int matrizM[][] = new int[filas][filas];
        int mayor_fila = 0;
        for (int i = 0 ; i < matrizM.length ; i++) {
            for (int j = 0 ; j < matrizM[i].length ; j++) {
                if (matriz[i][j] > matriz2[i][j]) {
                    mayor_fila = matriz[i][j];
                    matrizM[i][j] = mayor_fila;
                } else {
                    mayor_fila = matriz2[i][j];
                    matrizM[i][j] = mayor_fila;
                }
            }
        }

        for (int num[] : matriz) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println();
        for (int num[] : matriz2) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println();

        for (int num[] : matrizM) {
            System.out.println(Arrays.toString(num));
        }

    }
}
