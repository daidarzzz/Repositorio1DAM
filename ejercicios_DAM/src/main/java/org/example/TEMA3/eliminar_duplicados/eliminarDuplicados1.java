package org.example.TEMA3.eliminar_duplicados;

import java.util.Arrays;

public class eliminarDuplicados1 {
    static void main() {
        Integer array[] = {1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        Integer array_aux[] = new Integer[array.length];
        int j = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (!Arrays.asList(array_aux).contains(array[i])) {
                array_aux[j] = array[i];
                j++;
            }
        }
        int[] array_limpio = new int[j];
        for (int i = 0; i <= j-1 ; i++) {
            if (array_aux[i] > 0) {
                array_limpio[i] = array_aux[i];
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array_aux));
        System.out.println(Arrays.toString(array_limpio));
    }
}
