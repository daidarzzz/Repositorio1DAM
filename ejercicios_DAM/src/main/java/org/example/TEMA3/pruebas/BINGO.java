package org.example.TEMA3.pruebas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BINGO {
    static void main() {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean comprobar = true;

        System.out.println("*** BIENVENIDO AL BINGO DEL CASINO CANTÁBRICO *** ");
        int num_bolas = aleatorio.nextInt(10, 41);

        Integer[] sorteo = new Integer[num_bolas];

        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = aleatorio.nextInt(1, 91);
        }


        while(comprobar) {
            comprobar = false;
            Arrays.sort(sorteo);

            for (int i = 0; i < sorteo.length ; i++) {

                if (i != sorteo.length -1 && sorteo[i]==sorteo[i+1]) {
                    sorteo[i] = aleatorio.nextInt(1, 91);
                    comprobar = true;
                }
                Arrays.sort(sorteo);

            }


        }

        System.out.print(sorteo.length + " bolas extraídas hasta ahora: ");
        System.out.println(Arrays.toString(sorteo));

        Integer[][] carton = new Integer[3][3];
        boolean bingo = true;
        System.out.println("*** Introduce los datos de tu cartón ***");
        for (int i = 0; i < carton.length; i++) {
            System.out.println("Fila " + (i+1));
            String fila = read.next();
            if ( !fila.matches(("\\d{1,2}-\\d{1,2}-\\d{1,2}"))) {
                System.out.println("Cerrando el programa... Introduce valores con el formato correcto (N-N-N).");
                return;
            }
            String fila_pro[] = fila.split("-");
            for (int j = 0; j < carton[0].length; j++) {
                carton[i][j] = Integer.parseInt(fila_pro[j]);
                if (!Arrays.asList(sorteo).contains(carton[i][j])) bingo = false;
            }
        }

        for (Integer[] vector : carton)
        {
            for (int num : vector) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("PREMIOS: ");
        System.out.println();
        System.out.println((bingo ? "HAY BINGO!!!" : "NO HAY BINGO"));


        if (!bingo) {
            for (int i = 0; i < carton.length; i++) {
                boolean fila_correcta = true;
                System.out.print("Línea " + (i+1) +": ");
                for (int j = 0; j < carton[0].length; j++) {
                    if (!Arrays.asList(sorteo).contains(carton[i][j])) fila_correcta = false;
                }
                System.out.print((fila_correcta ? "CORRECTA!!!" : "NO"));
                System.out.println();
            }
        }



    }
}
