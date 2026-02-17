package org.example.TEMA6.Practica1;

import java.util.Arrays;

/**
 *
 * Esta clase hija de MetodoPago, sirve para realizar pagos mediante "Tarjeta de Crédito".
 * Tiene 3 tipos de tarjeta permitidos: VISA, MASTERCARD, MAESTRO.
 *
 * @author david
 * @version 1.5
 *
 */
public class Tarjeta extends MetodoPago{

    /**
     *
     * Tenemos un array con los tipos de tarjeta válidos
     * También tenemos los dos atributos de la tarjeta (Número de la tarjeta y tipo de tarjeta).
     *
     */
    final String[] tiposTarjeta = {"VISA", "MASTERCARD", "MAESTRO"};

    private String nro_tarjeta;
    private String tipo;


    public Tarjeta(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }


    /**
     *
     * Procesa el pago de la tarjeta de crédito, lo hace mostrando por consola el importe y la tarjeta que ha utilizado.
     * Este método sobreescribe el de la madre.
     * @param importe cantidad a pagar
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
        System.out.println("Pago aceptado, muchas gracias.");
    }

    /**
     *
     * Este método sirve para validar que los datos de la tarjeta sean correctos.
     * Comprueba que el número de la tarjeta sea de 16 dígito y que el tipo de tarjeta
     * esté entre los permitidos. Si cualquiera de las anteriores no se cumple, la tarjeta
     * será inválida.
     * @return devuelve true si la tarjeta es válida, false en caso contrario
     */

    public boolean validarTarjeta() {

        boolean tarjetaValida = true;

        if (nro_tarjeta == null || !nro_tarjeta.matches("\\d{16}")) tarjetaValida = false;
        if (!Arrays.asList(tiposTarjeta).contains(tipo.toUpperCase())) tarjetaValida = false;

        return tarjetaValida;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
