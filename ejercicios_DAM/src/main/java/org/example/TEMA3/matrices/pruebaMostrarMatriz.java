package org.example.TEMA3.matrices;

public class pruebaMostrarMatriz {
    static void main() {
        int[][] matriz = { {1, 2, 3, 4}
                          ,{5, 6, 7, 8}
                          ,{9, 10, 11, 12}};

        for (int c = 0; c < matriz[0].length; c++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
