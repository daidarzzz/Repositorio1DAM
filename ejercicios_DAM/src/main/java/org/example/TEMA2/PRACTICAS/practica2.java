package org.example.TEMA2.PRACTICAS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practica2 {
    static void main() {
        Scanner read = new Scanner(System.in); //Escáner para poder leer lo que introduce el usuario en consola
        //Declaro Los operadores y el resultado como double
        double operador1 = 0;
        double operador2 = 0;
        double resultado = 0;
        //Declaro el operando realizado como string
        String operando = "";

        //Comienza el menú de la calculadora
        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
        System.out.println("> Introduce un operador: ");
        try { //Intenta introducir un valor double a operador1
            operador1 = read.nextDouble();
        } catch (InputMismatchException e) { //En caso de que de el siguiente error . . .
            System.out.println("El formato introducido no es numérico."); //Te suelta un mensaje de error :C
            return; //Se acaba el programa
        }
        //Continúa el menú
        System.out.println("---------------------------");
        System.out.println("[+] -> Sumar");
        System.out.println("[-] -> Restar");
        System.out.println("[x] -> Multiplicar");
        System.out.println("[/] -> Dividir");
        System.out.println("[R] -> Raíz cuadrada");
        System.out.println("---------------------------");
        System.out.println("Elige un operando: ");
        //Pide el operando a realizar
        operando = read.next().substring(0,1); //El operando será el primer carácter que sea escrita por el usuario
        operando = operando.toLowerCase(); //Convierto el carácter en minúscula

        //Si el operando es suma, resta, multiplicación o división . . .
        //Con esto se logra que si es raíz cuadrada, no se deba introducir el operador2
        if (operando.equals("+")|| operando.equals("-") || operando.equals("x") || operando.equals("/")) {
            System.out.println("Introduce el segundo operador:"); //Se introduce el segundo operador
            try { //Se intenta introducir como double
                operador2 = read.nextDouble(); //Lee operador2 como double
            } catch (InputMismatchException e) { //Si da el siguiente error
                System.out.println("El formato introducido no es numérico."); //Te manda un mensaje de error
                return; //Te echa del programa :0
            }
        }

        //Switch evaluando todos los casos de tipos de operando
        switch (operando) {
            case "+": //Caso del operando es suma
                resultado = operador1 + operador2; //Suma de operadores
                break;
            case "-": //Caso del operando es resta
                resultado = operador1 - operador2; //Resta de operadores
                break;
            case "x": //Caso del operando es multiplicación
                resultado = operador1 * operador2; //Multiplicación de operadores
                break;
            case "/": //Caso del operando es división
                try { //Intenta dividir
                    resultado = operador1 / operador2; //División de operadores
                } catch (ArithmeticException e) { //Si la división da el siguiente error . . .
                    System.out.println("No se puede dividir entre 0."); //Te indicará que no se puede dividir entre 0
                    return; //Te echa del programa
                }
                break; //Break acaba los case
            case "r": //Caso del operando es raíz cuadrada
                if (operador1 < 0) { //Si el operador es negativo
                    System.out.println("Error, el número no debe ser negativo."); //Te indica que no puede serlo
                    return; //Te echa del programa
                } else { //Si es positivo o 0
                    resultado = Math.sqrt(operador1); //calcúla la raíz cuadrada
                    break;
                }
            default://Signo no contemplado
                System.out.println("No conozco ese operando :("); //Te indica que no conoce el operando
                return; //Se acaba el programa
        }
        System.out.println("El resultado es " + resultado); //Te indica el resultado al salir del switch
    }
}

