package org.example.TEMA1;

import java.util.Scanner;

public class calculadora {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el texto a repetir: ");
        String texto = read.nextLine();

        System.out.println("¿Cuantas veces quieres repetirlo?: ");
        int num = read.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i + ". " + texto);
        }
    }
}
