package org.example.TEMA6.Practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Esta clase se encarga de gestionar toda la lógica, aquí se crean los objetos
 * de los métodos de pago, se pide al usuario que introduzca parámetros, etc.
 *
 * No cuenta con atributos, solo tiene métodos.
 *
 * @author david
 * @version 1.3
 */
public class Tienda {

    public static Scanner read = new Scanner(System.in);


    /**
     *
     * Primer método que utilizará la AppEcommerce, te pregunta cuál es el método que
     * vas a utilizar para el pago. Al introducirlo, pasas al método "switchMetodos".
     *
     */
    public static void iniciarPago() {
        System.out.println("¿Qué método de pago quieres usar? [Bizum, PayPal, Tarjeta]");
        String metodo = read.next();
        metodo = metodo.toLowerCase();
        switchMetodos(metodo);
    }

    /**
     *
     * Solicita al usuario que introduzca el importe de la operación
     * Después, llama a procesarPago para continuar con el pago.
     * @param metodo el metodo utilizado
     */
    public static void realizarPago(MetodoPago metodo) {
        System.out.println("Introduce el importe a pagar: ");
        double importe = read.nextDouble();

        metodo.procesarPago(importe);
    }

    /**
     *
     * Gestiona la lógica que tendrá cada método de pago elegido,
     * cada método hará ciertas cosas, por ejemplo, en paypal te
     * pedirá la cuenta, en tarjeta el número de la tarjeta, etc.
     *
     * Con cada método de pago, se llama a la función "validar" de
     * cada método específico, para comprobar que has introducido
     * correctamente los datos, en caso de ser así, se procederá a
     * llamar al método "realizarPago", donde se completará el mismo.
     *
     * @param metodo el metodo utilizado por el usuario
     */
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
                    realizarPago(paypal);
                }
                break;
            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta: ");
                String numTarjeta = "";
                numTarjeta = read.next();
                read.nextLine();
                System.out.println("Selecciona el tipo de tarjeta [VISA, MASTERCARD, MAESTRO]");
                String tipo = read.next();
                Tarjeta tarjeta = new Tarjeta(numTarjeta, tipo);
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
