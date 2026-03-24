package org.example.TEMA7.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class EjOlimpiadas {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int y = teclado.nextInt();
        teclado.nextLine();

        if (y == 0)
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            HashMap<String, Integer> mapita = new HashMap<>();
            String numeros = teclado.nextLine();

            for (String num : numeros.split(" ")) {
                if (mapita.containsKey(num)) {
                    mapita.put(num, mapita.get(num) + 1);
                } else {
                    mapita.put(num, 1);
                }
            }
            int aux = 0;
            String fin = "";
            for (Map.Entry<String, Integer> mapa : mapita.entrySet()){
                if (aux < mapa.getValue()) {
                    aux = mapa.getValue();
                    fin = mapa.getKey();
                }
            }
            System.out.println(fin);
                return true;
        }
    }
}
