package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class pruebaexamen {
    Scanner read = new Scanner(System.in);
    public void ejercicio1() {
        boolean bucle = true;
        int num = 0;
        do {
            try {
                System.out.println("Introduce un número: ");
                num = read.nextInt();
                bucle = false;
            } catch (Exception e) {
                System.out.println("ERROR. Introduce un valor válido.");
                read.nextLine();
            }
        } while (bucle);
        if (num < 0) {
            num = num * (-1);
        }
        System.out.println("El valor absoluto es " + num);

    }


    public void ejercicio2() {
        System.out.println("Introduce tu nombre: ");
        String nombre = read.nextLine();
        System.out.println("La obra de " + nombre);
        System.out.println("Introduce el ancho de la pared: ");
        int ancho_pared = read.nextInt();

        System.out.println("Introduce el largo de la pared: ");
        int largo_pared = read.nextInt();

        System.out.println("Introduce el ancho del azulejo: ");
        int ancho_azulejo = read.nextInt();

        System.out.println("Introduce el largo del azulejo: ");
        int largo_azulejo = read.nextInt();
        int total_azulejo = (ancho_azulejo + largo_azulejo);
        int total_pared = (ancho_pared + largo_pared);
        if (ancho_azulejo == largo_azulejo) {
            System.out.println("El azulejo no puede ser cuadrado.");
        }
        else if (total_azulejo > total_pared) {
            System.out.println("El azulejo no puede ser más grande que la pared.");
        }
        else {
            double azulejos_necesarios = ((ancho_pared / ancho_azulejo) * (largo_pared / largo_azulejo) );
            System.out.println("Se necesitan " + azulejos_necesarios + " azulejos.");
        }

    }


    public static void main(String[] args) {
        pruebaexamen ex = new pruebaexamen();
        ex.ejercicio1();
        //ex.ejercicio2();
    }
}