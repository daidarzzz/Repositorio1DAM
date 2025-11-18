package org.example.TEMA3.BuclesAnidados;

import java.util.Scanner;

public class ArbolDeNavidad {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce tu altura: ");
        int altura = read.nextInt();

        for (int i = 1 ; i <= altura ; i++) {
            for (int j = 1 ; j <=i ; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
