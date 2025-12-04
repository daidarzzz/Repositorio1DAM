package org.example.TEMA4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prefabs {
    private static Scanner read = new Scanner(System.in);

    public static int pedirEntero(String texto) {
        int num = 0;
        boolean seguir = true;

        do {
            System.out.print(texto);
            try {
                num = read.nextInt();
                read.nextLine();
                seguir = false;
            } catch (InputMismatchException e) {
                System.out.println("Error. Debes introducir un número entero");
                read.nextLine();
            }
        } while (seguir);

        return num;
    }


    public static int menu (String titulo, String... opciones) {
       System.out.println("**** " + titulo + " ****");
       for (int i = 0; i < opciones.length; i++) {
           System.out.println((i+1) + ". " + opciones[i]);
       }
       return pedirEntero("Introduce una opción: ");
   }

   public static void printlnArrayInt (int[] array) {
       for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
       }
   }
    public static void printArrayInt (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void rellenarArrayInt (int[] array) {
        for (int i = 0; i < array.length; i++) {
           array[i] = pedirEntero("Introduce valor de la posición " + i + ": ");

        }
    }

    public static void printMatrizInt (int[][] matriz) {
        for (int fila[] : matriz ) {
            for (int num : fila) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrizString (String[][] matriz) {
        for (String fila[] : matriz ) {
            for (String num : fila) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

    public static boolean esPar (int num) {
        if (num % 2 == 0) {
            return true;
        } else return false;
    }

    public static int sumaArray (int[] array) {
        int sumatorio = 0;
        for (int i = 0; i < array.length ; i++) {
            sumatorio += array[i];
        }
        return sumatorio;
    }

    public static int minArray (int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) menor = array[i];
        }
        return menor;
    }

    public static int maxArray (int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) mayor = array[i];
        }
        return mayor;
    }

    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

}
