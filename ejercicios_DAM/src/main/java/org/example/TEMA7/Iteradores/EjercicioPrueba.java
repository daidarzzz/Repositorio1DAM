package org.example.TEMA7.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioPrueba {

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Character> lista = new ArrayList<>();

        ListIterator<Character> it = lista.listIterator();


        System.out.println("Introduce tu palabra:");
        String palabra = read.next();

        for (Character chara : palabra.toCharArray()) {

            switch (chara) {
                case '<':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()) {
                        it.previous();
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

    }

}
