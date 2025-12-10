package org.example.TEMA4.BateriaDeEjercicios;

import org.example.TEMA4.Prefabs;

import java.util.Scanner;

public class Ejercicio1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int resultado = cubo();

        System.out.println(resultado);
    }

    public static int cubo () {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número...");

        int numero = read.nextInt();

        return numero*numero*numero;

    }


    public static boolean par(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else return false;
    }

}
