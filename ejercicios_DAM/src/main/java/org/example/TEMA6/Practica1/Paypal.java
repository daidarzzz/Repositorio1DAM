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
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
    }

    public void validarPaypal(double pago) {

        boolean paypalValido = true;

        if (!cuenta.matches("")) paypalValido = false;
        else if (pago > saldo) paypalValido = false;
    }


}
