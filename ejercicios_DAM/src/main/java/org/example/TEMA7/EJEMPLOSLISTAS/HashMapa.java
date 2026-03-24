package org.example.TEMA7.EJEMPLOSLISTAS;

import java.util.HashMap;
import java.util.Map;

public class HashMapa {

    public static void main(String[] args) {
        Map<String, Double> stock = new HashMap<>();
        stock.put("Manzana", 1.50);
        stock.put("Pera", 2.0);

        System.out.println(stock.get("Pera"));

        //  Recorrer solo CLAVES (KeySet)
        for (String fruta : stock.keySet()) {
            System.out.println("Fruta: " + fruta);
        }

        //  Recorrer solo VALORES (Values)
        for (Double precio : stock.values()) {
            System.out.println("Precio: " + precio);
        }

        // Recorrer AMBOS a la vez (EntrySet)
        for (Map.Entry<String, Double> entrada : stock.entrySet()) {
            System.out.println(entrada.getKey() + " cuesta " + entrada.getValue());
        }


        stock.replace("Manzana", 1.80);

    }

}
