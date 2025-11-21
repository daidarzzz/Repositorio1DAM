package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceInvaders {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce número de filas: ");
        int filas = read.nextInt();

        read.nextLine();


        String mensaje[][] = new String[filas][3];

        externo:
        for (int i = 0; i < mensaje.length; i++) {

            String fila[] = read.next().split("");

            if (fila.length == mensaje[i].length) {
                for (int j = 0; j < mensaje[i].length; j++) {
                    mensaje[i][j] = fila[j];
                }
            } else {
                System.out.println("Longitud incorrecta (3)");
                i--;
                continue externo;
            }

        }

        for (String fila[] : mensaje) {
            System.out.println(Arrays.toString(fila));
        }

        for (int i = 0; i < mensaje[0].length; i++) {
            for (int j = 0; j < mensaje.length; j++) {
                System.out.print(mensaje[j][i] + " ");
            }
        }

    }
}
