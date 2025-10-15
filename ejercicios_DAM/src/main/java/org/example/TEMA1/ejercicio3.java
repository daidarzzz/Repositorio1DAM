package org.example.TEMA1;

import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int num = 0;
        boolean bucle = true;
        do  {
            try {
                System.out.println("Introduce un número: ");
                num = read.nextInt();
                bucle = false;
            } catch (Exception e) {
                System.out.println("No has introducido un número entero.");
                read.next();
            }
        } while (bucle == true);
        if (num > 0) {
            System.out.println(num + " es positivo");
        }
        else if (num < 0) {
            System.out.println(num + " es negativo");
        }
        else {
            System.out.println("0 es un número natural");
        }
    }
}
