package org.example.TEMA7.Colecciones.Set;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ejercicio1 {
    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {
        System.out.print("Escribe una frase: ");
        String[] oracion = read.nextLine().toLowerCase().split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(oracion));
        System.out.println("Palabras únicas: " +set);

    }

}
