package org.example.TEMA7.Colecciones.OBJETOS.EJERCICIO2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CineApp {
    static Queue<Espectador> espectadores = new LinkedList<>();
    static Random aleatorio = new Random();
    static void main(String[] args) {

        generarCola();

        System.out.println("Hay " + espectadores.size() + " en la cola " + espectadores);
        double recaudacion = 0;
        while(!espectadores.isEmpty()) {

            if (espectadores.poll().getEdad() >= 18) {
                recaudacion += 3.5;
            } else if (espectadores.poll().getEdad() >= 11) {
                recaudacion += 2.5;
            } else {
                espectadores.poll();
                recaudacion += 1;
            }

        }

        System.out.println("Total recaudado: " + recaudacion + "€");

    }

    public static void generarCola() {

        int num_personas = aleatorio.nextInt(251);

        for (int i = 0; i < num_personas; i++) {

            espectadores.offer(new Espectador(aleatorio.nextInt(3,101)));

        }

    }
}
