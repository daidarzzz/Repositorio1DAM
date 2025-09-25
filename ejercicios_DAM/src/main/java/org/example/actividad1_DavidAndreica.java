package org.example;

import java.util.Scanner;

public class actividad1_DavidAndreica {
    static void main() {
        Scanner read = new Scanner(System.in); //crear el objeto Scanner

        System.out.println("Introduce tu nombre: ");
        String nombre = read.nextLine(); //nextline es para un texto con espacios

        System.out.println("Introduce tu curso: ");
        String curso = read.next(); //next es para texto sin espacios

        System.out.println("Hola "+ nombre + ", bienvenid@ al curso " + curso);

        System.out.println("Introduce el primer número: ");
        int a = read.nextInt(); //para introducir un entero
        System.out.println("Introduce el segundo número: ");
        int b = read.nextInt();

        //opción 1
        System.out.println("El resultado es " + (a+b)); //si hacemos el cálculo aquí, siempre es entre ()

        //opción 2
        int resultado = a + b;
        System.out.println("El resultado es " + resultado);

    }
}
