package org.example.TEMA7.Lambdas.Ej2;

public class Programa {

    static void main(String[] args) {

        VerificadorVoto verificadorVoto = (nombre, edad) -> {
            System.out.print("Probando " + nombre + " con " + edad + " años... ");

            if (edad >= 18) return true;
            else return false;
        };

        boolean joa = verificadorVoto.puedeVotar("Joa", 14);
        System.out.print(joa);

        System.out.println();

        boolean manu = verificadorVoto.puedeVotar("Manu", 19);
        System.out.print(manu);

    }
}
