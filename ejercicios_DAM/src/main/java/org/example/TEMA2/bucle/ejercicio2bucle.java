package org.example.TEMA2.bucle;

import java.util.Scanner;

public class ejercicio2bucle {
    static void main() {
        Scanner read = new Scanner(System.in); //Escáner para poder leer lo que introduce el usuario en consola
        System.out.println("Introduce un número: ");
        int num = read.nextInt();
        for ( int i = num ; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
