package org.example.TEMA7.Colecciones.Set;

import java.util.*;

public class Pruebas_Sets {

    static void main(String[] args) {

        String esquiroles[] = {"Joaquín", "Christian", "Christian", "Carlos", "Carlos", "Ángel", "Kevin", "Eric", "DavidG"};

        HashSet<String> normal = new HashSet<>(Arrays.asList(esquiroles));
        LinkedHashSet<String> respetaAdd = new LinkedHashSet<>(Arrays.asList(esquiroles));
        TreeSet<String> ordenada = new TreeSet<>(Arrays.asList(esquiroles));

        System.out.println(normal);
        System.out.println(respetaAdd); //Respeta el orden de añadidos
        System.out.println(ordenada);


    }

}
