package org.example.TEMA3.pruebas;

import java.util.Arrays;
import java.util.Random;

public class eliminar_duplicados {
    static void main(String[] args) {
        Random aleatorio = new Random();

        int[] array = new int[50];
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = aleatorio.nextInt(0,100);
        }
        System.out.println(Arrays.toString(array));

        int aux;
        boolean fin = false;
        int tam = 1;
        do {
            fin = true;
            for (int i = 0 ; i < array.length -1; i++) {
                if (array[i] > array[i+1]){
                    aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    fin = false;
                }
            }
        } while (!fin);


        System.out.println(Arrays.toString(array));

        //BUBBLE SORT PROPIO
        for (int i = 0 ; i < array.length -1; i++) {
            if (array[i] == array[i+1]) {
                array[i] = -1000;
            } else {
                tam++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] array_sin_duplicados = new int[tam];
        int j = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] != -1000) {
                array_sin_duplicados[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array_sin_duplicados));
    }
}
