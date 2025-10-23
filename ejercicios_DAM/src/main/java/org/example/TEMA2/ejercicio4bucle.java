package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio4bucle {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = read.next();
        int longitud = cadena.length();
        for (int i = 0 ; i < longitud ; i++) {
            System.out.println(cadena.charAt(i));
        }
    }
}
