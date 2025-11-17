package org.example.TEMA3.pruebas;

import java.util.Arrays;

public class array_invertido {
    static void main() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int j = array.length - 1;
        int aux;
        for (int i = 0 ; i < array.length / 2 ; i++) {
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }
}
