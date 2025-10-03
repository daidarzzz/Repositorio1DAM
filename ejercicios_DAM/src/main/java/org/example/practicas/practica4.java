package org.example.practicas;

import java.util.Scanner;

public class practica4 {
    static void main() {
        Scanner read = new Scanner(System.in); //Añadimos el escáner "read"
        //Inicializar variables enteras
        int mul1 = 0; //multiplicando
        int mul2 = 0; //multiplicador
        int num4 = 0; //primera cifra (izq) del multiplicador
        int num5 = 0; //segunda cifra del multiplicador
        int num6 = 0; //tercera cifra del multiplicador
        int resultado = 0; //resultado de la multiplicación
        int tam_mul1 = 0; //Longitud de dígitos de mul1
        int tam_mul2 = 0; //Longitud de dígitos de mul2

        //Inicializar variables booleanas
        boolean bucle = true; //Booleano para saber cuando se acaba en búcle de el do while
        boolean negativo1 = false; //Esto será para poder saber cuando el multiplicando es negativo o positivo (false = num positivo)
        boolean negativo2 = false; //Esto será para poder saber cuando el multiplicador es negativo o positivo (false = num positivo)


        //Inicializar variables String
        String mul1String = ""; //Esto convierte mul1 a string
        String mul2String = ""; //Esto convierte mul2 a string


        //Bucle do while, no parará hasta que pongas correctamente las cifras de los números (3 cifras positivo, 4 cifras negativo).
        do {
            //pedir multiplicando y multiplicador
            try { //Intenta pedir dos números enteros
                System.out.printf("Introduce el multiplicando (3 cifras): ");
                mul1 = read.nextInt();

                System.out.printf("Introduce el multiplicador (3 cifras): ");
                mul2 = read.nextInt();
            } catch (Exception e) { //Si no se introducen números enteros, mostrará el siguiente error
                System.out.println("ERROR, FORMATO INCORRECTO."); //Error
                return;
            }

            System.out.println("");
            //Coger los números por separado de cada uno y convertirlos a String

            mul1String = Integer.toString(mul1); //pasar mul1 a string
            mul2String = Integer.toString(mul2); //pasar mul2 a string
            tam_mul1 = mul1String.length(); //recoger el tamaño de mul1string
            tam_mul2 = mul2String.length(); //recoger el tamaño de mul1string

            if (mul1 < 0) {
                negativo1 = true;
            }
            if (mul2 < 0) {
                negativo2 = true;
                String mul2num1S = mul2String.substring(1,2);
                num4 = Integer.parseInt(mul2num1S);
                String mul2num2S = mul2String.substring(2,3);
                num5 = Integer.parseInt(mul2num2S);
                String mul2num3S = mul2String.substring(3,4);
                num6 = Integer.parseInt(mul2num3S);
            }
            if (tam_mul1 != 3 && !negativo1 || tam_mul2 != 3 && !negativo2 || tam_mul1 != 4 && negativo1 || tam_mul2 != 4 && negativo2 )
            {
                System.out.println("ERROR, NÚMERO DE CIFRAS INCORRECTO.");
            }
            else {
                bucle = false;
                if (!negativo2) {
                String mul2num1S = mul2String.substring(0,1);
                num4 = Integer.parseInt(mul2num1S);
                String mul2num2S = mul2String.substring(1,2);
                num5 = Integer.parseInt(mul2num2S);
                String mul2num3S = mul2String.substring(2,3);
                num6 = Integer.parseInt(mul2num3S);
                }

            }
        } while (bucle);

        int op1 = (num6 * mul1);
        int op2 = (num5 * mul1);
        int op3 = (num4 * mul1);
        resultado = mul1 * mul2;
        System.out.println("El producto de la multiplicación es: ");
        System.out.println("El proceso es: ");
        System.out.println("   "+ mul1);
        System.out.println("x  " + mul2);
        System.out.println("--------");
        System.out.println("   " + op1);
        System.out.println(" " + op2 + "x");
        System.out.println(" " + op3 + "xx");
        System.out.println("--------");
        System.out.println(" " + resultado);
    }
}
