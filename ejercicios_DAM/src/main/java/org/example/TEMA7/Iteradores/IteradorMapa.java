package org.example.TEMA7.Iteradores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteradorMapa {

    static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Nicki Nikole", 4);
        mapa.put("Hermione", 7);

        Iterator<Map.Entry<String, Integer>> itMapita = mapa.entrySet().iterator();

        while (itMapita.hasNext()) {
            Map.Entry<String, Integer> novia = itMapita.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue() + " meses con Joaquín");

            if (novia.getKey().equalsIgnoreCase("hermione")) {
                itMapita.remove();
            }
        }

        for (Map.Entry<String, Integer> mapita : mapa.entrySet()) {
            System.out.println(mapita.getKey());
        }

        System.out.println(mapa.entrySet());

    }

}
