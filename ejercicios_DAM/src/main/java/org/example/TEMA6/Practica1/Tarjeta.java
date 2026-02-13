package org.example.TEMA6.Practica1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tarjeta extends MetodoPago{

    final String[] tiposTarjeta = {"VISA", "MASTERCARD", "MAESTRO"};

    private String nre_tarjeta;
    private String tipo;


    public Tarjeta(String nre_tarjeta, String tipo) {
        this.nre_tarjeta = nre_tarjeta;
        this.tipo = tipo;
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
    }

    public boolean validarTarjeta() {

        boolean tarjetaValida = true;

       // if (nre_tarjeta.length() != 16) tarjetaValida = false;
        if (nre_tarjeta.length() != 4) tarjetaValida = false;
        if (!Arrays.asList(tiposTarjeta).contains(tipo.toUpperCase())) tarjetaValida = false;

        return tarjetaValida;
    }
}
