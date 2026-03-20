package org.example.TEMA7.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PruebaIndestructible {

    static void main(String[] args) {

        List<Integer> lista = Collections.unmodifiableList(new ArrayList<>());

        List<Integer> lista2 = new ArrayList<>();

        lista2.add(5);
        lista2.add(2);
        List<Integer> listaIndestructible = Collections.unmodifiableList(lista2);


        listaIndestructible.add(10);

        lista.add(324);
        lista.add(2);

        //lista = new ArrayList<>();

    }

}
