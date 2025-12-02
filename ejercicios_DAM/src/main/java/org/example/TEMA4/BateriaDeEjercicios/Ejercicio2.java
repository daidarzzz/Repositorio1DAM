package org.example.TEMA4.BateriaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        imprimirMenu();

        System.out.print("Introduce tu opción: ");
        char opcion = read.next().charAt(0);

        if (validarOpcion(opcion)) System.out.println("Válida");
        else System.out.println("No es válida");

    }

    public static void imprimirMenu() {

        System.out.println("Bienvenido!");

        System.out.println("1. Cantar");
        System.out.println("2. Bailar");
        System.out.println("3. Hacer un backflip");
        System.out.println("X. Salir");

    }

    public static boolean validarOpcion(char opcion) {

        switch (opcion) {
            case '1':
            case '2':
            case '3':
            case 'X':
                return true;
            default:
                return false;
        }

    }





}
