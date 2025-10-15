package org.example.TEMA1;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double a = read.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double b = read.nextDouble();

        if (b == 0) {
            System.out.println("ERROR: no se puede dividir entre 0");
            return;
        }
        System.out.println("El resultado de la división es " + (a/b));
    }
}