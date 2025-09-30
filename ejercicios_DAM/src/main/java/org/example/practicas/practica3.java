package org.example.practicas;

import java.util.Scanner;

public class practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("***¡BIENVENIDO AL RATÓN JUGUETÓN!***");

        System.out.println("Introduce tu altura (cm): ");
        int altura = read.nextInt();
        if (altura < 140) {
            System.out.println();
        }
    }
}
