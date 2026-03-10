package org.example.TEMA7.Colecciones.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {
        LinkedHashSet<String> webs = new LinkedHashSet<>();
        while (true) {

            String web = read.next().toLowerCase();
            if (!web.equals("salir")) {
                webs.add(web);
            } else {
                break;
            }


        }
        System.out.println();
        System.out.println("Historial de navegación:");
        int contador = 1;
        for (String direccion : webs) {
            System.out.println(contador++ + ". " + direccion);
        }
    }

}
