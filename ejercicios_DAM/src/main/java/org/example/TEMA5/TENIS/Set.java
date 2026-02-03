package org.example.TEMA5.TENIS;

public class Set {

    private int puntosJ1;
    private int puntosJ2;

    public Set(int puntosJ1, int puntosJ2) {
        this.puntosJ1 = puntosJ1;
        this.puntosJ2 = puntosJ2;
    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }

    @Override
    public String toString() {
        return "Set{" +
                "puntosJ1=" + puntosJ1 +
                ", puntosJ2=" + puntosJ2 +
                '}';
    }
}
