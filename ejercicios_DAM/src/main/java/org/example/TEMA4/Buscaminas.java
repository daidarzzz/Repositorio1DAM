package org.example.TEMA4;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    static int numFilas = 0;
    static int numColumnas = 0;
    static int celdasPorDescubrir = 0;
    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();
    static void main(String[] args) {

        numFilas = read.nextInt();
        numColumnas = read.nextInt();

        celdasPorDescubrir = Prefabs.pedirEntero("Introduce el número de celdas a descubrir: ");

        String[][] matriz = new String[numFilas][numColumnas];
        rellenarMatriz(matriz);

        imprimirMatriz(matriz);
        
    }

    public static void rellenarMatriz (String[][] matriz) {

        int filaActual = 0;
        externo:
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce los " + numColumnas + " carácteres de la fila " + filaActual);
            String valoresFilaActual[] = read.next().split("");

            if (valoresFilaActual.length != numColumnas) {
                i--;
                System.out.println("La fila debe de tener " + numColumnas + " carácteres.");
                continue;
            }
            for (int j = 0; j < matriz[0].length; j++) {
                if (!valoresFilaActual[j].equals("*") && !valoresFilaActual[j].equals("-")) {
                    System.out.println("La fila debe de tener solo '-' o '*'. Cerrando el programa.");
                    i--;
                    continue externo;
                }
                matriz[i][j] = valoresFilaActual[j];
            }
            filaActual++;
        }


    }

    public static void imprimirMatriz (String[][] matriz) {
        System.out.println();
        System.out.println("Buscaminas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }


}