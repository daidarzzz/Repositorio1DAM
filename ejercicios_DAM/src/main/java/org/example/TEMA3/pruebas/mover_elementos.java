package org.example.TEMA3.pruebas;

import java.util.Arrays;

public class mover_elementos {
    static void main(String[] args) {
        int[] array = {1, 2, 3, 4 ,5};
        int ultimo = array[array.length-1];
        for (int i = array.length - 1;  i >= 0 ; i--) {
            if (i == 0) {
                array[i] = ultimo;
            } else {
                array[i] = array[i-1];
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
