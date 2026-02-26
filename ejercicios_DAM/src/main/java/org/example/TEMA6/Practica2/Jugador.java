package org.example.TEMA6.Practica2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Jugador extends BarcelonaFC implements AccionesDeportivas{

    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;
    protected static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    public Jugador(String nombre, int edad, String categoria, Integer dorsal, String posicion) {
        super(nombre, edad);
        this.categoria = Equipos.valueOf(categoria.toUpperCase());
        this.posicion = Posiciones.valueOf(posicion.toUpperCase());
        setDorsal(dorsal);
    }

    public static void mostrarListaJugadores() {
        System.out.println("JUGADORES:");
        int contadorJugadores = 1;
        for (Jugador jugador : listaJugadores) {
            System.out.println("[" + contadorJugadores++ + "]. " + jugador);
        }
    }

    public static void mostrarListaJugadores(Equipos equipos) {
        System.out.println("JUGADORES:");
        int contadorJugadores = 1;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getCategoria().equals(equipos)) System.out.println("[" + contadorJugadores++ + "]. " + jugador);
        }
    }

    public void calentar() {
        System.out.println(nombre + " está calentando...");
    }
    public void descansar() {
        System.out.println(nombre + " va a descansar...");
    }
    public void marcarGol() {
        System.out.println(nombre.toUpperCase() + " MARCÓ GOOOOOOOOOL");
    }
    @Override
    public void entrenar() {
        System.out.println(nombre + " está entrenando muy duro");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(nombre + " va a jugar contra " + rival);
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        boolean crearJugador = true;
        try {
            if (listaJugadores.size() == 0) {
                listaJugadores.add(this);
                crearJugador = false;
            }
            for (Jugador jugador : listaJugadores) {
                if (jugador == this) continue;
                if (jugador.getCategoria() == this.categoria && jugador.getDorsal() == dorsal) {
                    throw new DorsalExistente("Ya hay un jugador de la categoría " + categoria + " con ese dorsal");
                }
            }
            this.dorsal = dorsal;
        } catch (DorsalExistente e) {
            System.out.println(e.getMessage());
            crearJugador = false;
        }
        if (crearJugador && !listaJugadores.contains(this)) {
            listaJugadores.add(this);
        }

    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion=" + posicion +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + nombre + " está muy concentrado");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + nombre + " va a viajar con el equipo " + categoria + " a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre.toUpperCase() + " ESTÁ CELEBRANDO EL GOLAZOOOO DEL EQUIPO");
    }
}
