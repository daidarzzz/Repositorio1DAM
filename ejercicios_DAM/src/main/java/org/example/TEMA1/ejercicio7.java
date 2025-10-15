package org.example.TEMA1;

import java.util.Scanner;

public class ejercicio7 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Tienes aceite?: ");
        String aceite = read.next();
        System.out.println("¿Tienes tomate?: ");
        String tomate = read.next();
        System.out.println("¿Tienes jamón?: ");
        String jamon = read.next();

        if (aceite.equals("no") || tomate.equals("no") || jamon.equals("no")) {
            System.out.println("¡Tenemos que ir a comprar!");
        } else System.out.println("¡No tenemos que ir a comprar!");
    }
}