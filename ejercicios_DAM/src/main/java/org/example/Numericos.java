// Programa Java para ilustrar
// operadores aritméticos
package org.example;

public class Numericos {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        String x = "Thank", y = "You";
        // Operador + y -
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        // El operador + si se usa con strings
        // concatena las cadenas dadas.
        System.out.println("x + y = " + x + y);
        // Operador * y /
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        // operador de módulo da el resto
        // de dividir el primer operando con el segundo
        System.out.println("a % b = " + (a % b));
        // si el denominador es 0 en la división
        // System.out.println(a/c);
        // lanzaría una java.lang.ArithmeticException
    }
}
