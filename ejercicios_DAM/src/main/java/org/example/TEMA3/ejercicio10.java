package org.example.TEMA3;

import java.util.Scanner;

public class ejercicio10 {
    static void main() {
        String[] palabras = {"mandarina", "pez", "escoba", "jacobo", "melón"};

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una letra (inicial)...");

        char letra = read.next().charAt(0);

        for (int i = 0; i < palabras.length ; i++) {
            if (letra == palabras[i].charAt(0)) {
                System.out.println(palabras[i]);
            }
        }
    }
}
