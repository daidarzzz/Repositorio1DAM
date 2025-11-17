package org.example.TEMA3.pruebas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GestorLigaFutbol {
    static void main() {
        Scanner read = new Scanner(System.in);
        String jugadores[] = {"Messi", "Lamine", "Mbappe", "Haaland", "Vinicius"};
        int goles[] = {0, 0, 0, 0, 0};
        System.out.println("=== BIENVENIDO A LOS GOLEADORES DE LA LIGA ===");
        System.out.println("1. Ver Jugadores");
        System.out.println("2. Añadir goles a un jugador");
        System.out.println("3. Ver máximo goleador");
        System.out.println("4. Estadísticas generales");
        System.out.println("5. Salir");
        int opcion = 0;
        do {
            System.out.println();
            System.out.print("> ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0 ; i < jugadores.length ; i++) {
                        System.out.println(jugadores[i] + " → " + goles[i]);
                    }
                    break;
                case 2:
                    System.out.print("Selecciona jugador (1-5): ");
                    int seleccion = read.nextInt() -1;
                    System.out.print("Goles a añadir: ");
                    int goles_añadir = read.nextInt();
                    goles[seleccion] += goles_añadir;
                    System.out.println(jugadores[seleccion] + " ahora tiene " + goles[seleccion] + " goles");
                    break;
                case 3:
                    int maximo = 0;
                    int posicion_maximo = 0;
                    for (int i = 0 ; i < goles.length ; i++) {
                        if (goles[i] > maximo) {
                            maximo = goles[i];
                            posicion_maximo = i;
                        }
                    }
                    System.out.println("Máximo goleador: " + jugadores[posicion_maximo] + " (" + maximo + " goles)");
                    break;
                case 4:
                    int total = 0;
                    int media = 0;
                    boolean hay = false;
                    for (int i = 0 ; i < goles.length ; i++){
                        total += goles[i];
                        if (goles[i] > 10) {
                            hay = true;
                        }
                    }
                    media = total / 5;
                    System.out.println("Total de goles: " + total);
                    System.out.println("Media: " + media);
                    System.out.println("Con más de 10 goles:");
                    if (hay) {
                        for (int i = 0 ; i < goles.length ; i++) {
                            if (goles[i] > 10) {
                                System.out.println("- " + jugadores[i]);
                            }
                        }
                    } else System.out.println("- Aún no hay jugadores con más de 10 goles");
                    break;
                case 5:
                    System.out.println("Hasta la próxima!!!");
                    break;
            }
        } while (opcion != 5);

    }
}
