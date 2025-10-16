package org.example.TEMA2.PRACTICAS;

import java.util.Scanner;

public class practica1 {
    static void main() {
        Scanner read = new Scanner(System.in); //Escáner para poder leer lo que introduce el usuario en consola
        int dia_int = 0; //Declaramos el día como número entero
        int mes_int = 0; //Declaramos el mes como número entero
        int anyo_int = 0; //Declaramos el año como número entero

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): "); //Pregunta al usuario por su fecha de nacimiento
        String fecha = read.nextLine(); //Lee la fecha que introduce el usuario por consola

        // Probamos que la conversión a entero del día, mes y año funcione correctamente
        try {
            dia_int = Integer.parseInt(fecha.substring(0,2));
            mes_int = Integer.parseInt(fecha.substring(3,5));
            anyo_int = Integer.parseInt(fecha.substring(6,10));
        } catch (Exception e) { //En caso de que haya un error al pasar la fecha a entero, se cazará el error
            System.out.println("ERROR AL CALCULAR LOS NÚMEROS DE LA FECHA."); //Muestra un mensaje de error al usuario
            return; //Acaba el programa
        }

        char barra1 = fecha.charAt(2); //Cogemos de la fecha la primera "/" como carácter
        char barra2 = fecha.charAt(5); //Cogemos de la fecha la segunda "/" como carácter


        if (barra1 != '/' || barra2 != '/') { //Si barra1 o barra2 no es "/" . . .
            System.out.println("ERROR CON EL FORMATO (dd/mm/aaaa)"); //Muestra un mensaje de error por introducir un formato incorrecto
        } else { //De lo contraro
            if (dia_int < 1 || dia_int > 30 || mes_int < 1 || mes_int > 12 || anyo_int < 1900 || anyo_int > 2025) { //Si introduces un día, mes o año no contemplado . . .
                System.out.println("ERROR, HAS INTRODUCIDO UNA FECHA INCORRECTA."); //Te mostrará un mensaje de error de fecha incorrecta
            } else { //De lo contrario
                int total = dia_int + mes_int + anyo_int; //Declaramos total, que es la suma de dia, mes y año

                String total_string = Integer.toString(total); //Convertimos total a un string

                int num1 = Integer.parseInt(total_string.substring(0,1)); //recogemos el primer número del total y lo metemos dentro de num1
                int num2 = Integer.parseInt(total_string.substring(1,2)); //recogemos el segundo número del total y lo metemos dentro de num2
                int num3 = Integer.parseInt(total_string.substring(2,3)); //recogemos el tercer número del total y lo metemos dentro de num3
                int num4 = Integer.parseInt(total_string.substring(3,4)); //recogemos el cuarto número del total y lo metemos dentro de num4
                int total_nums = num1+num2+num3+num4; //Declaramos total_nums, que es la suma de cada número (num1, 2, 3 y 4)
                System.out.println(dia_int + "+" + mes_int + "+" + anyo_int + " = " + total); //Mostramos la suma de día, mes y año)

                System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + total_nums); //Mostramos la suma de num1, 2, 3 y 4

                System.out.println("NÚMERO DE LA SUERTE: " + total_nums); //Mostramos el número de la suerte :D
            }
        }
    }
}
