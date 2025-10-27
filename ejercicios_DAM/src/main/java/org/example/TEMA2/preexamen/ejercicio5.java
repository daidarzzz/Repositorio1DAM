package org.example.TEMA2.preexamen;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int mayor = 0;
        int contador_mil = 0;
        final int MIL = 1000;
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.print("Introduce el salario de trabajador " + i + ": ");
            int salario = read.nextInt();
            if (salario > mayor) {
                mayor = salario;
            }
            if (salario > MIL) {
                contador_mil++;
            }
        }
        System.out.println("El sueldo más alto es de " + mayor + "€");
        System.out.println(contador_mil + " trabajadores cobran más de 1000€");
    }
}
