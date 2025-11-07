package org.example.TEMA3.bateria;

import java.util.Arrays;

public class ejercicio5 {
    static void main() {
        int[] array = {2,9,6,7,4,6};
        int aux = 0;
        System.out.println(Arrays.toString(array));
        aux = array[array.length-1];

        for (int i = array.length -1 ; i >= 1; i--) {
            array[i] = array[i-1];
        }
        array[0] = aux;
        System.out.println(Arrays.toString(array));
    }
}
