package org.example.TEMA7.Colecciones;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2Pila {
    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {
        Stack<Integer> listaNums = new Stack<>();
        System.out.print("Introduce el primer número: ");
        listaNums.push(read.nextInt());

        System.out.print("Introduce el segundo número: ");
        listaNums.push(read.nextInt());

        System.out.print("Introduce el tercer número: ");
        listaNums.push(read.nextInt());

        System.out.println("Números en orden inverso:");
        while (!listaNums.isEmpty()) {
            System.out.println(listaNums.pop());
        }
    }

}
