package org.example.TEMA2.PRACTICAS;

import java.util.Scanner;

public class switchPRUEBA {
    static void main() {
        Scanner read = new Scanner(System.in);

        int numero = 1;
        char caracter = 'x';
        String palabra = "Patricia";

        switch (palabra) {

            case "Raul":
                System.out.println("El alumno es Raúl");
                break;
            case "Patricia":
                System.out.println("La profe es Patricia");
                break;
            default:
                System.out.println("No sé el nombre");
                break;

        }
        switch (numero) {

            case 1:
                System.out.println("El alumno es Raúl");
                break;
            case 2:
                System.out.println("La profe es Patricia");
                break;
            default:
                System.out.println("No sé el nombre");
                break;

        }
        switch (caracter) {

            case 'x':
                System.out.println("El alumno es Raúl");
                break;
            case 'A':
                System.out.println("La profe es Patricia");
                break;
            default:
                System.out.println("No sé el nombre");
                break;

        }
    }
}
