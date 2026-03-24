package org.example.TEMA7.EJEMPLOSLISTAS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEj {

    public static void main(String[] args) {

        // --- 1. QUEUE (COLA NORMAL - FIFO) ---
        // Imagina una cola del cine: el primero que llega, entra primero.
        Queue<String> colaCine = new LinkedList<>();

        System.out.println("--- TRABAJANDO CON QUEUE ---");
        colaCine.offer("Paco");    // Añade al final
        colaCine.offer("Lucía");
        colaCine.offer("Juan");

        System.out.println("El primero de la cola es: " + colaCine.peek()); // Solo mira a Paco

        String atendido = colaCine.poll(); // Saca a Paco de la lista
        System.out.println("Atendido y fuera: " + atendido);
        System.out.println("Ahora la cola es: " + colaCine);


        // --- 2. DEQUE (DOBLE COLA - VERSÁTIL) ---
        // Imagina un pasillo con dos puertas: puedes entrar y salir por donde quieras.
        Deque<String> pasillo = new ArrayDeque<>();

        System.out.println("\n--- TRABAJANDO CON DEQUE ---");
        pasillo.addFirst("VIP 1");  // Entra por la puerta de delante
        pasillo.addLast("Normal 1"); // Entra por la puerta de atrás
        pasillo.addFirst("VIP 2");  // Entra por delante (ahora es el primero)

        System.out.println("Estado del pasillo: " + pasillo); // [VIP 2, VIP 1, Normal 1]

        pasillo.removeFirst(); // Quita a VIP 2
        pasillo.removeLast();  // Quita a Normal 1

        System.out.println("Tras las salidas: " + pasillo);


        // DEQUE USADO COMO PILA (STACK) ---
        // Java recomienda usar Deque en lugar de la clase Stack antigua.
        Deque<String> platos = new ArrayDeque<>();

        System.out.println("\n--- DEQUE COMO PILA (LIFO) ---");
        platos.push("Plato Base");  // Igual que addFirst
        platos.push("Plato Comida");
        platos.push("Plato Postre");

        System.out.println("Pila de platos: " + platos);
        System.out.println("Quitamos el de arriba: " + platos.pop()); // Saca Postre
    }

}
