package org.example.TEMA5;

import java.util.Scanner;

public class TelevisorApp {
    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Televisor renfe = new Televisor(5, 90);
        Televisor samsung = new Televisor();

        System.out.println("BIENVENIDO AL TELEVISOR MÁS GUAY DEL PLANETA!!!");
        System.out.println("Tele por defecto:");
        System.out.println(samsung.getCanal());
        System.out.println(samsung.getVolumen());
        do {
            System.out.println("1. Subir canal");
            System.out.println("2. Bajar canal");
            System.out.println("3. Subir volumen");
            System.out.println("4. Bajar volumen");
            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    renfe.subirCanal();
                    break;
                case 2:
                    renfe.bajarCanal();
                    break;
                case 3:
                    renfe.subirVolumen();
                    break;
                case 4:
                    renfe.bajarVolumen();
                    break;
                default:
                    System.out.println("elige una opcion bien pls ");
                    break;
            }
        } while (true);


    }
}
