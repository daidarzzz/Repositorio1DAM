package org.example.TEMA6.Practica1;

import java.util.Random;

public class Bizum extends MetodoPago{
    static Random aleatorio = new Random();

    private String telefono;
    private int pin;

    public Bizum(String telefono) {

        this.telefono = telefono;
        generarPin();

    }

    private void generarPin() {
        String pin = "";
        for (int i = 0; i < 6; i++) {
            pin = pin + aleatorio.nextInt(0,10);
        }
        this.pin = Integer.parseInt(pin);
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum");
    }

    public boolean validarBizum(int pin) {

        //if (!telefono.matches("")) return false;
        if (pin != this.pin) return false;
        return true;

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
