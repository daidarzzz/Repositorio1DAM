package org.example.TEMA7.Colecciones.List.Pilas;

import java.util.Stack;

public class Ejercicio3Pila {

    static void main(String[] args) {

        String correcta = "((2+3)*(5-1))";
        String incorrecta = "(2+3))+(5-1)(";
        System.out.println(esBalanceado(correcta));
        System.out.println(esBalanceado(incorrecta));
    }

    public static boolean esBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            if (caracter == '(') pila.push('(');
            else if (caracter == ')') {
                if (pila.contains('(')) pila.pop();
                else return false;
            }
        }

        if (pila.isEmpty()) return true;
        else return false;
    }
}
