package org.example.TEMA2;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class actividad1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int modo = 0;
        boolean seguir = true;
        int anyo_nacimiento_int = 0;
        final int ANYO_MINIMO = 1900;
        int edad = 0;
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();


        System.out.println("-------------------------------");
        System.out.println(     "Elige un modo...");
        System.out.println("    [1] - Año de nacimiento");
        System.out.println("    [2] - Edad");
        System.out.println("-------------------------------");

        if (read.hasNextInt()) {
            modo = read.nextInt();
        } else {
            System.out.println("Valor del modo incorrecto.");
            seguir = false;
            //return;
        }
        if (seguir) {

            switch (modo) {
                case 1:
                    System.out.println("Introduce tu año de nacimiento: ");
                    String anyo_nacimiento = read.next();

                    try {
                        anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                    } catch (NumberFormatException e) {
                        System.out.println("El formato no es numérico.");
                        return;
                    }
                    if (anyo_nacimiento_int < ANYO_MINIMO) {
                        System.out.println("La edad es menor a la edad mínima");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("Introduce tu edad:");
                    if (read.hasNextInt()) {

                        edad = read.nextInt();
                    } else {
                        System.out.println("La edad no tiene formato correcto (numérico).");
                        return;
                    }

                    if (edad >= 0) {
                        anyo_nacimiento_int  = anyo_actual - edad;

                    } else {
                        System.out.println("La edad no es correcta");
                    }
                    break;
                default:
                    System.out.println("El modo introducido no es correcto.");
                    break;
            }

        }


        if (anyo_nacimiento_int >= ANYO_MINIMO &&  anyo_nacimiento_int <= anyo_actual) {

            if (anyo_nacimiento_int <= 1927) {
                System.out.println("Generación sin bautizar.");
            } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944) {
                System.out.println("Generación Silent");
            } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                System.out.println("Baby Boomer");
            } else if( anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                System.out.println("Generación X");
            } else if(anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994 ) {
                System.out.println("Generación Milenials");
            } else {
                System.out.println("Generazión Z the best.");
            }

        }



    }
}
