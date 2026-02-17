package org.example.TEMA6.Practica1;

import java.util.Arrays;

public class Tarjeta extends MetodoPago{

    final String[] tiposTarjeta = {"VISA", "MASTERCARD", "MAESTRO"};

    private String nro_tarjeta;
    private String tipo;


    public Tarjeta(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
        System.out.println("Pago aceptado, muchas gracias.");
    }

    public boolean validarTarjeta() {

        boolean tarjetaValida = true;

        if (nro_tarjeta == null || !nro_tarjeta.matches("\\d{16}")) tarjetaValida = false;
        if (!Arrays.asList(tiposTarjeta).contains(tipo.toUpperCase())) tarjetaValida = false;

        return tarjetaValida;
    }
}
