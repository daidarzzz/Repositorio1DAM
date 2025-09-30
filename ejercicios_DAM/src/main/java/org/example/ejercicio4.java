package org.example;
import java.util.Scanner;
public class ejercicio4 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        boolean bucle = true;

        do {
            try {
                System.out.println("Introduce el primer número: ");
                a = read.nextInt();
                System.out.println("Introduce el segundo número: ");
                b = read.nextInt();
                System.out.println("Introduce el tercer número: ");
                c = read.nextInt();
                bucle = false;
            } catch (Exception e) {
                System.out.println("Formato introducido no válido");
            }
            read.nextLine();
        } while (bucle);


        if (a == b || a == c || b == c) {
            System.out.println("Hay números introducidos que son iguales.");
            return;
        }
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
    }
}