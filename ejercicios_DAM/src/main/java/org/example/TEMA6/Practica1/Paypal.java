package org.example.TEMA6.Practica1;

/**
 *
 * Esta clase hija de MetodoPago sirve para realizar pagos mediante PayPal.
 * Procesa los pagos con la cuenta de PayPal y verifica que esta sea correcta.
 * El saldo por defecto será de 50.
 *
 * @author david
 * @version 1.6
 *
 */
public class Paypal extends MetodoPago{

    /**
     *
     * Atributos de PayPal (La cuenta y el saldo)
     *
     */
    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {

        this.cuenta = cuenta;
        saldo = 50;

    }

    /**
     *
     * Procesa el pago usando PayPal
     * Este método comprueba que el saldo sea suficiente, llamando a un método que te lo dice.
     * En caso de que haya suficiente saldo para pagar el importe, se procesará el pago,
     * en caso contrario, te indicará que te falta saldo.
     * @param importe cantidad a pagar
     */
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


    /**
     *
     * Método que valida que la cuenta de paypal cumpla con el formato de correo
     * requerido ("xxx@xxx.com").
     * La validación del saldoSuficiente se realizará al procesar el pago.
     * @return devuelve true si la cuetna es válida y false si no lo es
     */
    public boolean validarPaypal() {

        return cuenta.matches(".+@.+\\.com");

    }

    /**
     *
     * Método que utilizará procesar pago para comprobar que el saldo sea suficiente para realizar la operación
     * En caso de que el importe sea mayor que el saldo, devolverá false, de lo contrario devolverá true.
     *
     * @param importe cantidad a pagar
     * @return devuelve true si el saldo es mayor o igual al importe, false en caso contrario
     */
    public boolean saldoSuficiente(double importe) {
        if (importe > saldo) return false;
        else {
            return true;
        }
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
