package org.example.TEMA6.CARREFOUR;

import java.util.Scanner;

public class Cajero extends Persona{

    static Scanner read = new Scanner(System.in);

    private int caja;

    public Cajero(int codigo, String nombre, double sueldo) {
        super(codigo, nombre, sueldo);
        setCaja();
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja() {

        System.out.print("Introduce tu caja registradora: ");
        caja = read.nextInt();
        read.nextLine();
    }


    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Cajero que trabaja en la caja " + caja);

    }

    @Override
    public void trabajar() {
        System.out.println("Cobrando a un cliente...");
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "caja=" + caja +
                '}';
    }
}
