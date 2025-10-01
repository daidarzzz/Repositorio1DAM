package org.example.practicas;

import java.util.Scanner;

public class practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);
        final int PESO_MAXIMO = 120;

        System.out.println("***¡BIENVENIDO AL RATÓN JUGUETÓN!***");

        System.out.println("Introduce tu altura (cm): ");
        int altura = read.nextInt();
        if (altura < 140) {
            int cm_restantes = 140 - altura;
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + cm_restantes + " cm de altura.");
        }

        System.out.println("Introduce tu peso (kg): ");
        double peso = read.nextDouble();

        double peso_minimo = (altura * 2.0 / 8) ;

        if (peso >= peso_minimo) {
            System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + peso_minimo + " kg.");
            System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
        }
        else {
            System.out.println("LO SIENTO. Pesas menos " + (peso_minimo - peso) + " kg menos del mínimo para esta atracción." );
        }

    }
}
