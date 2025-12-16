package org.example.TEMA4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BuscaminasJuez {

    public static String[][] matrizReal;


    static int numFilas = 0;
    static int numColumnas = 0;
    static int celdasPorDescubrir = 0;
    static String[][] matrizVisible;
    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();


    public static void main(String[] args) {
        numFilas = read.nextInt();
        numColumnas = read.nextInt();


        matrizReal = new String[numFilas][numColumnas];
        rellenarMatriz();

        matrizVisible = crearMatrizVisible();

        celdasPorDescubrir = read.nextInt();
        read.nextLine();
        pedirCeldas(celdasPorDescubrir);

    }




    public static void rellenarMatriz () {

        int filaActual = 0;
        externo:
        for (int i = 0; i < matrizReal.length; i++) {
            String valoresFilaActual[] = read.next().split("");

            for (int j = 0; j < matrizReal[0].length; j++) {
                matrizReal[i][j] = valoresFilaActual[j];
            }
            filaActual++;
        }


    }

    public static void imprimirMatriz () {
        System.out.println();
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
            String[] celdaSeleccionada = read.nextLine().split(" ");
            int fila = Integer.parseInt(celdaSeleccionada[0])-1;
            int columna = Integer.parseInt(celdaSeleccionada[1])-1;
            asignarValorCelda(fila, columna);

            if (!comprobarGameOver(celdaSeleccionada)) {
                System.out.println("GAME OVER");
                break;
            }

        }

        imprimirMatrizVisible(matrizVisible);
    }

    public static boolean comprobarGameOver  (String[] celdaSeleccionada) {
        int fila = Integer.parseInt(celdaSeleccionada[0]) - 1;
        int columna = Integer.parseInt(celdaSeleccionada[1]) - 1;

        if (matrizReal[fila][columna].equals("*"))  {
            return false;
        }

        return true;
    }


    public static void asignarValorCelda(int fila, int columna) {

        int maximo = numFilas*numColumnas;

        int[] filasPendientes = new int[maximo];
        int[] columnasPendientes = new int[maximo];

        int celdasPendientes = 1;

        filasPendientes[0] = fila;
        columnasPendientes[0] = columna;

        if (matrizReal[fila][columna].equals("*")) matrizVisible[fila][columna] = "*";
        else {

            for(int indice = 0; indice < celdasPendientes; indice++ ) {



                int filaActual = filasPendientes[indice];
                int columnaActual = columnasPendientes[indice];

                int contadorBombas = 0;



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
                                filasPendientes[celdasPendientes] = i;
                                columnasPendientes[celdasPendientes] = j;
                                celdasPendientes++;
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