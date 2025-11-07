package org.example.TEMA3.bateria;

import java.util.Arrays;

public class ejercicio7 {
    static void main() {
        int[] vector1 = {1,2,3};
        int[] vector2 = {4,5,6};
        int[] vector3 = new int[vector1.length+vector2.length];

        for (int i = 0 ; i < vector1.length ; i++) {
            vector3[i] = vector1[i];
        }
        for (int i = 0 ; i < vector2.length ; i++){
            vector3[i+vector2.length] = vector2[i];
        }
        System.out.println(Arrays.toString(vector3));
    }
}
