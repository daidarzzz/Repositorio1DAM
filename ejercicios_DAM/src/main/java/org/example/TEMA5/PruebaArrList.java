package org.example.TEMA5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaArrList {

    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {

        ArrayList<Integer> listaNotas = new ArrayList<>();

        listaNotas.add(5);
        listaNotas.add(1);
        listaNotas.add(0);

        int longitud = listaNotas.size();
        System.out.println("Elementos en la lista: " + longitud);

        listaNotas.add(1, 4);

        longitud = listaNotas.size();
        System.out.println("Elementos en la lista: " + longitud);

        System.out.println("Nota en la posición 2: " + listaNotas.get(2));

        listaNotas.remove(3);

        longitud = listaNotas.size();
        System.out.println("Elementos en la lista: " + longitud);


        System.out.println(listaNotas);

        System.out.println(listaNotas.indexOf(1));

        System.out.println("Las notas de Jacobo: ");

        for (Integer nota : listaNotas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("Tema " + (i+1) + ": " + listaNotas.get(i));
        }

        listaNotas.set(0, 0);

        System.out.println();
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("Tema " + (i+1) + ": " + listaNotas.get(i));
        }

        Object copiaMala = listaNotas.clone(); //NO SE USA ESTA.

        ArrayList<Integer> copia = new ArrayList<>(listaNotas);

        System.out.println(listaNotas.contains(5));
        System.out.println(listaNotas.contains(0));


        System.out.println("Está vacia: " + listaNotas.isEmpty());
        listaNotas.clear();
        System.out.println("Está vacia: " + listaNotas.isEmpty());


        listaNotas.addAll(Arrays.asList(2,5,6,3));

        System.out.println(listaNotas);
    }

}
