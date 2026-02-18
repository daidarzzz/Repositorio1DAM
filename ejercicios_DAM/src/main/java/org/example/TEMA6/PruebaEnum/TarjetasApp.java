package org.example.TEMA6.PruebaEnum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TarjetasApp {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        Tarjetas tarjeta_tipo = Tarjetas.VISA;

        System.out.println(tarjeta_tipo.ordinal());

        System.out.println(tarjeta_tipo.name());

//        Tarjetas.values();
        System.out.println("Tipos de tarjetas");
        for (Tarjetas tarjeta : Tarjetas.values()) {
            System.out.println(tarjeta);
        }
        System.out.print("Introduce el tipo: ");
        Tarjetas tipo = Tarjetas.valueOf(read.next().toUpperCase());

        System.out.println("La tarjeta de tipo " + tipo.name() + " tiene una comisión de " + tipo.getComision() + "€");
    }

}
