package org.example.TEMA3;

import java.util.Arrays;
import java.util.InputMismatchException;

public class ejercicio2 {
    static void main() {
        int[] vector = {5, 1, 6, 8, 3};
        int aux = 0;
        for (int i = 0 ; i < vector.length / 2 ; i++) {
            aux = vector[i];
            vector[i] = vector[vector.length-1 -i];
            vector[vector.length-1-i] = aux;
        }
        System.out.println(Arrays.toString(vector));

    }
}
