package org.example.TEMA3.matrices;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RellenarMatrizConSplit {
    static void main() {
        Scanner read = new Scanner(System.in);

        String nombres[][] = new String[2][3];

        externo:
        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Introduce nombres de la clase " + (i+1) + ": ");
            String fila[] = read.next().split(";");

            if (fila.length == nombres[i].length) {
                for (int j = 0; j < nombres[i].length; j++) {
                    nombres[i][j] = fila[j];
                }
            } else {
                System.out.println("El tamaño no es el adecuado");
                i--;
                continue externo;
            }

        }

        for (String fila[] : nombres) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
