package org.example.TEMA6.Excepciones;

import java.util.Scanner;

public class AppBanco {
    static Scanner read = new Scanner(System.in);
    static CuentaBancaria cuenta = new CuentaBancaria(100);

    static void main(String[] args) {

        menu();

    }

    public static boolean opciones(char op) {

        switch (op) {

            case '1':
                System.out.println("Saldo disponible: " + cuenta.consultarSaldo() + "€");
                return true;
            case '2':
                System.out.print("Introduce el importe a ingresar: ");
                double importe = read.nextDouble();
                cuenta.ingresarDinero(importe);
                System.out.println("Dinero ingresado con éxito. Saldo actual: " + cuenta.getSaldo());
                return true;
            case '3':
                System.out.print("Introduce el importe a retirar: ");
                double importe2 = read.nextDouble();
                cuenta.ingresarDinero(importe2);
                System.out.println("Dinero retirado con éxito. Saldo actual: " + cuenta.getSaldo());
                return true;
            case 'X':
            case 'x':
                return false;
        }
        return false;
    }

    public static void menu() {
        while (true) {
            System.out.println("=== CAJERO AUTOMÁTICO ===");
            System.out.println();
            System.out.println("[1]. Consultar saldo");
            System.out.println("[2]. Ingresar dinero");
            System.out.println("[3]. Retirar dinero");
            System.out.println("[X]. Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");
            char opcion = read.next().charAt(0);

            boolean seguir = opciones(opcion);
            if (!seguir) break;
        }

    }

}
