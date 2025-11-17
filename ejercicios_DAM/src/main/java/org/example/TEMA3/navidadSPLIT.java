package org.example.TEMA3;

import java.util.Scanner;

public class navidadSPLIT {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir...");
        String palabra = read.next();
        read.nextLine();
        String[] letras_vector = palabra.split("");

        System.out.println("Inserta la cantidad de letras a imprimir...");
        String cantidad = read.nextLine();
        String[] cantidad_vector = cantidad.split(" ");

        if (letras_vector.length != cantidad_vector.length) {
            System.out.println("La palabra y las cifras introducidas no coinciden.");
        } else {

            for (int i = 0 ; i < letras_vector.length ; i++) {

                for (int j = 0 ; j < Integer.parseInt(cantidad_vector[i]) ; j++) {
                    System.out.print(letras_vector[i]);
                }

            }

        }



    }
}
