package org.example.TEMA3.eliminar_duplicados;

import java.util.Arrays;

public class eliminarDuplicados2 {
    static void main() {
        int[] original = {1, 2, 2, 2, 3, 3, 4, 4, 5,5};
        int tam = 1;
        for (int i = 0 ; i < original.length-1 ; i++) {

            if (original[i] == original[i+1]) {
                original[i] = -1000;
            } else {
                tam++;
            }
        }
        int[] limpio = new int[tam];
        int j = 0;
        for (int i = 0 ; i < original.length; i++)
        {
            if (original[i] != -1000) {
                limpio[j] = original[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(limpio));
    }
}
