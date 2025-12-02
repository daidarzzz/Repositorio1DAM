package org.example.TEMA4.BateriaDeEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = read.nextLine();
        String cadena_mayusculas = pasarMayusculas(cadena);
        System.out.println(cadena_mayusculas);

        System.out.println("Total vocales: " + contarVocales(cadena_mayusculas));

    }

    public static String pasarMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public static int contarVocales (String cadena) {
//        int contador = 0;
//        Character[] vocales = {'A', 'E', 'I', 'O', 'U'};
//
////        for (int i = 0; i < cadena.length(); i++) {
////           if (Arrays.asList(vocales).contains(cadena.charAt(i) )) contador++;
////        }
//
//        System.out.println(contador);

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < cadena.length(); j++) {
            switch (cadena.charAt(j)) {
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
            }
        }

        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

        return a+e+i+o+u;
    }

}
