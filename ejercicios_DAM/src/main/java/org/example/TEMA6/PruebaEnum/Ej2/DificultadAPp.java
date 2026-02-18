package org.example.TEMA6.PruebaEnum.Ej2;

import java.util.Random;
import java.util.Scanner;

public class DificultadAPp {

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]:");
        Dificultad dificultad = Dificultad.valueOf(read.next().toUpperCase());
        int puntos = aleatorio.nextInt(1,10000);
        int puntos_finales = puntos * dificultad.getMultiplicador();

        System.out.println("Puntuación obtenida = " + puntos);
        System.out.println("Puntuación final = " + puntos_finales);

    }

}
