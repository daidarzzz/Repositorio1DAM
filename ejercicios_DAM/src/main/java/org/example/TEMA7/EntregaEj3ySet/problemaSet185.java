package org.example.TEMA7.EntregaEj3ySet;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class problemaSet185 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int casos = read.nextInt();
        read.nextLine();

        if (casos == 0)
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            TreeSet<String> malos = new TreeSet<>();
            TreeSet<String> buenos = new TreeSet<>();
            for (int i = 0; i < casos; i++) {

                String[] texto = read.nextLine().split(" ");

                for (int j = 0; j < texto.length -1; j++) {

                    if (texto[0].equals("SI:") && j == 0) continue;
                    else if (texto[0].equals("NO:") && j == 0) continue;
                    else if (texto[0].equals("SI:")) buenos.add(texto[j]);
                    else if (texto[0].equals("NO:")) malos.add(texto[j]);



                }


            }
            boolean primero = true;
            for (String malosos : malos) {
                if (!buenos.contains(malosos)) {
                    if (!primero) {
                        System.out.print(" "); 
                    }
                    System.out.print(malosos);
                    primero = false;
                }
            }
            System.out.println();
            return true;
        }
    }

}
