package org.example.TEMA3.matrices;

import java.util.Arrays;

public class Matrices1 {
    static void main() {
        int[][] matriz = {{0,1,2},{3,4,5},{6,7,8}}; //Tamaño = 3*3 -> new int[3][3];
        int matriz2[][] = new int[3][3];

        System.out.println(matriz[2][1]); //da 7 | Fila 2 - Columna 1

        //Imprimir una matriz
        for (int i = 0 ; i < matriz[0].length ; i++) { //i es fila | asi pregunta por las filas
            for (int j = 0 ; j < matriz.length ; j++) {//j es columna | asi pregunta por las columnas

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        for (int fila[] : matriz) { //For each para una matriz
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        for (int fila[] : matriz) { //For each para una matriz que te de cada fila
            System.out.println(Arrays.toString(fila));
        }

        int[] vector = {1, 2, 3, 4};

        for (int num : vector) { //For each para un vector
            System.out.print(num + " ");
        }


    }
}
