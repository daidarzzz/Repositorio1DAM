package org.example.TEMA3.BuclesAnidados;

import java.util.Scanner;

public class NumerosPrimos {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el valor m: ");
        int m = read.nextInt();
        extendido:
        for (int i = 2 ; i <= m ; i++) {
            for (int j = 2 ; j < i ; j++ ) {
                if (i % j == 0) {
                    continue extendido;
                }

            }
            System.out.print(i + " ");
        }
    }
}
