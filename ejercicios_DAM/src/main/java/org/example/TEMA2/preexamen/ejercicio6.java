package org.example.TEMA2.preexamen;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);
        int sumatorio_edad = 0;
        int sumatorio_altura = 0;
        int mayores = 0;
        int mayor175 = 0;
        System.out.print("¿Cuántos alumnos hay?: ");
        int cantidad = read.nextInt();
        if (cantidad < 1) {
            System.out.println("Debe de haber por lo menos un alúmno.");
            return;
        }

        for (int i = 1 ; i <= cantidad ; i++) {
            System.out.print("Introduce edad de alumno " + i + ": ");
            int edad = read.nextInt();
            sumatorio_edad += edad;
            if (edad >= 18) {
                mayores++;
            }
            System.out.print("Introduce altura (cm) de alumno " + i + ": ");
            int altura = read.nextInt();
            sumatorio_altura += altura;
            if (altura > 175) {
                mayor175++;
            }
        }
        int edad_media = sumatorio_edad / cantidad;
        int altura_media = sumatorio_altura / cantidad;
        System.out.println("Edad media: " + edad_media);
        System.out.println("Altura media: " + altura_media);
        System.out.println("Alumnos mayores de 18 años: " + mayores);
        System.out.println("Alumnos que miden más de 175cm: " + mayor175);

    }
}
