package org.example.TEMA7.Diccionario;

import java.util.Scanner;

public class DiccionarioApp {
    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {
        Diccionario.precarga();

        System.out.println("Bienvenido al diccionario de  español a inglés.");
        String opcion = "";
        int preguntas = 0;
        int aciertos = 0;
        while (true) {

            String palabra = Diccionario.palabraAleatoria();

            System.out.println(palabra + ": " + Diccionario.primeraLetraTraduccion(palabra) + "...");
            System.out.print("Indique la respuesta: ");
            opcion = read.next().toLowerCase();

            if (opcion.equals("salir")) {
                System.out.println("FIN DEL PROGRAMA");
                System.out.println("Total de preguntas: " + preguntas);
                System.out.println("Total de aciertos: " + aciertos);
                System.out.println("Total de fallos: " + (preguntas - aciertos));
                System.out.println("Aciertos: " + ((aciertos * 100) / preguntas) + "%");
                break;
            }
            if (Diccionario.mapa.get(palabra).equals(opcion)) {
                System.out.println("¡CORRECTO!");
                System.out.println();
                aciertos++;
            } else {
                System.out.println("NO. La respuesta es " + Diccionario.mapa.get(palabra));
            }

            preguntas++;

        }

    }

}
