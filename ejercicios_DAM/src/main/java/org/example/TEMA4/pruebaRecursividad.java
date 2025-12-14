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
    static void main() {

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

        int max = 8 * 8;
        int[] posicionesFila = new int[max];
        int[] posicionesColumna = new int[max];
        int posicionAux = 0;
        int contador = 0;
        for (int i = fila-1; i <= fila+1; i++) {
            for (int j = columna-1; j <= columna+1; j++) {
                if (matrizReal[i][j].equals("*")) contador++;
                if (matrizVisible[i][j].equals("X")) {
                    posicionesFila[posicionAux] = i;
                    posicionesColumna[posicionAux] = j;
                    posicionAux++;
                }
            }
        }
        do {
            for (int i = posicionesFila[posicionAux]-1; i <= posicionesFila[posicionAux]+1; i++) {
                for (int j = posicionesColumna[posicionAux]-1; j <= posicionesColumna[posicionAux]+1; j++) {
                    if (matrizReal[i][j].equals("*")) contador++;
                    if (matrizVisible[i][j].equals("X")) {
                        posicionesFila[posicionAux] = i;
                        posicionesColumna[posicionAux] = j;
                        posicionAux++;
                    }
                }
            }

            contador++;
            if (contador != 0) matrizVisible[fila][columna] = Integer.toString(contador);
            else matrizVisible[fila][columna] = "-";
        } while (contador < posicionAux);


        for (int i = 0; i < posicionAux; i++) {
            System.out.print(posicionesFila[i]);
            System.out.print(" " +posicionesColumna[i]);
            System.out.println();
        }

    }

}

