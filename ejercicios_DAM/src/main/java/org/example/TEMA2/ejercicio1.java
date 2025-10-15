package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = read.nextLine();
        int tam = texto.length();
        int tam_mitad1 = tam / 2;
        String mitad1 = texto.substring(0, tam_mitad1);
        String mitad2 = texto.substring(tam_mitad1, tam);
        String sin_espacios = texto.replace(" ", "");
        String mayusculas = texto.toUpperCase();
        System.out.println("Texto original: " + texto);
        System.out.println("Longitud del texto: " + tam);
        System.out.println("Sin espacios: " + sin_espacios);
        System.out.println("Primera mitad del texto es " + mitad1 + " y la segunda mitad del texto es " + mitad2);
        System.out.println("Texto en mayúsculas: " + mayusculas);

        String concatenado = mitad1.concat(mitad2);
        System.out.println(concatenado);
    }
}
