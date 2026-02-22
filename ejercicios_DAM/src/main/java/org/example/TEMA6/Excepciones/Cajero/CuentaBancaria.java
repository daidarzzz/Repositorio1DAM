package org.example.TEMA6.Excepciones.Cajero;

public class CuentaBancaria {


    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad <= 0) {
            throw new ImporteMayor();
        }
        if (cantidad > 3000) {
            throw new DepositoMaximoException("No puedes ingresar más de 3000€");
        }
        this.saldo += cantidad;

    }

    public double consultarSaldo() {

        return getSaldo();

    }

    public void retirarDinero(double cantidad) {
        if (cantidad <= 0) {
            throw new ImporteMayor();
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("No puedes retirar más dinero que el saldo que tienes");
        }
        if (cantidad > 600) {
            throw new LimiteDiarioException("No puedes retirar más de 600€");
        }
        saldo -= cantidad;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
