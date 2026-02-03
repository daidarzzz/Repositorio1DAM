package org.example.TEMA5.TENIS;

import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partido (Jugador j1, Jugador j2) {

        jugador1 = j1;
        jugador2 = j2;
        j1.setRival(j2);
        j2.setRival(j1);
        listaSets = new ArrayList<>();

    }

    public void insertarSet(int puntosJ1, int puntosJ2) {
        Set nuevo = new Set(puntosJ1, puntosJ2);

        if (puntosJ1 > 7 || puntosJ2 > 7) System.out.println("Set no válido");
        else if (validarTieBreak(puntosJ1, puntosJ2) || validarSet(puntosJ1, puntosJ2)) listaSets.add(nuevo);
        else System.out.println("Set no válido.");
    }

    private boolean validarTieBreak(int p1, int p2) {
        int mayor = 0;
        int menor = 0;
        if (p1 > p2) {
            mayor = p1;
            menor = p2;
        } else {
            mayor = p2;
            menor = p1;
        }

        if (mayor == 7) {

            if (menor != 6 && menor != 5) {
                System.out.println("Error de puntuación.");
            }
            return true;
        }
        return false;
    }

    private boolean validarSet(int p1, int p2) {
        if (p1 == p2) {
            return false;
        }
        if (p1 == 6 || p2 == 6) {

            if (p1 >= 0 && p2 >= 0) return true;

        }
        return false;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaSets() {
        return listaSets;
    }

    public void setListaSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }



    @Override
    public String toString() {
        return "Partido{" +
                "jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                ", listaSets=" + listaSets +
                '}';
    }
}
