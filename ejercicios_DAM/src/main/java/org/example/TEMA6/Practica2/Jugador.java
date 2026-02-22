package org.example.TEMA6.Practica2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Jugador extends BarcelonaFC implements AccionesDeportivas{

    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;
    private static ArrayList<Integer> listaDorsales = new ArrayList<>();
    public Jugador(String nombre, int edad, String categoria, Integer dorsal, String posicion) {
        super(nombre, edad);
        this.categoria = Equipos.valueOf(categoria.toUpperCase());
        setDorsal(dorsal);
        this.posicion = Posiciones.valueOf(posicion.toUpperCase());
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
        try {
            if (listaDorsales.contains(dorsal)) {
                throw new DorsalExistente("No puede haber más de un jugador con el mismo dorsal (" + nombre + " tiene un dorsal ya asignado a otro)");
            } else {
                this.dorsal = dorsal;
                listaDorsales.add(dorsal);
            }
        } catch (DorsalExistente e) {
            System.out.println(e.getMessage());
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
        throw new DorsalExistente("No puedes tener más de un jugador con el mismo dorsal");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + nombre + " va a viajar con el equipo a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre.toUpperCase() + " ESTÁ CELEBRANDO EL GOLAZOOOO DEL EQUIPO");
    }
}
