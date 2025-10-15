package org.example.TEMA1;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuántas horas haces a la semana?");
        double horas = read.nextDouble();

        System.out.println("¿Cuánto cobras por hora");
        double tarifa = read.nextDouble();

        double salario = (horas * tarifa);

        System.out.println("Cobras " + salario + " brutos a la semana");


    }
}

