package org.example.TEMA6.Excepciones.Cajero;

import java.util.Scanner;

public class AppBanco {
    static Scanner read = new Scanner(System.in);
    static CuentaBancaria cuenta = new CuentaBancaria(100);
    static boolean seguir = true;
    static void main(String[] args) {

        menu();

    }

    public static void opciones(char op) {

        switch (op) {

            case '1':
                System.out.println("Saldo disponible: " + cuenta.consultarSaldo() + "€");
                break;
            case '2':
                System.out.print("Introduce el importe a ingresar: ");
                double importe = read.nextDouble();
                cuenta.ingresarDinero(importe);
                System.out.println("Dinero ingresado con éxito. Saldo actual: " + cuenta.getSaldo() + "€");
                break;
            case '3':
                System.out.print("Introduce el importe a retirar: ");
                double importe2 = read.nextDouble();
                cuenta.retirarDinero(importe2);
                System.out.println("Dinero retirado con éxito. Saldo actual: " + cuenta.getSaldo() + "€");
                break;
            case 'X':
            case 'x':
                seguir = false;
                break;
            default:
                System.out.println("Opción no contemplada.");
                break;
        }
    }

    public static void menu() {
        while (seguir) {
            System.out.println("=== CAJERO AUTOMÁTICO ===");
            System.out.println();
            System.out.println("[1]. Consultar saldo");
            System.out.println("[2]. Ingresar dinero");
            System.out.println("[3]. Retirar dinero");
            System.out.println("[X]. Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");
            char opcion = read.next().charAt(0);

            opciones(opcion);
        }

    }

}
