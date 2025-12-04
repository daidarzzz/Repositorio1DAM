package org.example.TEMA4.BateriaDeEjercicios;

import org.example.TEMA4.Prefabs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner read = new Scanner(System.in);

    


    static void main(String[] args) {

        double[] array = new double[6];
        recaudacionSemanal(array);

        System.out.print(masVentas(array) + " ");
        System.out.print(menosVentas(array) + " ");

        double mediaSemanal = mediaSemanal(array);

        recaudacionDomingo(mediaSemanal, array);



    }

    public static void recaudacionSemanal (double[] array) {

        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = read.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Número introducido inválido.");
                return;
            }
        }
    }

    public static String masVentas (double[] array) {
        double mayor = array[0];
        int posicion_mayor = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
                posicion_mayor = i;
            }
        }
        String dia = "";
        dia = switchDia(posicion_mayor);
        return dia;
    }

    public static String menosVentas (double[] array) {
        double menor = array[0];
        int posicion_menor = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
                posicion_menor = i;
            }
        }
        String dia = "";
        dia = switchDia(posicion_menor);
        return dia;
    }

    public static String switchDia (int posicion) {
        String dia = "";
        switch (posicion) {
            case 0:
                dia = "MARTES";
                break;
            case 1:
                dia = "MIERCOLES";
                break;
            case 2:
                dia = "JUEVES";
                break;
            case 3:
                dia = "VIERNES";
                break;
            case 4:
                dia = "SABADO";
                break;
            case 5:
                dia = "DOMINGO";
                break;
        }
        return dia;
    }

    public static double mediaSemanal (double[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }

        return (media / array.length);
    }

    public static void recaudacionDomingo (double mediaSemanal, double[] array) {
        if (array[array.length-1] > mediaSemanal) {
            System.out.print("SI");
        } else System.out.println("NO");;
    }

}
