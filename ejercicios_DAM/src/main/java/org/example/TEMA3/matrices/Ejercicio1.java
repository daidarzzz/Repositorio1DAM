package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
    static void main() {
        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(2,8);
        int matriz[][] = new int[filas][filas];

        for (int i = 0 ; i < matriz.length ; i++) {

            for (int j = 0 ; j < matriz[i].length ; j++) {

                matriz[i][j] = aleatorio.nextInt(1, 1_000_001);

            }

        }

        for (int i = 0 ; i < matriz.length ; i++) {

            for (int j = 0 ; j < matriz[i].length ; j++) {

                if (j == i) {
                    System.out.print(matriz[i][j] + " ");
                }

            }

        }
        System.out.println();
        for (int fila[] : matriz) {

            System.out.println(Arrays.toString(fila));

        }


        for (int i = 0 ; i < matriz.length ; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        for (int i = 0 ; i < matriz.length ; i++) {

            System.out.println(matriz[i][matriz.length-1 - i]);

        }
    }
}
