package org.example.TEMA7.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe tu palabra: ");
        String palabra = teclado.nextLine().toUpperCase();

        HashMap<Character,Integer> mapita = new HashMap<>();


        for (Character letra : palabra.toCharArray()){

            if (mapita.containsKey(letra)){
                mapita.put(letra,mapita.get(letra)+1);
            }else {
                mapita.put(letra, 1);
            }
        }

        System.out.println(mapita);
        for (Map.Entry<Character, Integer> mapa : mapita.entrySet()){
            System.out.println(mapa.getKey() + " : " + mapa.getValue());
        }
    }
}
