package org.example.TEMA3.pruebas;

import java.util.Arrays;

public class pruebaBinarySearch {
    static void main() {
        int[] vector = {7, 11, 21, 2, 45, 26, 33, 19};

        int indice = Arrays.binarySearch(vector, 2);
        System.out.println("Indice de 2: " + indice);
    }
}
