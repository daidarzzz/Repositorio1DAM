package org.example.TEMA3;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int[] vector = {1, 3, 5, 7, 9};
        System.out.print("Array original: ");
        for (int i = 0 ; i < vector.length ; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.print("Ingresa el índice a eliminar: ");
        int[] vector_2 = new int[vector.length-1];
        int indice = read.nextInt();


        for (int i = 0; i < vector_2.length ; i++) {
            if (i >= indice) {
                vector_2[i] = vector[i + 1];
            } else {
                vector_2[i] = vector[i];
            }

        }

        System.out.print("Array resultante: ");
        for (int i = 0 ; i < vector_2.length ; i++) {
            System.out.print(vector_2[i] + " ");
        }
    }
}
