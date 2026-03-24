package org.example.TEMA7.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe tu frase: ");
        String frase = teclado.nextLine().toUpperCase();

        HashMap<String,Integer> mapita = new HashMap<>();


        for (String palabras : frase.split(" ") ){

            mapita.put(palabras,mapita.getOrDefault(palabras,0)+1);
        }

        System.out.println(mapita);
        for (Map.Entry<String, Integer> mapa : mapita.entrySet()){
            System.out.println(mapa.getKey() + " : " + mapa.getValue());
        }
    }
}
