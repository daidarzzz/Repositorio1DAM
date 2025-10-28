package org.example.TEMA2.randomEjercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce rango mínimo: ");
        int min = read.nextInt();
        System.out.println("Introduce rango máximo: ");
        int max = read.nextInt();

        System.out.println("¿Cuántos números aleatorios quieres?: ");
        int cantidad = read.nextInt();

        for (int i = 1 ; i <= cantidad ; i++) {
            //int num = aleatorio.nextInt(max - min + 1) + min;
            int num = aleatorio.nextInt(min, max + 1);
            System.out.println(num);
        }
    }
}
