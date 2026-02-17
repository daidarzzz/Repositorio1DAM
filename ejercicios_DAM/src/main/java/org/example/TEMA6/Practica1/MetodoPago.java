package org.example.TEMA6.Practica1;


/**
 *
 * @author david
 * @version 1.0
 *
 * Clase abstracta que sirve como "plantilla" para todos los métodos de pago que usaremos (Tarjeta, PayPal, Bizum).
 *
 */
public abstract class MetodoPago {

    public MetodoPago() {

    }


    /**
     * Este método abstracto sirve para procesar un pago con el importe que se indica.
     * Cada hija hereda este método aplicando polimorfismo, cada una hará lo que necesite con el método.
     *
     * @param importe
     */
    public abstract void procesarPago(double importe);

}
