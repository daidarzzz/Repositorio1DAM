package org.example.TEMA7.Iteradores;

import java.util.Iterator;
import java.util.TreeSet;

public class Iteradores {

    static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();

        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Jorge");
        lista.add("Francisco Javier");
        lista.add("Raichu");
        lista.add("Jacobo");

//        for (String pokemon : lista) {
//            if (pokemon.equals("Jacobo")) {
//                lista.remove(pokemon);
//            }
//        }

        Iterator<String> it = lista.iterator();

        //lista.add("Onix"); si lo añades después de declarar el it peta, si quitas alguno tb
        //Sirve para todos menos pilas y colas, que ya tienen sus métodos dedicados.
        while (it.hasNext()) {

            String pokemon = it.next();
            if (pokemon.equalsIgnoreCase("pikachu")) {
                it.remove();
            }
            System.out.println(pokemon);

        }

        System.out.println(lista);

    }

}
