package org.example.TEMA3.PRACTICA;

import java.util.Arrays;
import java.util.Formattable;
import java.util.Scanner;

public class Practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("****** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        int ancho = 0;
        int alto = 0;

        do {
            System.out.println("Ancho:");
            ancho = read.nextInt();
            System.out.println("Alto:");
            alto = read.nextInt();
            if (ancho % 8 != 0 || alto % 8 != 0) {
                System.out.println("El alto y el ancho deben ser múltiplos de 8.");
            }
        } while (ancho % 8 != 0 || alto % 8 != 0);

        String pixeles[][] = new String[alto][ancho];

        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada píxel:");
        externo:
        for (int i = 0; i < pixeles.length; i++) {
            String fila[] = read.next().split("");

            for (int j = 0; j < pixeles[i].length; j++) {
                if (!fila[j].matches("[a-oA-O]")) {
                    System.out.println("Has introducido un valor de píxel incorrect (A-O)");
                    i--;
                    continue externo;
                }
                pixeles[i][j] = fila[j];
            }
        }

        for (String filas[] : pixeles ) {
            System.out.println();
            for (String valor : filas) {
                System.out.print(valor + " ");
            }
        }


    }
}
