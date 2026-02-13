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

    public boolean validarPaypal() {

        if (!cuenta.equals("falso")) return true;
        else return false;

        //if (!cuenta.matches("")) paypalValido = false;

    }

    public boolean saldoSuficiente() {

        System.out.println("Introduce el importe: ");
        double importe = Tienda.read.nextDouble();

        if (importe > saldo) return false;
        else {
            return true;
        }
    }


}
