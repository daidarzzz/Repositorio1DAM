package org.example.TEMA3.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class TablaDeCalificaciones {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.print("Introduce número de estudiantes: ");
        int num_estudiantes = read.nextInt();
        System.out.print("Introduce número de asignaturas: ");
        int num_asignaturas = read.nextInt();
        String[][] notas = new String[num_estudiantes+1][num_asignaturas+1];

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
        double suma_nota = 0;

        for (int i = 1; i < notas.length ; i++) {
            suma_nota = 0;
            for (int j = 1; j < notas[i].length; j++) {

                suma_nota += Integer.parseInt(notas[i][j]);

            }
            double media_total = (suma_nota / num_asignaturas);
            System.out.println("Nota media del alumno " + notas[i][0] + ": " + media_total);
        }

        for (int i = 1; i < notas[0].length ; i++) {
            suma_nota = 0;
            for (int j = 1; j < notas.length; j++) {
                suma_nota += Integer.parseInt(notas[j][i]);
            }
            double nota_media_asignatura = suma_nota/num_estudiantes;
            System.out.println("La nota media en la asignatura de " + notas[0][i] + " es " + nota_media_asignatura);
        }
    }
}
