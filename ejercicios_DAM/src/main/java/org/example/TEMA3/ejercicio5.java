package org.example.TEMA3;

import java.util.Arrays;

public class ejercicio5 {
    static void main() {
        int[] array = {1,2,3,4,5};
        int x = 1;
        for (int i = array.length -1 ; i >= 0 ; i--) {
            if (i == array.length -1) {
                array[0] = array[i];
            } else {
                array[i] = array[x];
                x++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
