package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = read.nextInt();

        System.out.println("¿Cúantas cifras del final quieres quitar?: ");
        int cifras = read.nextInt();

        String num_S = Integer.toString(num);
        int longitud = num_S.length();
        int nuevo_tamanyo = longitud - cifras;

        String resultado = num_S.substring(0, nuevo_tamanyo);
        System.out.println(resultado);
    }
}
