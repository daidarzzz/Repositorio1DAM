package org.example;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cúantas horas haces a la semana?");
        int horas = read.nextInt();

        System.out.println("¿Cúanto cobras por hora");
        double tarifa = read.nextDouble();
        double salario;
        if (horas > 40) {
            int horas_extra = (horas-40);
            double tarifa_extra = (tarifa * 1.5);
            salario = (40*tarifa) + (horas_extra*tarifa_extra);
        }
        else {
            salario = (horas * tarifa);
        }

        System.out.println("Cobras " + salario + "€ brutos a la semana");


    }
}
