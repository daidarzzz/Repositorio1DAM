package org.example.TEMA2.pruebaExamen;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class adivinar_numero {
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);
        int numero = -1;
        int numero_aleatorio = aleatorio.nextInt(0,101);
        System.out.println("Acabo de pensar un número [0-100]... ¿puedes adivinarlo? ¡Tienes 10 intentos!");
        for (int i = 1 ; i <= 10 ; i++) {
            try {
                System.out.print("Intento " + i + ". Introduce un número: ");
                numero = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error, debes introducir un número entero.");
                return;
            }
            if (numero > numero_aleatorio) {
                System.out.println("Tu número es mayor al que he pensado.");
            } else if (numero < numero_aleatorio) {
                System.out.println("Tu número es menor al que he pensado.");
            } else {
                System.out.println("¡HAS ACERTADO! El número era " + numero_aleatorio);
                return;
            }
        }
        System.out.println("Te has quedado sin intentos :(");

    }
}
