package org.example.TEMA5;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor() {
        canal = 1;
        volumen = 5;
    }

    public Televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void subirCanal() {

        if (canal == 100) {
            canal = 1;
        } else {
            canal++;
        }

        System.out.println("Canal cambiado a: " + canal);
    }

    public void bajarCanal() {
        if (canal == 1)  {
            canal = 100;
        }
        else {
            canal--;
        }
        System.out.println("Canal cambiado a: " + canal);
    }
}
