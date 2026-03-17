package org.example.TEMA7.Iteradores;

import org.example.TEMA7.Colecciones.Set.Presidente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteradoresObjetos {

    static void main(String[] args) {

        ArrayList<Presidente> lista = new ArrayList<>(
            Arrays.asList(
                    new Presidente("Donald Trump", "USA"),
                    new Presidente("Benja Netanyahu", "ISRAEL"),
                    new Presidente("Pedro Sanchez", "ESPAÑA")
            )
        );

        Iterator<Presidente> it = lista.iterator();

        while(it.hasNext()) {

            Presidente presi = it.next();

            if (presi.getNombre().equalsIgnoreCase("benja netanyahu")) it.remove();

        }

        System.out.println(lista);
     }


}
