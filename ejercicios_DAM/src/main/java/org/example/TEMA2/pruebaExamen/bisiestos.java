package org.example.TEMA2.pruebaExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bisiestos {
    static void main() {
        Scanner read = new Scanner(System.in);
        final int ANYO_MINIMO = 1900;
        final int ANYO_MAXIMO = 2025;
        int anyo = 0;
        int contador_bisiestos = 0;

        try {
            System.out.println("Elige un año: ");
            anyo = read.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Introduce un número entero.");
            return;
        }

        if (anyo < ANYO_MINIMO || anyo > ANYO_MAXIMO){
            System.out.println("El año no puede ser menor a 1900 ni mayor al año actual (2025)");
            return;
        }

        for (int i = anyo ; i <= ANYO_MAXIMO ; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                contador_bisiestos++;
            }
        }
        System.out.println("Años bisiestos: " + contador_bisiestos);
    }
}
