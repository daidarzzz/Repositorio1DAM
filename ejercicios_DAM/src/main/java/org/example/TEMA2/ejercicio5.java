package org.example.TEMA2;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner read = new Scanner(System.in);
        boolean esta;
        int intentos = 10;
        System.out.println("Introduce una cadena: ");
        String texto = read.nextLine();

        do {

            System.out.println("Introduce una palabra: ");
            String palabra = read.nextLine();

            esta = texto.contains(palabra);

            if (esta) {
                System.out.println("¡ENHORABUENA, HAS ACERTADO UNA PALABRA!");
            } else if (intentos == 0) {
                System.out.println("TE HAS QUEDADO SIN INTENTOS :( FIN DEL JUEGO");
            } else {
                intentos--;
                System.out.println("Fallaste. Intentos restantes: " + intentos);
            }

        } while (!esta || intentos == 0);

    }
}
