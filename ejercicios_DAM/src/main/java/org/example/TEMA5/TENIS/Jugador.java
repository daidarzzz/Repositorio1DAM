package org.example.TEMA5.TENIS;

public class Jugador {

    private String nombre;
    private int ranking;
    private Jugador rival;

    public Jugador (String nombre, int ranking) {

        this.nombre = nombre;
        this.ranking = ranking;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getRival() {
        return rival.nombre;
    }

    public void setRival(Jugador rival) {
        this.rival = rival;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", ranking=" + ranking +
                ", rival=" + rival.nombre +
                '}';
    }
}
