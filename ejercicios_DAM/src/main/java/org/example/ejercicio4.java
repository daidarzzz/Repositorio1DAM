package org.example;
import java.util.Scanner;
public class ejercicio4 {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int a = read.nextInt();
        System.out.println("Introduce el segundo número: ");
        int b = read.nextInt();
        System.out.println("Introduce el tercer número: ");
        int c = read.nextInt();
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