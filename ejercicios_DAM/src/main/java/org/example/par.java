package org.example;

import java.util.Scanner;

public class par {
    static void main() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = read.nextInt();
        if (a % 2 == 0) System.out.println(a + " es par");
        else System.out.println(a + " es impar");
    }
}
