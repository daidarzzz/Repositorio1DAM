package org.example.TEMA4;

import java.util.Scanner;

public class Modo2 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int x = read.nextInt();
        int y = read.nextInt();
        read.nextLine();

        if (x < 0 || y < 0)
        return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            System.out.println((x+y)*2);
            return true;
        }
    } // casoDePrueba


}
