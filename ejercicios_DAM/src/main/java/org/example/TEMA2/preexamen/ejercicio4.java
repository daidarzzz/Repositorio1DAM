package org.example.TEMA2.preexamen;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce una nota numérica: ");
        int nota = read.nextInt();

        switch (nota) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("no válido");
                break;
        }
    }
}
