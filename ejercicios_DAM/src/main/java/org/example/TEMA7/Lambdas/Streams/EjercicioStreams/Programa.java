package org.example.TEMA7.Lambdas.Streams.EjercicioStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    static void main(String[] args) {

        List<String> frutas = Arrays.asList("manzana", "pera", "kiwi", "plátano");

        frutas.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);

        System.out.println(frutas);

        //b) Transforma todos los nombres a minúsculas y lo guarda en otra lista.
        List<String> lista = frutas.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(lista);
//c) Cuenta cuántos nombres empiezan con "A".
        long cantidad = lista.stream()
                .filter(nombre -> nombre.startsWith("P"))
                .count();
        System.out.println(cantidad);

        

    }

}
