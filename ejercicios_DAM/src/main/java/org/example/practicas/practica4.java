package org.example.practicas;

import java.util.Scanner;

public class practica4 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int mul1 = 0;
        int mul2 = 0;
        boolean bucle = true;

        String mul1String = "";
        String mul2String = "";
        int tam_mul1S = 0;
        int tam_mul2S = 0;
        do {
            //pedir multiplicando y multiplicador
            System.out.printf("Introduce el multiplicando (3 cifras): ");
            mul1 = read.nextInt();

            System.out.printf("Introduce el multiplicador (3 cifras): ");
            mul2 = read.nextInt();
            System.out.println("");

            //Coger los números por separado de cada uno y convertirlos a String

            mul1String = Integer.toString(mul1);
            mul2String = Integer.toString(mul2);
            tam_mul1S = mul1String.length();
            tam_mul2S = mul2String.length();
            if (tam_mul1S != 3 || tam_mul2S != 3) {
                System.out.println("ERROR, NÚMERO DE CIFRAS INCORRECTO.");
            }
            else {
                bucle = false;
            }
        } while (bucle);


        String mul1num1S = mul1String.substring(0,1);
        int num1 = Integer.parseInt(mul1num1S);
        String mul1num2S = mul1String.substring(1,2);
        int num2 = Integer.parseInt(mul1num2S);
        String mul1num3S = mul1String.substring(2,3);
        int num3 = Integer.parseInt(mul1num3S);
        String mul2num1S = mul2String.substring(0,1);
        int num4 = Integer.parseInt(mul2num1S);
        String mul2num2S = mul2String.substring(1,2);
        int num5 = Integer.parseInt(mul2num2S);
        String mul2num3S = mul2String.substring(2,3);
        int num6 = Integer.parseInt(mul2num3S);

        int op1 = (num6 * mul1);
        int op2 = (num5 * mul1);
        int op3 = (num4 * mul1);
        int resultado = mul1 * mul2;
        System.out.println("El producto de la multiplicación es: ");
        System.out.println("El proceso es: ");
        System.out.println("  "+ mul1);
        System.out.println("x " + mul2);
        System.out.println("--------");
        System.out.println(op1);
        System.out.println(op2 + "x");
        System.out.println(op3 + "xx");
        System.out.println("--------");
        System.out.println(resultado);




    }
}
