package org.example.TEMA2.PRACTICAS;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int resultado = 0;
        String isbn = "";
        int contador = 10;
        System.out.println("*** VALIDADOR DE ISBN ***");
        System.out.println("[1] - Validar ISBN");
        System.out.println("[2] - Reparar ISBN");
        System.out.println("[x] - SALIR");
        System.out.print("Selecciona una opción: ");
        String opcion = read.next().toLowerCase();
        if (opcion.equals("1") || opcion.equals("2")) {
            System.out.print("Introduce el ISBN:");
            isbn = read.next();
            int longitud_isbn = isbn.length();
            if (longitud_isbn != 10) {
                System.out.println("El ISBN no cuenta con 10 dígitos.");
                return;
            }
        }
        switch (opcion) {
            case "1":
                for (int i = 0 ; i < 10; i++) {
                    char character = isbn.toLowerCase().charAt(i);
                    if (i == 9 && character == 'x') {
                        resultado = resultado + contador * 10;
                    } else {
                        try {
                            resultado = resultado + contador * Integer.parseInt(String.valueOf(character));
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR AL CALCULAR EL ISBN. " + e.getMessage());
                            return;
                        }
                    }
                    contador--;
                }
                if (resultado % 11 == 0) {
                    System.out.println("El ISBN es válido");
                } else {
                    System.out.println("El ISBN es inválido");
                }
                break;
            case "2":
                for ()
            case "x":
                System.out.println("¡HASTA LUEGO!");
                break;
            default:
                System.out.println("Opción no contemplada.");
        }
    }
}
