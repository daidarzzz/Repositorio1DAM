package org.example.TEMA3.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class añadirArray {
    static void main() {
        Scanner read = new Scanner(System.in);

        int[] array = {1, 2, 4, 5};
        int[] array2 = new int[array.length+1];
        System.out.println(Arrays.toString(array));
        System.out.println("Inserta el nuevo número a introducir:");
        int num = read.nextInt();
        System.out.println("Posición donde meter nuevo número: ");
        int pos = read.nextInt();
        int j = 0;
        for (int i = 0 ; i < array2.length ; i++) {

            if (i == pos) {
                array2[i] = num;
            } else {
                array2[i] = array[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));



    }
}
