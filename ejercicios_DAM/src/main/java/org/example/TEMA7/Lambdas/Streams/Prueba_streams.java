package org.example.TEMA7.Lambdas.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prueba_streams {
    static void main(String[] args) {

        Stream<String> pruebaStream = Stream.of("Ibai", "IlloJuan", "Jacobo", "La Falete", "ParadoxKaiser")
                .filter(persona -> persona.startsWith("P"))
                .filter(persona -> persona.contains("x"))
                .map(String::toUpperCase);
        List<String> lista = pruebaStream.toList();

        //System.out.println(lista);
        System.out.println(lista);


        List<String> lista2 = Arrays.asList("Jijona", "Yema", "Piedra", "Duro");
        lista2 = lista2.stream().filter(turron -> turron.contains("o")).toList();

        System.out.println(lista2);

    }
}
