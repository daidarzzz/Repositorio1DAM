package org.example.TEMA6.Interfaces;

public class Superman extends Superheore implements Volador, Ataques{

    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a los malos.");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Disparando láser por los ojos!!");
    }

    @Override
    public void alientoHielo() {
        System.out.println("Escupiendo hielos!!!");
    }

}
