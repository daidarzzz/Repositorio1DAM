package org.example.TEMA1.practicas;

import java.util.Scanner;

public class pasar_string_a_int {
    static void main() {
        Scanner read = new Scanner(System.in);
        int num;
        //int num2 = 0;

        System.out.printf("Introduce el multiplicando (3 cifras): ");
        num = read.nextInt();
        //System.out.printf("Introduce el multiplicador (3 cifras): ");
        // = read.nextInt();

        String numS = Integer.toString(num);

        //num1
        String numS1 = numS.substring(0,1);
        int num1 = Integer.parseInt(numS1);

        //num2
        String numS2 = numS.substring(1,2);
        int num2 = Integer.parseInt(numS2);

        //num3
        String numS3 = numS.substring(2,3);
        int num3 = Integer.parseInt(numS3);

        System.out.println("La primera cifra es " + num1);
        System.out.println("La primera cifra es " + num2);
        System.out.println("La primera cifra es " + num3);
    }
}
