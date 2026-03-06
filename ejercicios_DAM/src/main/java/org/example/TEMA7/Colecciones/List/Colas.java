package org.example.TEMA7.Colecciones.List;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Colas {

    static void main(String[] args) {
        Deque<String> cola = new LinkedList<>();
        cola.poll();
        cola.offer("Yatra");
        cola.offer("Blessd");
        cola.offer("Shakira");
        cola.offer("Morat");

        System.out.println(cola.poll());
        System.out.println(cola.peek());

        cola.offerFirst("Pirlo");

        System.out.println(cola.peek());
        System.out.println(cola.pollLast());


        Queue<String> cola2 = new ArrayBlockingQueue<>(2);
        cola2.offer("Chesni");
        cola2.offer("Joaquin Magnoli Loisi");
        cola2.offer("Maduro");

        System.out.println(cola2);


    }



}
