package org.example.TEMA2.PRACTICAS;

public class PRACTICATERNARIA {
    static void main() {
       int a = 5;
       int b = 8;
       int c = 10;

       int resultado = a++ == 6 && b-- == 8 ? c + a++ == 10 ? c-- : a++ : a + c++;
        System.out.println(resultado);

    a = 1 ? "si" : "no";

    }
}
