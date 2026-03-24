package org.example.TEMA7.EJEMPLOSLISTAS;

import java.util.Stack;

public class sTACKeJ {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("Plato sucio 1"); // Meter
        pila.push("Plato sucio 2");

        String arriba = pila.peek(); // Mira el 2 sin quitarlo
        String quitado = pila.pop(); // Quita el 2 (el de arriba)
    }

}
