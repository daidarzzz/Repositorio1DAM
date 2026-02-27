package org.example.TEMA6.Practica2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Clase que representa a un jugador del barça
 * Hereda de BarcelonaFC
 *
 */
public class Jugador extends BarcelonaFC implements AccionesDeportivas{

    /**
     * Categoría a la que pertenece
     */
    private Equipos categoria;
    /**
     * El dorsal del jugador
     */
    private Integer dorsal;
    /**
     * La posición en la que juega
     */
    private Posiciones posicion;
    /**
     * Lista estática donde se añade a todos los jugadores del club
     */
    protected static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    /**
     * Constructor que crea un jugador, llama a setDorsal para
     * comprobar correctamente que el dorsal esté disponible
     * @param nombre el nombre del jugador
     * @param edad la edad del jugador
     * @param categoria la categoría del jugador
     * @param dorsal el dorsal del jugador
     * @param posicion la posición del jugador
     */
    public Jugador(String nombre, int edad, String categoria, Integer dorsal, String posicion) {
        super(nombre, edad);
        this.categoria = Equipos.valueOf(categoria.toUpperCase());
        this.posicion = Posiciones.valueOf(posicion.toUpperCase());
        setDorsal(dorsal);
    }

    /**
     * Método que sirve para mostrar a todos los jugadores
     */
    public static void mostrarListaJugadores() {
        System.out.println("JUGADORES:");
        int contadorJugadores = 1;
        for (Jugador jugador : listaJugadores) {
            System.out.println("[" + contadorJugadores++ + "]. " + jugador);
        }
    }

    /**
     * Sobrecarga realizaada al método mostrarListaJugadores, sirve para
     * que el método permita filtrar por categoría, mostrando solo los
     * jugadores de la categoría seleccionada
     * @param equipos categoría que quieres ver
     */
    public static void mostrarListaJugadores(Equipos equipos) {
        System.out.println("JUGADORES:");
        int contadorJugadores = 1;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getCategoria().equals(equipos)) System.out.println("[" + contadorJugadores++ + "]. " + jugador);
        }
    }

    /**
     * Método para que el jugador caliente
     */
    public void calentar() {
        System.out.println(nombre + " está calentando...");
    }
    /**
     * Método para que el jugador descanse
     */
    public void descansar() {
        System.out.println(nombre + " va a descansar...");
    }
    /**
     * Método para que el jugador marque gol
     */
    public void marcarGol() {
        System.out.println(nombre.toUpperCase() + " MARCÓ GOOOOOOOOOL");
    }

    /**
     * Método para que el jugador entrene
     */
    @Override
    public void entrenar() {
        System.out.println(nombre + " está entrenando muy duro");
    }
    /**
     * Método para que el jugador juegue el partido contra el rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println(nombre + " va a jugar contra " + rival);
    }

    /**
     * Método para saber en qué categoría juega
     * @return la categoría a la que pertenece
     */
    public Equipos getCategoria() {
        return categoria;
    }

    /**
     * Método para cambiar la categoría en la que juega
     * @param categoria la nueva categoría
     */
    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    /**
     * Método para saber cual es el dorsal del jugador
     * @return devuelve el dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Método que establece el dorsal del jugador
     * Este método comprueba que estás asignando al jugador
     * un dorsal que no está siendo utilizado en la misma categoría.
     * En caso de que esté siendo usado, llamará a la excepción personalizada
     * "DorsalExistente", y no se creará el jugador. En caso contrario,
     *  se aplicará el dorsal correctamente y el jugador será creado
     *  (será añadido a las dos listas que tiene).
     *  Además, este método también sirve para modificar el dorsal de un
     *  jugador que ya tenía un número.
     * @param dorsal el nuevo dorsal a asignar al jugador
     */
    public void setDorsal(Integer dorsal) {
        boolean crearJugador = true;
        try {
            if (listaJugadores.size() == 0) {
                listaJugadores.add(this);
                listaPersonas.add(this);
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
            listaPersonas.add(this);
        }

    }

    /**
     * Para saber la posición en la que juega
     * @return devuelve la posición
     */
    public Posiciones getPosicion() {
        return posicion;
    }

    /**
     * Método para cambiar la posición en la que juega
     * @param posicion la nueva posición
     */
    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    /**
     * ToString base
     * @return devuelve los atributos del jugador
     */
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

    /**
     * Método para que el jugador se concentre
     */
    @Override
    public void concentrarse() {
        System.out.println("El jugador " + nombre + " está muy concentrado");
    }
    /**
     * Método para que el jugador viaje con su equipo
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + nombre + " va a viajar con el equipo " + categoria + " a " + ciudad);
    }
    /**
     * Método para que el jugador celebre un golazo
     */
    @Override
    public void celebrarGol() {
        System.out.println(nombre.toUpperCase() + " ESTÁ CELEBRANDO EL GOLAZOOOO DEL EQUIPO");
    }
}
