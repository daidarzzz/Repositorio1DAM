package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Random;

public class matricestwo {
    static void main() {
        Random aleatorio = new Random();
        int matriz[][] = new int[aleatorio.nextInt(2,8)][aleatorio.nextInt(2,8)];

        for (int i = 0 ; i < matriz.length ; i++) {

            for (int j = 0 ; j < matriz[i].length ; j++) {

                matriz[i][j] = aleatorio.nextInt(1, 1_000_001);

            }

        }

        for (int fila[] : matriz) {

            System.out.println(Arrays.toString(fila));

        }
    }
}
