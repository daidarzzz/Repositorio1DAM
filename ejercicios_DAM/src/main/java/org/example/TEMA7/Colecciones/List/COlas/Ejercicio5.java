package org.example.TEMA7.Colecciones.List.COlas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            Deque<Character> palindromos = new LinkedList<>();
            System.out.print("Introduce tu palíndromo: ");
            String palabra = read.next();
            for (int i = 0; i < palabra.length(); i++) {

                palindromos.offer(palabra.charAt(i));

            }
            boolean esPalindromo = true;
            while (!palindromos.isEmpty()) {
                if (palindromos.peekFirst() != palindromos.peekLast()) {
                    esPalindromo = false;
                    break;
                } else {
                    palindromos.pollFirst();
                    palindromos.pollLast();
                }
            }
            if (esPalindromo) System.out.println("La palabra es palíndromo");
            else System.out.println("No es palíndromo");

        }


    }

}
