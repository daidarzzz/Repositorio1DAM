package org.example.TEMA3.BuclesAnidados;

import java.util.Scanner;

public class Ejercicio3_TablaDeMultiplicar {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.print("Número máximo: ");
        int max = read.nextInt();

        extendido:
        for (int i = 1 ; i < 10 ; i++) {
            for (int j = 1 ; j < 11 ; j++) {

                if ((i*j) > max) {
                    System.out.println(i + " * " + j + " = " + (i*j) + " <-- Es mayor que " + max + ", se detiene el bucle");
                    break extendido;
                } else                 System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
