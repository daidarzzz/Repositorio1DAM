package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu texto: ");
        String texto = read.nextLine();

        System.out.println("Introduce la palabra que se repite: ");
        String palabra = read.nextLine();

        int longitud_texto = texto.length();
        int longitud_palabra = palabra.length();

        String texto_sin_palabra = texto.replace(palabra, "");

        int longitud_sin_palabra = texto_sin_palabra.length();

        int total = (longitud_texto - longitud_sin_palabra) / longitud_palabra;
        System.out.println(total);
    }
}
