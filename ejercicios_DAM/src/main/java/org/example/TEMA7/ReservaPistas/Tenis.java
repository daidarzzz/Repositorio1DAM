package org.example.TEMA7.ReservaPistas;

public class Tenis extends Pista{

    private String superficie;

    public Tenis(String tipo, String superficie) {
        super(tipo);
        this.superficie = superficie;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "superficie='" + superficie + '\'' +
                '}';
    }
}
