package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class TablaDeCalificaciones {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.print("Introduce número de estudiantes: ");
        int num_estudiantes = read.nextInt() + 1;
        System.out.print("Introduce número de asignaturas: ");
        int num_asignaturas = read.nextInt() + 1;
        String[][] notas = new String[num_estudiantes][num_asignaturas];

        notas[0][0] = "Estudiantes";
        read.nextLine();

        for (int i = 1; i < notas.length ; i++) {
            System.out.print("Introduce estudiante " + i + ": ");
            notas[i][0] = read.next();
        }

        for (int j = 1 ; j < notas[0].length ; j++) {
            System.out.print("Introduce asignatura " + j + ": ");
            notas[0][j] = read.next();
        }

        for (int i = 1 ; i < notas.length ; i++) {
            for (int j = 1 ; j < notas[0].length ; j++) {
                System.out.println("Introduce la nota de " + notas[i][0] + " en " + notas[0][j]);
                notas[i][j] = read.next();
            }
        }
        for (String fila[] : notas) {

            System.out.println(Arrays.toString(fila));

        }



    }
}
