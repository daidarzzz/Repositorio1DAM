package org.example.TEMA2.PRACTICAS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practica2 {
    static void main() {
        Scanner read = new Scanner(System.in); //Escáner para poder leer lo que introduce el usuario en consola
        double operando1 = 0;
        double operando2 = 0;
        String operacion = "";
        double resultado = 0;

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
        System.out.println("> Introduce un operando: ");
        try {
            operando1 = read.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El formato introducido no es numérico.");
            return;
        }

        System.out.println("---------------------------");
        System.out.println("[+] -> Sumar");
        System.out.println("[-] -> Restar");
        System.out.println("[x] -> Multiplicar");
        System.out.println("[/] -> Dividir");
        System.out.println("[R] -> Raíz cuadrada");
        System.out.println("---------------------------");
        System.out.println("Elige una operación: ");

        operacion = read.next().substring(0);
        operacion = operacion.toLowerCase();

        if (operacion.equals("+")|| operacion.equals("-") || operacion.equals("x") || operacion.equals("/")) {
            System.out.println("Introduce el segundo operando:");
            try {
                operando2 = read.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("El formato introducido no es numérico.");
                return;
            }
        }

        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "x":
                resultado = operando1 * operando2;
                break;
            case "/":
                try {
                    resultado = operando1 / operando2;
                } catch (ArithmeticException e) {
                    System.out.println("No se puede dividir entre 0.");
                    return;
                }
                break;
            case "r":
                if (operando1 < 0) {
                    System.out.println("Error, el número no debe ser negativo.");
                    return;
                } else {
                    resultado = Math.sqrt(operando1);
                    break;
                }
            default:
                System.out.println("No conozco esa operación :(");
                return;
        }
        System.out.println("El resultado es " + resultado);
    }
}
