package org.example.TEMA3;

import java.util.Arrays;
import java.util.InputMismatchException;

public class ejercicio6 {
    static void main() {
        int[] vector = {1,2,3,2,1};
        int ultima_posicion = vector.length -1;
        boolean palindromo = true;
        for (int i = 1 ; i < vector.length / 2 ; i++) {
            if (vector[i] != vector[ultima_posicion - i]) {
                System.out.println("No es palindromo");
                palindromo = false;
                break;
            }
        }
        if (palindromo) System.out.println("Es palindromo");
    }
}