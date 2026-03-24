package org.example.TEMA7.EJEMPLOSLISTAS;

import java.util.TreeSet;

public class TreeSete {

    public static void main(String[] args) {
        // Los elementos se ordenan SOLOS al añadirlos
        TreeSet<String> conjunto = new TreeSet<>();

        boolean insertado = conjunto.add("Zaira"); // true
        conjunto.add("Zaira"); // devuelve false y NO lo inserta
        conjunto.add("Adrián");

        // Hay que recorrerlo para acceder a los valores
        for (String s : conjunto) {
            System.out.println(s);
        }

        String primero = conjunto.first(); // El más "pequeño"
        String ultimo = conjunto.last();   // El más "grande"
    }

}
