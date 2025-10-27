package org.example.TEMA2.preexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int cantidad = 0;
        int num = 0;
        try {
            System.out.print("Cuantos números quieres introducir: ");
            cantidad = read.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir la cantidad: " + e.getMessage());
            return;
        }

        int menorcero = 0;
        int mayorcero = 0;
        int igual = 0;
        for (int i = 0; i < cantidad ; i++) {
            try {
                System.out.print("Introduce un número: ");
                num = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir la cantidad: " + e.getMessage());
                return;
            }

            if (num < 0) {
                menorcero++;
            } else if (num > 0) {
                mayorcero++;
            } else {
                igual++;
            }
        }
        System.out.println("Mayores que 0: " + mayorcero);
        System.out.println("Menores que 0: " + menorcero);
        System.out.println("Iguales a 0: " + igual);
    }
}
