package org.example;

import java.util.Scanner;

public class ejercicio2catch {
    static void main() {
        Scanner read = new Scanner(System.in);
        final double JORNADA = 40;
        try {
            System.out.println("¿Cúantas horas haces a la semana?");
            double horas = read.nextDouble();

            System.out.println("¿Cúanto cobras por hora");
            double tarifa = read.nextDouble();
            double salario;
            if (horas > JORNADA) {
                double horas_extra = (horas - JORNADA); //40
                double tarifa_extra = (tarifa * 1.5);
                salario = (JORNADA * tarifa) + (horas_extra * tarifa_extra);
                //double salario_extra = (horas_extra * tarifa_extra);
                //System:out.println("Salario (con extra): " + (salario_extra + JORNADA * tarifa) + "€");
            } else {
                salario = (horas * tarifa);
            }

            System.out.println("Cobras " + salario + "€ brutos a la semana");
        } catch (Exception e) {
            System.out.println("El formato introducido no es válido");
        }

    }
}