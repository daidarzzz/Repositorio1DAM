package org.example.TEMA6.Excepciones;

import java.util.Scanner;

public class CuentaBancaria {


    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad) {

        this.saldo += cantidad;

    }

    public double consultarSaldo() {

        return getSaldo();

    }

    public void retirarDinero(double cantidad) {
        this.saldo -= cantidad;
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
