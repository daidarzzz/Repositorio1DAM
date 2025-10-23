package org.example.TEMA2.bucle;

import java.util.Scanner;

public class ejercicio5bucle {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = read.nextInt();
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
