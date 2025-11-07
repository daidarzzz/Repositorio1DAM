package org.example.TEMA3.PRACTICA;
import java.util.Random;
import java.util.Scanner;

public class practica1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean inicio_correcto = false;
        boolean mayor_menor = false;
        final int POTENCIA_REQUERIDA = 30;
        System.out.println("*** BATALLA DE SAMURAIS ***");
        int[] vector_equipo1 = new int[7];
        int[] vector_equipo2 = new int[7];
        int[] vector_general = new int[7];
        int sumatorio = 0;
        int valor_equipo = 1;
        do {
            mayor_menor = false;
            sumatorio = 0;
            if (inicio_correcto) valor_equipo = 2;
            System.out.println("Equipo " + valor_equipo);
            System.out.print("Introduce la potencia de los samurais: ");
            String equipo_string = read.nextLine();
            String[] equipo = equipo_string.split(" ");
            vector_general = new int[equipo.length];
            for (int i = 0; i < equipo.length; i++) {
                vector_general[i] = Integer.parseInt(equipo[i]);
                if (vector_general[i] < 1 || vector_general[i] > 24) {
                    mayor_menor = true;
                }
                sumatorio += vector_general[i];
            }
            if (mayor_menor) System.out.println("El valor de potencia del samurai debe de estar entre 1 y 24.");
            else if (sumatorio != POTENCIA_REQUERIDA) System.out.println("La potencia total no suma 30.");
            else if (vector_general.length != 7) System.out.println("El equipo debe de tener 7 samurais");
            else if (!inicio_correcto) {
                vector_equipo1 = vector_general.clone();
                inicio_correcto = true;
            } else {
                vector_equipo2 = vector_general.clone();
                break;
            }
        } while (true);

        int quien_empieza = aleatorio.nextInt(7 + 1);
        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el samurai " + (quien_empieza+1));
        int contador_equipo1 = 0;
        int contador_equipo2 = 0;
        if (quien_empieza != 0) {
            for (int i = quien_empieza ; i < vector_general.length ; i++) {
                System.out.print("Samurai " + (i+1) + ". ");
                if (vector_equipo1[i] > vector_general[i]) {
                    System.out.println("Gana equipo 1. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                    contador_equipo1++;
                } else if (vector_equipo1[i] < vector_general[i]) {
                    System.out.println("Gana equipo 2. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                    contador_equipo2++;
                } else {
                    System.out.println("EMPATE. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                }
            }
        }
        for (int i = 0 ; i < quien_empieza ; i++) {
            System.out.print("Samurai " + (i+1) + ". ");
            if (vector_equipo1[i] > vector_general[i]) {
                System.out.println("Gana equipo 1. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                contador_equipo1++;
            } else if (vector_equipo1[i] < vector_general[i]) {
                System.out.println("Gana equipo 2. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                contador_equipo2++;
            } else {
                System.out.println("EMPATE. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
            }
        }

        if (contador_equipo1 > contador_equipo2) System.out.println("GANÓ EL EQUIPO 1. EQUIPO 2 HA TENIDO " + contador_equipo1 + " BAJAS.");
        else if (contador_equipo1 < contador_equipo2) System.out.println("GANÓ EL EQUIPO 2. EQUIPO 1 HA TENIDO " + contador_equipo2 + " BAJAS.");
        else System.out.println("EMPATE ENTRE LOS DOS EQUIPOS.");
    }
}
