package org.example.TEMA2;

import java.util.Random;

public class pruebaRANDOM {
    static void main() {
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10)+1; //Del 1 al 10
        System.out.println(numero);
        int numero2 = aleatorio.nextInt(5)+5; //Del 5 al 10
        System.out.println(numero2);
        int numero3 = aleatorio.nextInt(5,10); //Del 5 al 9
        System.out.println(numero3);

        double numero4 = aleatorio.nextDouble(); //Del 0 hasta 0.99999999
        System.out.println(numero4);

        double numero5 = aleatorio.nextDouble() *10 + 1; //Del 1 al 10
        System.out.println(numero5);

        int numero6 = (int) (aleatorio.nextDouble() *10 + 1); //Del 1 al 10 en entero
        System.out.println(numero6);

        double numero7 = Math.random() * 10 + 1;
        System.out.println(numero7);

        double numero8 = aleatorio.nextDouble(1,11);
        System.out.println(numero8);
    }
}
