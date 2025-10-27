package org.example.TEMA2.preexamen;

import java.util.Scanner;

public class fibonacci {
    public static void main() {
        Scanner read = new Scanner(System.in);
        System.out.print("¿Cuánto debe durar la secuencia de Fibonacci?: ");
        int cantidad = read.nextInt();

        if (cantidad <= 0) {
            System.out.println("Debes introducir un número mayor que 0.");
            return;
        }

        int a = 0;
        int b = 1;

        System.out.print("Secuencia de números: ");
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

    }
}

