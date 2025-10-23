package org.example.TEMA2;

import java.util.Scanner;

public class bucleFor {
    static void main() {
        //bucle infinito

        Scanner read = new Scanner(System.in);

        for (;;) {
            System.out.println("Bucle Infinitazo");
            break;
        }
        while (true) {
            System.out.println("Introduce un texto:");
            String palabra = read.nextLine();
            if (palabra.equals("HOLA")) {
                continue; // Continue devuelve al inicio del bucle
            }
            System.out.println("DIME HOLA");
            break;
        }
       for ( int i = 1 ; i <= 10 ; i++) {
            System.out.println(i + ". Hola");
       }
    }
}
