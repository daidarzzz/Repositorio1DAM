package org.example.TEMA7.Colecciones.List.COlas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

    static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();
        playlist.offer("Señorita");
        playlist.offer("WakaWaka");
        playlist.offer("Osito Gominola");
        playlist.offer("Creeper vs Zombies");

        System.out.println("Estado inicial de la playlist: " + playlist);
        while (!playlist.isEmpty()) {
            System.out.println("Reproduciendo: " + playlist.poll());
            System.out.println("Estado de la playlist después de reproducir una canción: " + playlist);

        }
        System.out.println("La playlist ha terminado.");


    }

}
