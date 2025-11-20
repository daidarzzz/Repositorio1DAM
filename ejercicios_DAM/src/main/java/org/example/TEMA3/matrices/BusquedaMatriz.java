package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaMatriz {
    static void main() {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        String posicion = "";

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce valor (" + i + "," + j + "): ");
                int valor = read.nextInt();
                matriz[i][j] = valor;
            }
        }

        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println();
        System.out.print("Número a buscar: ");
        int numero = read.nextInt();
        System.out.println();
        boolean encontrado = false;
        externo:
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    posicion = ("(" + i + ", " + j + ")");
                    encontrado = true;
                    break externo;
                }
            }
        }

        System.out.println("Salida:");
        if (encontrado) {
            System.out.println("El número " + numero + " se encuentra en la posición " + posicion);
        } else System.out.println("No se ha encontrado en la matriz el número introducido.");

    }
}
