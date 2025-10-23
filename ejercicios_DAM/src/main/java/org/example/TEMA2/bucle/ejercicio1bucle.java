package org.example.TEMA2.bucle;

import java.util.Scanner;

public class ejercicio1bucle {
    static void main() {
        Scanner read = new Scanner(System.in); //Escáner para poder leer lo que introduce el usuario en consola
        String buena = "admin1234";
        do {
            System.out.println("Introduce tu contraseña: ");
            String contrasenya = read.next();
            if(contrasenya.equals(buena)) {
                break;
            }
        } while (true);
        System.out.println("ENTRADA CORRECTA");
    }
}
