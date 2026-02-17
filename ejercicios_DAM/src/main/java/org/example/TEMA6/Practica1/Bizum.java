package org.example.TEMA6.Practica1;

import java.util.Random;

/**
 *
 * Clase hija de MetodoPago que sirve para pagar con Bizum
 * Al crear un bizum se genera un pin automáticamente
 * de 6 dígitos para la cuenta.
 *
 * @author david
 * @version 1.2
 */
public class Bizum extends MetodoPago{
    static Random aleatorio = new Random();

    /**
     * Atributos teléfono (debe ser de 9 dígitos) y pin (generado automáticamente)
     *
     */
    private String telefono;
    private int pin;

    public Bizum(String telefono) {

        this.telefono = telefono;
        generarPin();

    }

    /**
     *
     * Método que genera un pin de forma aleatoria de 6 dígitos
     * Se evitará el número 0 para que no haya problemas de formato
     * (Por ejemplo, si el primer número fuese 0, este desaparecería
     * al convertirlo a int).
     *
     */
    private void generarPin() {
        String pin = "";
        for (int i = 0; i < 6; i++) {
            pin = pin + aleatorio.nextInt(1,10);
        }
        this.pin = Integer.parseInt(pin);
    }


    /**
     * Procesa el pago con Bizum mostrando por consola el importe pagado.
     * @param importe cantida a pagar
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum");
        System.out.println("Pago aceptado, muchas gracias.");
    }


    /**
     *
     * Comprueba que el pin introducido por el usuario es correcto (igual al pin original)
     * y que el número de teléfono tiene 9 dígitos.
     *
     * @param pin el pin que introdujo el usuario
     * @return devuelve true si el pin y el teléfono tienen el formato correcto, sino, devuelve false
     */
    public boolean validarBizum(int pin) {

        if (!telefono.matches("\\d{9}")) return false;
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
