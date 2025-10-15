package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el primer texto: ");
        String texto1 = read.nextLine();
        System.out.println("Introduce el segundo");
        String texto2 = read.nextLine();

        int tam_texto1 = texto1.length();
        int tam_texto2 = texto2.length();

        if (texto1.equals(texto2)) {
            System.out.println("LOS TEXTOS DEBEN DE SER DISTINTOS.");
        } else {
            if (tam_texto1 > tam_texto2) {
                System.out.println("EL PRIMER NÚMERO ES MÁS LARGO QUE EL SEGUNDO");
            } else if (tam_texto1 < tam_texto2) {
                System.out.println("EL SEGUNDO NÚMERO ES MÁS LARGO QUE EL PRIMERO");
            } else {
                System.out.println("LOS DOS NÚMEROS TIENEN LA MISMA LONGITUD 😡");
            }

        }


    }
}
