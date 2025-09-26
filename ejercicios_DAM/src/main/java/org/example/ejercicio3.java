package org.example;

import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = read.nextInt();

        if (num > 0) {
            System.out.println(num + " es positivo");
        } else if (num < 0) {
            System.out.println(num + " es negativo");
        }
        else {
            System.out.println("0 es un número natural");
        }


    }
}
