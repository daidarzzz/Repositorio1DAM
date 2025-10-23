package org.example.TEMA2.bucle;

import java.util.Scanner;

public class ejercicio6bucle {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Cúantos números quieres sumar?: ");
        int cantidad = read.nextInt();
        int suma = 0;
        for (int i = 1 ; i <= cantidad ; i++ ) {
            System.out.print("Inserta nº" + i + ": ");
            suma += read.nextInt();
        }
        System.out.println("El resultado de la suma es " + suma);
    }
}
