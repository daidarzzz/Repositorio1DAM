package org.example.TEMA2.preexamen;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el número base: ");
        int resultado = 1;
        int base = read.nextInt();
        System.out.println("Introduce la potencia: ");
        int potencia = read.nextInt();

        for (int i = 0 ; i < potencia ; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
