package org.example.TEMA2.randomEjercicios;

import java.util.Random;

public class ejercicio4 {
    static void main() {
        Random aleatorio = new Random();

        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";
        int longitud_password = aleatorio.nextInt(8, 13);

        for (int i = 1 ; i <= longitud_password ; i++) {
            if (password.length() == longitud_password) {
                break;
            }
            if (i == 1) {
                password += caracter.substring(0,26).charAt(aleatorio.nextInt(0, caracter.substring(0,25).length() - 1)); //Concatenar char en string, si no se pone el += daría error
                password += caracter.substring(26,52).charAt(aleatorio.nextInt(0, caracter.substring(26,52).length() - 1)); //Concatenar char en string, si no se pone el += daría error
                password += caracter.substring(52,62).charAt(aleatorio.nextInt(0, caracter.substring(52,62).length() - 1)); //Concatenar char en string, si no se pone el += daría error
            } else {
                int elegir = aleatorio.nextInt(0,4);
                if (elegir == 1) {
                    password += caracter.substring(0,26).charAt(aleatorio.nextInt(0, caracter.substring(0,25).length() - 1)); //Concatenar char en string, si no se pone el += daría error
                } else if (elegir == 2) {
                    password += caracter.substring(26,52).charAt(aleatorio.nextInt(0, caracter.substring(26,52).length() - 1)); //Concatenar char en string, si no se pone el += daría error
                } else {
                    password += caracter.substring(52,62 ).charAt(aleatorio.nextInt(0, caracter.substring(52,62).length() - 1)); //Concatenar char en string, si no se pone el += daría error
                }
            }

        }
        System.out.println(password);
    }
}