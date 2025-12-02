package org.example.EJEMPLOS;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //ENTORNOS DE DESARROLLO
        //LA FIESTA ABURRIDA, REALIZADA POR DAVID ANDREICA

        int cantidad = 0;
        boolean seguir = true;
        externo:
        do {
            System.out.print("¿Cuántas personas no conoce Tinín?: ");
            try {
                cantidad = read.nextInt();
                read.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debes de introducir un número entero válido.");
                read.nextLine();
                continue externo;
            }
            seguir = false;
        } while (seguir);


        String[][] quien_es = new String[cantidad][2];

        for (int i = 0; i < quien_es.length; i++) {

            String[] nombre = read.nextLine().split(" ");
            for (int j = 0; j < quien_es[0].length; j++) {
                quien_es[i][j] = nombre[j];
            }

        }

        for (String fila[] : quien_es) {

            for (String saludo : fila) {
                System.out.print(saludo.replace("Soy" , "Hola, "));
            }

            System.out.println();

        }

    }
}
