package org.example.TEMA2.PRACTICAS;

import java.util.Scanner;

public class practica1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int dia_int = 0;
        int mes_int = 0;
        int anyo_int = 0;

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = read.nextLine();

        try {
            dia_int = Integer.parseInt(fecha.substring(0,2));
            mes_int = Integer.parseInt(fecha.substring(3,5));
            anyo_int = Integer.parseInt(fecha.substring(6,10));
        } catch (Exception e) {
            System.out.println("ERROR AL CALCULAR LOS NÚMEROS DE LA FECHA.");
            return;
        }

        char barra1 = fecha.charAt(2);
        char barra2 = fecha.charAt(5);

        if (barra1 != '/' || barra2 != '/') {
            System.out.println("ERROR CON EL FORMATO (dd/mm/aaaa)");
        } else {
            if (dia_int < 0 || dia_int > 30 || mes_int < 1 || mes_int > 12 || anyo_int < 1900 || anyo_int > 2025) {
                System.out.println("ERROR, HAS INTRODUCIDO UNA FECHA INCORRECTA.");
            } else {
                int total = dia_int + mes_int + anyo_int;

                String total_string = Integer.toString(total);

                int num1 = Integer.parseInt(total_string.substring(0,1));
                int num2 = Integer.parseInt(total_string.substring(1,2));
                int num3 = Integer.parseInt(total_string.substring(2,3));
                int num4 = Integer.parseInt(total_string.substring(3,4));
                int total_nums = num1+num2+num3+num4;
                System.out.println(dia_int + "+" + mes_int + "+" + anyo_int + " = " + total);

                System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + total_nums);

                System.out.println("NÚMERO DE LA SUERTE: " + total_nums);
            }

        }

    }
}
