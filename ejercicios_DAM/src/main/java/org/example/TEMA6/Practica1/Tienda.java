package org.example.TEMA6.Practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {

    final private String[] tiposDeMetodos = {"bizum", "paypal", "tarjeta"};
    public static Scanner read = new Scanner(System.in);


    public static void iniciarPago() {
        System.out.println("¿Qué método de pago quieres usar? [Bizum, PayPal, Tarjeta]");
        String metodo = read.next();
        metodo = metodo.toLowerCase();
        switchMetodos(metodo);
    }

    public static void introducirImporte() {

//        System.out.println("Introduce el importe a pagar: ");
//        double importe = read.nextDouble();

    }

    public static void realizarPago(MetodoPago metodo) {
        System.out.println("Introduce el importe a pagar: ");
        double importe = read.nextDouble();

        metodo.procesarPago(importe);
        System.out.println("Pago aceptado, muchas gracias.");
    }

    private static void switchMetodos(String metodo) {



        switch (metodo) {

            case "paypal":
                System.out.println("Introduce tu cuenta de PayPal: ");
                String cuenta = read.next();
                Paypal paypal = new Paypal(cuenta);
                System.out.println("Validando cuenta de PayPal...");
                if (!paypal.validarPaypal()) System.out.println("Los datos de tu cuenta de PayPal no son correctos.");
                else {
                    System.out.println("Cuenta válida.");
                    if (!paypal.saldoSuficiente()) System.out.println("Tu cuenta no tiene saldo suficiente para esta operación.");
                    else {
                        realizarPago(paypal);
                    }
                }
                break;
            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta: ");
                int numTarjeta = 0;
                numTarjeta = read.nextInt();
                read.nextLine();
                System.out.println("Selecciona el tipo de tarjeta [VISA, MASTERCARD, MAESTRO]");
                String tipo = read.next();
                Tarjeta tarjeta = new Tarjeta(Integer.toString(numTarjeta), tipo);
                System.out.println("Validando tarjeta...");
                boolean tarjetaValida = tarjeta.validarTarjeta();
                if (!tarjetaValida) System.out.println("Los datos de tu tarjeta no son correctos.");
                else realizarPago(tarjeta);
                break;
            case "bizum":
                System.out.println("Introduce tu número de teléfono vinculado con bizum:");
                String num = read.next();
                Bizum bizum = new Bizum(num);
                System.out.println("Introduce tu pin: ");
                System.out.println("[pista] " + bizum.getPin());
                int pin = read.nextInt();
                boolean bizumValido = bizum.validarBizum(pin);
                System.out.println("Validando bizum...");
                if (!bizumValido) System.out.println("Los datos de tu Bizum no son correctos.");
                else realizarPago(bizum);
                break;
            default:
                System.out.println("El método de pago no existe.");

        }

    }
}
