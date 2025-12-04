package org.example.TEMA4.BateriaDeEjercicios;

import org.example.TEMA4.Prefabs;

import java.util.Scanner;

public class Ejercicio1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int numero = Prefabs.pedirEntero("Introduce un número: ");

        int resultado = cubo(numero);

        System.out.println(resultado);
    }

    public static int cubo (int numero) {

        return numero*numero*numero;

    }

}
