package org.example.TEMA5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ListaCompra {

    static ArrayList<String> lista = new ArrayList<>();

    static Random aleatorio = new Random();

    static void main(String[] args) {

        System.out.println("Está vacía: " + lista.isEmpty());

        lista.add("Carbón");

        System.out.println("Está vacía: " + lista.isEmpty());

        lista.addAll(Arrays.asList("PS5", "Bomba", "Tortuga", "Messi", "Manzana"));

        System.out.println("Lista de la compra: " + lista);

        System.out.println("Tercer elemento de la lista: " + lista.get(2));

        lista.set(2, "Queso");

        System.out.println("Segundo elemento de la lista: " + lista.get(2));

        System.out.println("Hay leche en la lista: " + lista.contains("Leche"));

        insertarElemento("Manzana");

        cambiarElemento("Manzana", 0);

        System.out.println("Elementos en la lista: " + lista.size());

        ArrayList<String> clon = new ArrayList<>(lista);

        clon.clear();

        System.out.println("Lista clonada vacía: " + clon.isEmpty());

        System.out.println("Las dos listas son iguales: " + lista.equals(clon));

        clon.addAll(Arrays.asList("Carbón", "Manzana"));

        ArrayList<String> faltantes = new ArrayList<>(lista);

        faltantes.removeAll(clon);

        System.out.println("Lista original sin las que están en la clonada: " + faltantes);
        System.out.println("Lista sin el remove: " + lista);

        ArrayList<Integer> precios = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {

            precios.add(aleatorio.nextInt(0,11));

        }
        System.out.println();

        System.out.println("ELEMENTO - PRECIO (€)");
        for (int i = 0; i < lista.size(); i++) {

            System.out.println(lista.get(i) + " - " + precios.get(i) + "€");

        }

    }

    public static void insertarElemento(String valor) {
        if (lista.contains(valor)) {
            System.out.println("No puedes añadir el elemento, ya se encuentra en la lista.");
        } else {
            lista.add(valor);
            System.out.println("Elemento añadido con éxito.");
        }
    }

    public static void cambiarElemento(String valor, int posicion) {
        if (lista.contains(valor)) {
            System.out.println("No puedes cambiar el elemento por uno que ya está en la lista.");
        } else {
            String valor_antiguo = lista.get(posicion);
            lista.set(posicion, valor);
            System.out.println("El elemento " + valor_antiguo + " ha sido intercambiado por " + valor  + " con éxito.");
        }
    }



}
