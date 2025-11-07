package org.example.TEMA3.bateria;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3
{
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);

        int[] vector = new int[25];
        int contador = 0;

        for (int i = 0; i < vector.length ; i++) {
            vector[i] = aleatorio.nextInt(0, 101);
        }

        System.out.print("Ingresa un número (0-100): ");
        int num = read.nextInt();
        for (int i = 0 ; i < vector.length ; i++) {
            if (vector[i] == num) {
                contador++;
            }
        }
        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");
    }
}
