package org.example.TEMA6.CARREFOUR;

import java.util.Scanner;

public class Reponedor extends Persona{
    static Scanner read = new Scanner(System.in);

    private String pasillo;

    public Reponedor(int codigo, String nombre, double sueldo) {
        super(codigo, nombre, sueldo);
        setPasillo();
    }


    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo() {

        System.out.print("Introduce el pasillo de " + super.getNombre() + ": ");
        String pasillo = read.next();
        this.pasillo = pasillo;
        read.nextLine();
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Pasillo del reponedor: " + pasillo);

    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo=" + pasillo +
                '}';
    }
}
