package org.example;

import java.util.Scanner;

public class ejercicio6 {
    static void main() {
        Scanner read = new Scanner(System.in);
        double base = 0;
        do {
            if (base < 0) System.out.println("El valor de la base tiene que ser positivo.");
            System.out.println("Introduce el valor base: ");
            base = read.nextDouble();
        } while (base < 0) ;

        double altura = 0;
        do {
            if (base < 0) System.out.println("El valor de la altura tiene que ser positivo.");
            System.out.println("Introduce el valor de altura: ");
            altura = read.nextDouble();
        } while (base < 0) ;

        double A = (base * altura) / 2;
        System.out.println("El área del triángulo es " + A);
    }
}