package org.example.TEMA3.PRACTICA;

import java.util.Arrays;
import java.util.Formattable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("****** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        int ancho = 0;
        int alto = 0;
        boolean ancho_alto_correctos = false;
        do {
            try {
                System.out.println("Ancho:");
                ancho = read.nextInt();
                System.out.println("Alto:");
                alto = read.nextInt();
                if (ancho % 8 != 0 || alto % 8 != 0) {
                    System.out.println("El alto y el ancho deben ser múltiplos de 8.");
                } else if (ancho > 48 || alto > 48) {
                    System.out.println("El alto y ancho no pueden ser mayores de 48.");
                } else {
                    ancho_alto_correctos = true;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Error, debes de introducir un número entero válido.");
                read.nextLine();
            }
        } while (!ancho_alto_correctos);

        String pixeles[][] = new String[alto][ancho];

        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada píxel:");
        externo:
        for (int i = 0; i < pixeles.length; i++) {
            String fila[] = read.next().split("");
            if (fila.length != ancho) {
                System.out.println("Error. Cada fila debe de medir " + ancho + " de ancho.");
                read.nextLine();
                i--;
                continue externo;
            }
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

        System.out.println();
        int contador_colores = 0;
        boolean colores_validos = true;



        externo:
        for (int fila = 0; fila < alto; fila += 8) {

            for (int columna = 0; columna < ancho; columna += 8) {

                String[] colores = new String[2];
                contador_colores = 0;

                for (int i = 0; i < 8; i++) {

                    for (int j = 0; j < 8; j++) {

                        String pixel = pixeles[i + fila][j + columna].toUpperCase();


                        if (!Arrays.asList(colores).contains(pixel) && contador_colores == 2) {
                            colores_validos = false;
                            break externo;
                        }

                        if (!Arrays.asList(colores).contains(pixel)) {
                            colores[contador_colores] = pixel;
                            contador_colores++;
                        }



                    }

                }
            }
        }

        System.out.println(colores_validos ? "Es compatible con un ZX Spectrum" : "No es compatible con un ZX Spectrum");


    }
}
