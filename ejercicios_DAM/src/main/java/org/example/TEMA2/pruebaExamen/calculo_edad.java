package org.example.TEMA2.pruebaExamen;

import java.util.Scanner;

public class calculo_edad {
    static void main() {
        Scanner read = new Scanner(System.in);
        final int ANYO_ACTUAL = 2025;
        System.out.println("Permiteme preguntarte, qué año naciste");
        int anyo = read.nextInt();
        int longitud = ANYO_ACTUAL - anyo;
        System.out.println(longitud);
        for (int i = 0; i <= longitud ; i++) {
            System.out.println(anyo + ": " + i + " años" );
            anyo++;
        }
    }
}
