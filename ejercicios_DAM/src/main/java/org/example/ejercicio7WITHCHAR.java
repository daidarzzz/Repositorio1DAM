package org.example;

import java.util.Scanner;

public class ejercicio7WITHCHAR {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Tienes aceite? (S/N): ");
        char aceite = read.next().charAt(0);
        System.out.println("¿Tienes tomate? (S/N): ");
        char tomate = read.next().charAt(0);
        System.out.println("¿Tienes jamón? (S/N): ");
        char jamon = read.next().charAt(0);

        if (aceite == 'N' || tomate == 'N' || jamon == 'N') {
            System.out.println("¡Tenemos que ir a comprar!");
        } else System.out.println("¡No tenemos que ir a comprar!");
    }
}