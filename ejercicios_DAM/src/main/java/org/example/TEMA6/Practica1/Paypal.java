package org.example.TEMA6.Practica1;

public class Paypal extends MetodoPago{

    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {

        this.cuenta = cuenta;
        saldo = 50;

    }

    @Override
    public void procesarPago(double importe) {

        if (!saldoSuficiente(importe)) {
            System.out.println("Error. No cuentas con suficiente saldo para realizar la operación.");
        }
        else {
            System.out.println("Procesando pago de " + importe + "€ con PayPal");
            System.out.println("Pago aceptado, muchas gracias.");
        }

    }

    public boolean validarPaypal() {

        return cuenta.matches(".+@.+\\.com");

    }

    public boolean saldoSuficiente(double importe) {
        if (importe > saldo) return false;
        else {
            return true;
        }
    }


}
