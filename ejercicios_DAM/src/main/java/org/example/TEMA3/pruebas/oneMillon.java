package org.example.TEMA3.pruebas;

import java.util.Arrays;
import java.util.Random;

public class oneMillon {
    static void main() {
        Random aleatorio = new Random();

        int[] array = new int[40_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(0,3000010);
        }

        Arrays.sort(array);
    }
}
