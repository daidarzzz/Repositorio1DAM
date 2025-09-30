package org.example;

import java.util.Scanner;

public class ejercicio5catch {
    static void main() {
        Scanner read = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int resultado = 0;
        boolean bucle = true;
        do {
            try {
                System.out.println("Introduce el primer número: ");
                a = read.nextInt();

                System.out.println("Introduce el segundo número: ");
                b = read.nextInt();

                bucle = false;
            } catch (Exception e) {
                System.out.println("El formato introducido no es correcto.");
            }
            read.nextLine();
        } while (bucle == true); // lo mismo es poner (bucle);


        try {
            resultado = (a / b);
            System.out.println("El resultado de la división es " + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir entre 0.");
        }

    }
}
