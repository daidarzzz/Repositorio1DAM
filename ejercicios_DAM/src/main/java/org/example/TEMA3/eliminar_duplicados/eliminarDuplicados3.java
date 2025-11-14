package org.example.TEMA3.eliminar_duplicados;

import java.util.Arrays;
import java.util.Random;

public class eliminarDuplicados3 {
    static void main() {
        Random aleatorio = new Random();

        int[] numeros = new int[10];

        for (int i = 0 ; i < numeros.length ; i++) {
            numeros[i] = aleatorio.nextInt(10) + 1; //Del 1 al 10

        }
        System.out.println(Arrays.toString(numeros));

        boolean comprobar = true;

        while(comprobar) {
            comprobar = false;
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));

            for (int i = 0; i < numeros.length ; i++) {

                if (i != numeros.length -1 && numeros[i]==numeros[i+1]) {
                    System.out.println("Duplicado: " + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(1, 11);
                    comprobar = true;
                }
                Arrays.sort(numeros);

            }

        }
        System.out.println("ARRAY FINAL: " + Arrays.toString(numeros));


    }
}
