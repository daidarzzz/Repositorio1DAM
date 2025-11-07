package org.example.TEMA3.bateria;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int[] vector = {1, 2, 3, 4};
        int[] vector2 = new int[vector.length+1];
        System.out.println("Inserta el numero que quieras");
        int num = teclado.nextInt();
        System.out.println("Inserta en la posicion en la que lo quieras poner");
        int pos = teclado.nextInt();

        for (int i = 0; i < vector2.length; i++){
            if (i == pos){
                vector2[pos] = num;
            } else if (i > pos) {
                vector2[i] = vector[i-1];
            } else {
                vector2[i] = vector[i];
            }
        }
        System.out.println(Arrays.toString(vector2));
    }
}
