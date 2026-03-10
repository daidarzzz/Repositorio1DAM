package org.example.TEMA7.EntregaEj3ySet.Ej3;

import java.util.Stack;

public class AppInformes {

    static void main(String[] args) {

        Stack<Informe> pila = new Stack<>();

        pila.push(new Informe(1, "Informe 21", "EMPRESARIAL"));
        pila.push(new Informe(2, "Informe 211", "PERSONAL"));
        pila.push(new Informe(4, "Informe 41", "EMPRESARIAL"));
        pila.push(new Informe(5, "Informe 61", "PERSONAL"));
        pila.push(new Informe(77, "Informe 27", "ADMINISTRATIVO"));

        System.out.println("Eliminando los 5 informes");
        while (!pila.isEmpty()) {

            System.out.println(pila.pop());

        }

        pila.push(new Informe(10, "tarea11", "ADMINISTRATIVO"));
        pila.push(new Informe(10, "tarea121", "ADMINISTRATIVO"));
        pila.push(new Informe(20, "tarea11214", "EMPRESARIAL"));


    }

}
