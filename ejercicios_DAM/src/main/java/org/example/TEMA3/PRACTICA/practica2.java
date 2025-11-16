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
            Integer[] boleto_usuario_vector_entero = new Integer[boleto_usuario_vector.length];
            for (int i = 0; i < boleto_usuario_vector.length; i++) {
                boleto_usuario_vector_entero[i] = Integer.parseInt(boleto_usuario_vector[i]);
            }
            Integer[] boleto_ganador = new Integer[boleto_usuario_vector.length - 1];
//            do {
//                for (int i = 0 ; i <  boleto_ganador.length; i++) {
//                    boleto_ganador[i] = aleatorio.nextInt(1,50);
//                }
//                int[] boleto_ganador_limpio = Arrays.stream(boleto_ganador).distinct().toArray();
//
//                if (boleto_ganador_limpio.length == boleto_usuario_vector.length-1) {
//                    seguir = false;
//                }
//            } while (seguir);
            boolean comprobar = true;
            for (int i = 0; i < boleto_ganador.length; i++) {
                boleto_ganador[i] = aleatorio.nextInt(1, 50);
            }
            while (comprobar) {
                comprobar = false;

                Arrays.sort(boleto_ganador);
                for (int i = 0; i < boleto_ganador.length - 1; i++) {

                    if (boleto_ganador[i].equals(boleto_ganador[i + 1])) {
                        boleto_ganador[i] = aleatorio.nextInt(1, 50);
                        comprobar = true;
                        Arrays.sort(boleto_ganador);
                    }

                }


            }
            int complementario = -1;
            int reintegro = aleatorio.nextInt(0, 10);
            boolean reintegro_acertado = false;
            boolean complementario_acertado = false;

            if (boleto_usuario_vector_entero[boleto_usuario_vector_entero.length - 1] == reintegro)
                reintegro_acertado = true;

            do {
                complementario = aleatorio.nextInt(0, 50);
            } while (Arrays.asList(boleto_ganador).contains(complementario));
            if (Arrays.asList(boleto_usuario_vector_entero).contains(complementario)) complementario_acertado = true;
            Arrays.sort(boleto_ganador);
            System.out.println("BOLETO GANADOR: " + Arrays.toString(boleto_ganador));
            System.out.println("Complementario: " + complementario);
            System.out.println("Reintegro: " + reintegro);
            int contador_numeros_ganadores = 0;

            for (int i = 0; i < boleto_ganador.length; i++) {
                if (Arrays.asList(boleto_ganador).contains(boleto_usuario_vector_entero[i])) {
                    contador_numeros_ganadores++;
                }
            }
            System.out.println();
            System.out.println("RESULTADOS:");
            System.out.println(contador_numeros_ganadores + (contador_numeros_ganadores == 1 ? " acierto." : " aciertos."));
            if (reintegro_acertado) System.out.println("Reintegro.");
            System.out.println();
            System.out.println("--------------");
            System.out.println();
            if (contador_numeros_ganadores >= 3) {
                System.out.print("Perteneces a la " + (contador_numeros_ganadores == 6 && reintegro_acertado ? "Categoría especial" : contador_numeros_ganadores == 6 ? "1ª Categoría" : contador_numeros_ganadores == 5 && complementario_acertado ? "2ª Categoría" : contador_numeros_ganadores == 5 ? "3ª Categoría" : contador_numeros_ganadores == 4 ? "4ª Categoría" : "5ª Categoría"));
            } else {
                System.out.println(reintegro_acertado ? "Acertaste el número del reintegro" : "No has sido premiado.");
            }
        } else {
            System.out.println("Formato incorrecto. (N-N-N-N-N-N/R)");
        }

    }
}
