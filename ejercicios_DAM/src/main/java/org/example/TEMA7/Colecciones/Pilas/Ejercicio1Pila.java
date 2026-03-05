package org.example.TEMA7.Colecciones.Pilas;

import java.util.Stack;

public class Ejercicio1Pila {

    static void main(String[] args) {

        Stack<Character> letras = new Stack<>();
        System.out.println("La lista está vacía: " + letras.isEmpty());

        letras.push('d');
        letras.push('a');
        letras.push('v');
        letras.push('i');
        letras.push('d');

        System.out.println("La lista está vacía: " + letras.isEmpty());
        System.out.println("Elementos en la pila: " + letras.size());

        System.out.println("Último elemento de la pila: " + letras.peek());
        while (!letras.isEmpty()) {
            System.out.println(letras.pop());
        }
    }

}
