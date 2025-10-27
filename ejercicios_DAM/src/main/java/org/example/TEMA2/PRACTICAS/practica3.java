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
        int contador_duda = 0;
        int posicion_duda = 0;
        int valor_duda = 0;
        boolean duda_encontrado = false;
        int multiplicacion = 0;
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
        for (int i = 0 ; i < 10; i++) {
            char character = isbn.toLowerCase().charAt(i);
            if (i == 9 && character == 'x') {
                resultado = resultado + contador * 10;
            } else if ( character == '?' ) {
                if (!opcion.equals("2")) {
                    System.out.println("No pueden haber un valor desconocido en una validación.");
                    return;
                }
                contador_duda++;
                posicion_duda = i;
                multiplicacion = 10 - i;
            }
            else {
                try {
                    resultado = resultado + contador * Integer.parseInt(String.valueOf(character));
                } catch (NumberFormatException e) {
                    System.out.println("ERROR AL CALCULAR EL ISBN: " + e.getMessage());
                    return;
                }
            }
            contador--;
        }

        switch (opcion) {
            case "1":
                if (resultado % 11 == 0) {
                    System.out.println("El ISBN es válido");
                } else {
                    System.out.println("El ISBN es inválido");
                }
                break;
            case "2":

                if (contador_duda != 1) {
                    System.out.println("No puede haber menos/más de un número desconocido.");
                    return;
                }

                for (valor_duda = 0 ; valor_duda <= 10 ; valor_duda++) {
                    int prueba = valor_duda * multiplicacion + resultado;
                    if (prueba % 11 == 0) {
                        duda_encontrado = true;
                        break;
                    }
                }

                if (duda_encontrado) {
                    if (posicion_duda == 9 && valor_duda == 10) {
                        System.out.println("El número para reparar el ISBN es X (10)");
                        System.out.println("ISBN reparado: " + isbn.replace("?", "X"));
                    } else {
                        System.out.println("El número para reparar el ISBN es " + valor_duda);
                        System.out.println("ISBN reparado: " + isbn.replace("?", Integer.toString(valor_duda)));
                    }

                } else {
                    System.out.println("No se encontró un número para validar el ISBN.");
                }
                break;
                
            case "x":
                System.out.println("¡HASTA LUEGO!");
                break;
            default:
                System.out.println("Opción no contemplada.");
        }
    }
}
