package org.example.TEMA4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static String[][] matriz;


    static int numFilas = 0;
    static int numColumnas = 0;
    static int celdasPorDescubrir = 0;
    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();


    static void main(String[] args) {

        numFilas = read.nextInt();
        numColumnas = read.nextInt();

        matriz = new String[numFilas][numColumnas];
        rellenarMatriz();

        imprimirMatriz();

        String[][] matrizVisible = crearMatrizVisible();

        celdasPorDescubrir = Prefabs.pedirEntero("Introduce el número de celdas a descubrir: ");
        read.nextLine();
        pedirCeldas(celdasPorDescubrir, matrizVisible);
        
    }

    public static void rellenarMatriz () {

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

    public static void imprimirMatriz () {
        System.out.println();
        System.out.println("Buscaminas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
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

    public static void pedirCeldas (int celdasPorDescubrir, String[][] matrizVisible) {



        for (int i = 0; i < celdasPorDescubrir; i++) {
            System.out.print("Qué celda quieres descubrir?: ");
            String[] celdaSeleccionada = read.nextLine().split(" ");

            actualizarMatrizVisible(matrizVisible, matriz ,Integer.parseInt(celdaSeleccionada[0]), Integer.parseInt(celdaSeleccionada[1]));

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

        if (matriz[fila][columna].equals("*"))  {
            return false;
        }

        return true;
    }


    public static void actualizarMatrizVisible (String[][] matriz, String[][] matrizreal, int filas, int columnas) {

        if (matrizreal[filas][columnas].equals("*")) {
            matriz[filas][columnas] = "*";
        } else {
            int contadorBombas = 0;
            for (int i = filas -1; i <= filas+1; i++) {
                for (int j = columnas -1; j <= columnas+1; j++) {
                    if (matrizreal[i][j].equals("*")) contadorBombas++;
                    matriz[filas][columnas] = Integer.toString(contadorBombas);
                }
            }

            if (contadorBombas == 0) {
                
            }
        }
    }

    public static void imprimirMatrizVisible (String[][] matriz) {
        for(String fila[] : matriz) {
            for (String valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

}