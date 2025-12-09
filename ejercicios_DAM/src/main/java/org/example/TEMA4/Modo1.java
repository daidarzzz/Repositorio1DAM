package org.example.TEMA4;

import java.util.Scanner;

public class Modo1 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = read.nextInt();

        read.nextLine();

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

    public static void casoDePrueba() {

        // TU CÓDIGO AQUÍ

        String[] nombre = read.nextLine().split(" ");
        System.out.println("Hola, " + nombre[1] + ".");

    } // casoDePrueba


}
