package org.example.TEMA4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static String[][] matrizReal;


    static int numFilas = 0;
    static int numColumnas = 0;
    static int celdasPorDescubrir = 0;
    static String[][] matrizVisible;
    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();


    static void main(String[] args) {

        numFilas = pedirEntero("Introduce el número de filas: ");
        numColumnas = pedirEntero("Introduce el número de columnas: ");

        if (numFilas > 50 || numColumnas > 50) {
            System.out.println("No puede haber más de 50 filas ni 50 columnas");
            return;
        }

        matrizReal = new String[numFilas][numColumnas];
        rellenarMatriz();

        imprimirMatriz();

        matrizVisible = crearMatrizVisible();

        celdasPorDescubrir = pedirEntero("Introduce el número de celdas a descubrir: ");
        read.nextLine();
        pedirCeldas(celdasPorDescubrir);
        
    }

    public static int pedirEntero(String texto) {
        int num = 0;
        boolean seguir = true;

        do {
            System.out.print(texto);
            try {
                num = read.nextInt();
                read.nextLine();
                seguir = false;
            } catch (InputMismatchException e) {
                System.out.println("Error. Debes introducir un número entero");
                read.nextLine();
            }
        } while (seguir);

        return num;
    }



    public static void rellenarMatriz () {

        int filaActual = 0;
        externo:
        for (int i = 0; i < matrizReal.length; i++) {
            System.out.println("Introduce los " + numColumnas + " carácteres de la fila " + filaActual);
            String valoresFilaActual[] = read.next().split("");

            if (valoresFilaActual.length != numColumnas) {
                i--;
                System.out.println("La fila debe de tener " + numColumnas + " carácteres.");
                continue;
            }
            for (int j = 0; j < matrizReal[0].length; j++) {
                if (!valoresFilaActual[j].equals("*") && !valoresFilaActual[j].equals("-")) {
                    System.out.println("La fila debe de tener solo '-' o '*'. Cerrando el programa.");
                    i--;
                    continue externo;
                }
                matrizReal[i][j] = valoresFilaActual[j];
            }
            filaActual++;
        }


    }

    public static void imprimirMatriz () {
        System.out.println();
        System.out.println("Buscaminas:");
        for (int i = 0; i < matrizReal.length; i++) {
            for (int j = 0; j < matrizReal[0].length; j++) {
                System.out.print(matrizReal[i][j]);
            }
            System.out.println();
        }
    }


    public static String[][] crearMatrizVisible() {
        String[][] matrizVisible = new String[numFilas][numColumnas];

        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible[0].length; j++) {
                matrizVisible[i][j] = "X";
            }
        }

        return matrizVisible;
    }

    public static void pedirCeldas (int celdasPorDescubrir) {



        for (int i = 0; i < celdasPorDescubrir; i++) {
            System.out.print("Qué celda quieres descubrir?: ");
            String[] celdaSeleccionada = read.nextLine().split(" ");

            limpiarCeros(Integer.parseInt(celdaSeleccionada[0]), Integer.parseInt(celdaSeleccionada[1]));

            imprimirMatrizVisible(matrizVisible);

            if (!comprobarGameOver(celdaSeleccionada)) {
                System.out.println("GAME OVER");
                break;
            }

        }
    }

    public static boolean comprobarGameOver  (String[] celdaSeleccionada) {
        int fila = Integer.parseInt(celdaSeleccionada[0]);
        int columna = Integer.parseInt(celdaSeleccionada[1]);

        if (matrizReal[fila][columna].equals("*"))  {
            return false;
        }

        return true;
    }


    public static void limpiarCeros(int fila, int columna) {

        int maximo = numFilas*numColumnas;

        int[] filasPendientes = new int[maximo];
        int[] columnasPendientes = new int[maximo];

        int celdaActual = 0;
        int celdasTotales = 1;

        filasPendientes[0] = fila;
        columnasPendientes[0] = columna;

        if (matrizReal[fila][columna].equals("*")) matrizVisible[fila][columna] = "*";
        else {

            while (celdaActual < celdasTotales) {



                int filaActual = filasPendientes[celdaActual];
                int columnaActual = columnasPendientes[celdaActual];

                int contadorBombas = 0;
                celdaActual++;



                for (int i = filaActual -1; i <= filaActual +1; i++) {
                    for (int j = columnaActual -1; j <= columnaActual +1 ; j++) {

                        if (i < 0 || i >= numFilas || j < 0 || j >= numColumnas) continue;

                        if (matrizReal[i][j].equals("*")) contadorBombas++;

                    }
                }

                if (contadorBombas != 0) {
                    matrizVisible[filaActual][columnaActual] = Integer.toString(contadorBombas);
                } else {

                    matrizVisible[filaActual][columnaActual] = "-";

                    for (int i = filaActual -1; i <= filaActual +1; i++) {
                        for (int j = columnaActual -1; j <= columnaActual +1 ; j++) {

                            if (i < 0 || i >= numFilas || j < 0 || j >= numColumnas) continue;

                            if (matrizVisible[i][j].equals("X")) {
                                filasPendientes[celdasTotales] = i;
                                columnasPendientes[celdasTotales] = j;
                                celdasTotales++;
                            }

                        }
                    }


                }

            }
        }

    }

    public static void imprimirMatrizVisible (String[][] matriz) {
        for(String fila[] : matriz) {
            for (String valor : fila) {
                System.out.print(valor);
            }
            System.out.println();
        }
    }

}