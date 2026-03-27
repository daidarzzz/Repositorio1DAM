package org.example.TEMA7.Lambdas.EJ1;

import org.example.TEMA7.Lambdas.Prueba;

public class Programa {

    static void main(String[] args) {

        Ejecutor ejecutor = (nota) -> {

            if (nota > 10) return false;
            else return true;

        };

        System.out.println(ejecutor.ejecutar(10));
        System.out.println(ejecutor.ejecutar(11));



    }

}
