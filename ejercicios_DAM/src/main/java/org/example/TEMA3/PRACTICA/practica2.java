package org.example.TEMA3.PRACTICA;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica2 {
    static void main() {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean seguir = true;
        System.out.println("*** BIENVENIDO A LA PRIMITIVA ***");
        System.out.println("Introduce los datos de tu boleto: ");
        String boleto_usuario_sucio = read.nextLine();
        boolean formato = boleto_usuario_sucio.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        if (formato) {
            String[] boleto_usuario_vector = boleto_usuario_sucio.split("[-/]");
            int[] boleto_usuario_vector_entero = new int[boleto_usuario_vector.length];
            for (int i = 0 ; i < boleto_usuario_vector.length ; i++) {
                boleto_usuario_vector_entero[i] = Integer.parseInt(boleto_usuario_vector[i]);
            }
            int[] boleto_ganador = new int[boleto_usuario_vector.length-1];
            do {
                for (int i = 0 ; i <  boleto_ganador.length; i++) {
                    boleto_ganador[i] = aleatorio.nextInt(1,50);
                }
                int[] boleto_ganador_limpio = Arrays.stream(boleto_ganador).distinct().toArray();

                if (boleto_ganador_limpio.length == boleto_usuario_vector.length-1) {
                    seguir = false;
                }
            } while (seguir);

            Arrays.sort(boleto_ganador);
            System.out.println("Boleto ganador: " + Arrays.toString(boleto_ganador));

            int contador_numeros_ganadores = 0;

            for (int i = 0; i < boleto_usuario_vector.length -1 ; i++) {
                if (boleto_usuario_vector_entero[i] == boleto_ganador[i]) {
                    contador_numeros_ganadores++;
                }
            }

            System.out.println("HAS ACERTADO: " + contador_numeros_ganadores + " NÚMEROS");



        } else {
            System.out.println("Formato incorrecto. (N-N-N-N-N-N/R)");
        }

    }
}
