package org.example.TEMA6.Practica2;

import java.util.Scanner;

public class Prueba {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String formacionPreferida = read.next();
        if (formacionPreferida.matches("\\d-\\d-\\d")) {
            System.out.println("Valido");
        }else {
            System.out.println("Invalido");
        }

    }

}
