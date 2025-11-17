package org.example.TEMA3.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class palindromo {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.print("Introduce un array: ");
        String[] array = read.next().split("");

        int j = array.length - 1;
        boolean palindromo = true;
        for (int i = 0 ; i < array.length / 2 ; i++) {
            if (!array[i].equals(array[j])) {
                palindromo = false;
                break;
            }
            j--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println((palindromo ? "Es palíndromo" : "No es palíndromo"));
    }
}
