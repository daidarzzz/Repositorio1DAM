package org.example.TEMA4.BateriaDeEjercicios;

import org.example.TEMA4.Prefabs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author David
 * @version 1.0
 */
public class Ejercicio4 {

    static Scanner read = new Scanner(System.in);


    /**
     *
     * @param args
     */
    static void main(String[] args) {

        double[] array = new double[6];
        recaudacionSemanal(array);

        System.out.print(masVentas(array) + " ");
        System.out.print(menosVentas(array) + " ");

        double mediaSemanal = mediaSemanal(array);

        recaudacionDomingo(mediaSemanal, array);



    }

    /**
     * @author David
     * @param array rellena el array de la recaudación general
     * @version 1.0
     *Método para introducir las ganancias diarias de un bar
     */
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

    /**
     * @param array recibe un vector con las ventas diarias de martes a domingo
     * Método que calcúla qué día se han tenido más ventas.
     * @return  devuelve el dia de la semana con más ventas
     */
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
