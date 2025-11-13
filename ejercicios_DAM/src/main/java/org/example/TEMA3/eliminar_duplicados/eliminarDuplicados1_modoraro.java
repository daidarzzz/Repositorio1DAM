package org.example.TEMA3.eliminar_duplicados;

import java.util.Arrays;

public class eliminarDuplicados1_modoraro {
    static void main() {
        int array[] = {1, 2, 2, 2, 3, 3, 4, 4, 5};
        int array_aux[] = new int[array.length];
        int tam = 0;
        for (int i = 0 ; i <= array.length -1 ; i++) {
            if (i == array.length-1) {
                array_aux[i] = array[i];
                tam++;
            } else if (array[i] != array[i+1]) {
                array_aux[i] = array[i];
                tam++;
            }
        }

        int[] limpio = new int[tam];
        int j = 0;
        for (int i = 0; i < array_aux.length ; i++) {
            if (array_aux[i] != 0) {
                limpio[j] = array_aux[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(array_aux));
        System.out.println(Arrays.toString(limpio));

    }
}
