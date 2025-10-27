package org.example.TEMA2.preexamen;

public class ejercicio3 {
    static void main() {
        int pago_mes = 10;
        final int MESES = 20;
        int total = 0;
        for (int i = 1 ; i <= 20 ; i++) {
            System.out.println("Mes " + i + ": " + pago_mes);
            total += pago_mes;
            pago_mes *= 2;

        }
        System.out.println("Total a pagar: " + total);
    }
}
