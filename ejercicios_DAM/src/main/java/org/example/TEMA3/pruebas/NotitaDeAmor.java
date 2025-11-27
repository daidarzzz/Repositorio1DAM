package org.example.TEMA3.pruebas;

import java.util.Random;
import java.util.Scanner;

public class NotitaDeAmor {
    static void main() {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();

        int[][] aulas = {
                {3, 4, 5},
                {0, 1, 2}
        };

        int posicion_fila = 1;
        int posicion_columna = 0;

        int posicion_profe = 0;
        int posicion_notita = 0;

        do {
            posicion_profe = aleatorio.nextInt(1,5);
            posicion_notita = aleatorio.nextInt(1,5);
        } while ( posicion_profe == posicion_notita );
        int alumno = 0;

        do {
            alumno = aulas[posicion_fila][posicion_columna];



            System.out.println("Estás en la habitación: " + alumno);
            if (alumno == posicion_profe) {System.out.println("OH NO.. TE HA ENCONTRADO EL PROFE !!");return;}
            if (alumno == posicion_notita) {System.out.println("HAS ENCONTRADO LA NOTITA DE TU AMADA :D"); return;}

            System.out.print("¿A dónde quieres ir? [");
            if (posicion_fila > 0) { System.out.print("N");}
            if (posicion_fila < 1) { System.out.print(", "); System.out.print("S");}
            if (posicion_columna > 0) { System.out.print(", "); System.out.print("O");}
            if (posicion_columna < 2) { System.out.print(", "); System.out.print("E"); }
            System.out.print("] > ");
            char opcion = read.next().toUpperCase().charAt(0);

            switch (opcion) {
                case 'N':
                    posicion_fila--;
                    break;
                case 'E':
                    posicion_columna++;
                    break;
                case 'O':
                    posicion_columna--;
                    break;
                case 'S':
                    posicion_fila++;
                    break;
                default:
                    System.out.println("Opción no contemplada.");
                    break;
            }

        } while (alumno != posicion_profe && alumno != posicion_notita);


    }
}
