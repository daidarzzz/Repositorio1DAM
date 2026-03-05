package org.example.TEMA7.AceptaElReto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ej141 {

        static Scanner read = new Scanner(System.in);

        public static void main(String[] args) {

            while (casoDePrueba()) {
            }
        } // main

        public static boolean casoDePrueba() {
            if (!read.hasNext())
                return false;
            else {
                boolean correcto = true;
                String texto = read.nextLine();
                Character[] valoresEntrar = {'(', '{', '['};
                Character[] valoresCerrar = {')', '}', ']'};
                ArrayList<Character> lista = new ArrayList<>();
                for (int i = 0; i < texto.length(); i++) {
                    if (Arrays.asList(valoresEntrar).contains(texto.charAt(i)) || Arrays.asList(valoresCerrar).contains(texto.charAt(i))){
                        lista.add(texto.charAt(i));
                    }
                }

                Stack<Character> pila = new Stack<>();

                boolean par1 = false;
                boolean par2 = false;
                for (int i = 0; i < lista.size() ; i++) {
                    Character character = lista.get(i);
                    if (Arrays.asList(valoresEntrar).contains(character)) {
                        pila.push(character);
                        par1 = true;
                    } else if (Arrays.asList(valoresCerrar).contains(character)) {
                            par2 = true;
                            int valor = Arrays.asList(valoresCerrar).indexOf(character);

                            if (!pila.isEmpty() && pila.peek() == valoresEntrar[valor]) {
                                correcto = true;
                                pila.pop();
                            } else {
                                correcto = false;
                            }
                    }
                }


                if (par1 && par2) correcto = true;
                else correcto = false;
                if (correcto) System.out.println("YES");
                else System.out.println("NO");


                return true;
            }
        } // casoDePrueba

}
