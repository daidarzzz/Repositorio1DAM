package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio7bucle {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = read.next();
        int longitud = cadena.length();
        for (int i = longitud - 1 ; i >= 0 ; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}
