package org.example.TEMA2.randomEjercicios;

import java.util.Random;

public class ejercicio2 {
    static void main() {
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String password = "";

        for (int i = 1 ; i <= 12 ; i++) {
            password += caracteres.charAt(aleatorio.nextInt(0, caracteres.length() - 1)); //Concatenar char en string, si no se pone el += daría error
        }
        System.out.println(password);
    }
}
