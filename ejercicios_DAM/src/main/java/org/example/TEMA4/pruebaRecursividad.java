package org.example.TEMA4;

import java.util.Arrays;
import java.util.Scanner;

public class pruebaRecursividad {

    static Scanner read = new Scanner(System.in);
    static String[][] matrizReal = {
            {"-", "*", "-", "-", "-", "*", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"*", "*", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "*", "-", "-", "-", "-"},
            {"-", "-", "-", "*", "-", "-", "-", "*"},
            {"-", "*", "-", "-", "*", "-", "-", "-"},
            {"-", "-", "-", "-", "*", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"}
    };
    static String[][] matrizVisible = new String[8][8];
    public static void main(String[] args) {

        rellenarMatrices();
        imprimirMatriz(matrizVisible);
        System.out.println();
        imprimirMatriz(matrizReal);

        System.out.println("Introduce la celda a buscar: ");
        String[] celdaSeleccionada = read.nextLine().split(" ");
        limpiarCeros(Integer.parseInt(celdaSeleccionada[0]), Integer.parseInt(celdaSeleccionada[1]));
        imprimirMatriz(matrizVisible);
    }


    public static void rellenarMatrices() {
        for (int i = 0; i < matrizReal.length; i++) {
            for (int j = 0; j < matrizReal[0].length; j++) {
                matrizVisible[i][j] = "X";
            }
        }
    }


    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void limpiarCeros(int fila, int columna) {

        int maximo = 8*8;

        int[] filasPorLimpiar = new int[maximo];
        int[] columnasPorLimpiar = new int[maximo];

        int celdaActual = 0;
        int celdasTotales = 1;

        filasPorLimpiar[0] = fila;
        columnasPorLimpiar[0] = columna;

        while (celdaActual < celdasTotales) {



            int filaActual = filasPorLimpiar[celdaActual];
            int columnaActual = columnasPorLimpiar[celdaActual];

            int contadorBombas = 0;
            celdaActual++;



            for (int i = filaActual -1; i <= filaActual +1; i++) {
                for (int j = columnaActual -1; j <= columnaActual +1 ; j++) {

                    if (i < 0 || i >= 8 || j < 0 || j >= 8) continue;

                    if (matrizReal[i][j].equals("*")) contadorBombas++;

                }
            }

            if (contadorBombas != 0) {
                matrizVisible[filaActual][columnaActual] = Integer.toString(contadorBombas);
            } else {

                matrizVisible[filaActual][columnaActual] = "-";

                for (int i = filaActual -1; i <= filaActual +1; i++) {
                    for (int j = columnaActual -1; j <= columnaActual +1 ; j++) {

                        if (i < 0 || i >= 8 || j < 0 || j >= 8) continue;

                        if (matrizVisible[i][j].equals("X")) {
                            filasPorLimpiar[celdasTotales] = i;
                            columnasPorLimpiar[celdasTotales] = j;
                            celdasTotales++;
                        }

                    }
                }


            }

        }
    }



}

