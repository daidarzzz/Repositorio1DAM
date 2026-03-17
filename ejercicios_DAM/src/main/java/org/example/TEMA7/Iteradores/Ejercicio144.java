package org.example.TEMA7.Iteradores;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio144 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        if (!read.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            ArrayList<Character> lista = new ArrayList<>();

            ListIterator<Character> it = lista.listIterator();

            String palabra = read.nextLine();

            for (Character chara : palabra.toCharArray()) {

                switch (chara) {
                    case '-':
                        while (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(chara);
                        break;
                }

            }

            for (Character character : lista) {
                System.out.print(character);
            }

            System.out.println();
            return true;
        }
    } // casoDePrueba


}
