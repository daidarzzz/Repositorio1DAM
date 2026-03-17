package org.example.TEMA7.ReservaPistas;

public class Padel extends Pista {

    private String paredes;


    public Padel(String tipo, String paredes) {
        super(tipo);
        this.paredes = paredes;
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Padel{" +
                "paredes='" + paredes + '\'' +
                '}';
    }
}
