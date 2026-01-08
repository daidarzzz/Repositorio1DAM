package org.example.TEMA4.recursividad;

import java.util.Scanner;

public class Bateria {
    public static Scanner read = new Scanner(System.in);
    static void main(String[] args) {
        menu();
    }


    public static void menu(){
        System.out.println("**BATERIA DE EJERCICIOS DE RECURSIVIDAD**");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("\t 1 - Dígitos");
        System.out.println("\t 2 - Potencias");
        System.out.println("\t 3 - Del Revés");
        System.out.println("\t 4 - Binario");
        System.out.println("\t 5 - A binario");
        System.out.println("\t 6 - Orden alfabético");
        System.out.println("\t 7 - Mostrar suma");
        System.out.print("> ");
        int opcion = read.nextInt();
        switchCases(opcion);
    }

    public static void switchCases(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Elige el número: ");
                int num = read.nextInt();
                System.out.println(digitos(num));
                break;
            case 2:
                System.out.println("Introduce la base y exponente: ");
                int base = read.nextInt();
                int exponente = read.nextInt();
                System.out.println(potencias(base, exponente));

                break;
            case 3:

                System.out.println(delReves(5678));
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }


    }


    public static int digitos(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1+digitos(n/10);
        }
    }

    public static int potencias(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {
            return base * potencias(base, exponente-1);
        }

    }

    public static int delReves(int num) {
        if (num < 10) {
            return 1;
        }
        else {
            return delReves(num/10) % 10;
        }
    }

}
