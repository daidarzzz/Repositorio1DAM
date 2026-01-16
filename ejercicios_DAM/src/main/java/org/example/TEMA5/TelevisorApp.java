package org.example.TEMA5;

import java.util.Scanner;

public class TelevisorApp {
    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Televisor renfe = new Televisor();
        System.out.println("BIENVENIDO AL TELEVISOR MÁS GUAY DEL PLANETA!!!");
        do {
            System.out.println("1. Subir volumen");
            System.out.println("2. Bajar volumen");
            int opcion = read.nextInt();

            if (opcion == 1) {
                renfe.subirCanal();
            }
            if (opcion == 2) {
                renfe.bajarCanal();
            }
        } while (true);


    }
}
