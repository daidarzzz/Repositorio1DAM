package org.example.TEMA3.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class reemplazar {
    static void main() {
        Scanner read = new Scanner(System.in);
        String[] array = {"1", "2", "3", "4", "5", "6"};

        System.out.println(Arrays.toString(array));
        System.out.print("Introduce las 2 posiciones que deseas intercambiar (separadas por un espacio): ");
        String[] posiciones = read.nextLine().split(" ");
        String aux1 = "";
        int pos1 = 0;
        String aux2 = "";
        int pos2 = 0;
        boolean finish = false;
        for (int i = 0 ; i < array.length ; i++) {

            if (array[i].equals(posiciones[0])) {
                aux1 = array[i];
                pos1 = i;
            }
            if (array[i].equals(posiciones[1])) {
                aux2 = array[i];
                pos2 = i;
                finish = true;
            }
            if (finish) {
                array[pos1] = aux2;
                array[pos2] = aux1;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
