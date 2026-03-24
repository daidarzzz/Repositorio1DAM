package org.example.TEMA7.Colecciones.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLista {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Luis");
        lista.add(0, "Andrea");


        lista.addFirst("Roberto");
        lista.addLast("Guillermo");

        // 4. Acceso y Consulta
        String primero = lista.getFirst();
        String ultimo = lista.getLast();
        int tamaño = lista.size();


        lista.removeFirst();
        lista.removeLast();
        lista.remove("Luis");
        lista.remove(0);


        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String nombre = it.next();
            if (nombre.equals("Andrea")) {
                it.remove();
            }
        }

        Collections.sort(lista);

        System.out.println("Lista final:");
        for (String nombre : lista) {
            System.out.println("- " + nombre);
        }

        lista.clear();
    }

}
