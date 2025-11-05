package org.example.TEMA3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class array_prueba {
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);

        int[] vector = {10, 20, 30, 40, 50}; //Desde índice 0 a 4
        System.out.println(Arrays.toString(vector)); //Mostrar todos los valores del vector
        System.out.println(vector.length);
        System.out.println("Cuarto número antes: " + vector[3]);
        vector[3] = 10; //Cambiar valor del vector
        System.out.println("Cuarto número después: " + vector[3]);

        String [] vector2 = new String[5];
        System.out.println(Arrays.toString(vector2)); //da null
        System.out.println(vector2); //da la direccion de memoria (tristeza y depresion)

        int[] vector3 = new int[5];
        vector3 = vector; //Los hace iguales pero además LE ASIGNA LA MISMA DIRECCIÓN DE MEMORIA
        System.out.println(vector);
        System.out.println(vector3);

        //Clonar un vector:
        int[] vector4 = new int[5];
        vector4 = vector.clone(); //asi tienen una direccion de memoria distina, asi que si se cambia uno no afecta al otro🪫
        System.out.println(vector4);
        System.out.println(Arrays.toString(vector4));

//        for (int i = 0 ; i < vector4.length ; i++) {
//            System.out.println(vector[i]);
//        }
        int sumatorio = 0;
        for (int i = vector4.length -1 ; i >= 0 ; i--) { //Desde la última posición a la primera (4 a 0)
            System.out.println(vector4[i]);
            sumatorio += vector4[i];
        }
        System.out.println("Sumatorio: " + sumatorio);

        //USAR VALORES ALEATORIOS (RANDOM)
        int[] vector_random = new int[5];

        for (int i = 0; i < vector_random.length ; i++) {
            //vector_random[i] = aleatorio.nextInt(0,501);
            //vector_random[i] = aleatorio.nextInt(500 - 0 + 1) + 0;
            vector_random[i] = aleatorio.nextInt(501);
        }
        System.out.println(Arrays.toString(vector_random));

        //USAR READ
        int[] vector_read = new int[4];
        for (int i = 0 ; i < vector_read.length ; i++) {
            try {
                System.out.print("Introduce valor de posición " + i + ": ");
                vector_read[i] = read.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Error.");
                return;
            }

        }
        System.out.println(Arrays.toString(vector_read));
    }
}
