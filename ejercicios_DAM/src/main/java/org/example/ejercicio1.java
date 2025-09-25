package org.example;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cúantas horas haces al mes?");
        int horas = read.nextInt();

        System.out.println("¿Cúanto cobras por hora");
        int tarifa = read.nextInt();

        int salario = (horas * tarifa);

        System.out.println("Cobras " + salario + " brutos al mes");


    }
}

