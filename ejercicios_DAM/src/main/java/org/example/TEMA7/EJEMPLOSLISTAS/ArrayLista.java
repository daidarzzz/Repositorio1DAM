package org.example.TEMA7.EJEMPLOSLISTAS;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Luis");
        lista.add(0, "Andrea");


        String nombre = lista.get(1);
        boolean existe = lista.contains("Luis");

        Collections.sort(lista); // Ordena alfabéticamente o por Comparable

        lista.remove("Luis");
        lista.remove(0);
    }

}
