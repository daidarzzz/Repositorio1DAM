package org.example.TEMA6.Practica2;

/**
 *
 * Clase acompañante que hereda de BarcelonaFC y cuenta con métodos y atributos propios.
 *
 */
public class Acompanyante extends BarcelonaFC{

    /**
     * Jugador que acompaña
     */
    private Jugador integrante;
    /**
     * Parentesco con el jugador
     */
    private String parentesco;

    /**
     *Constructor que crea un acompañante y después lo añade a la lista de personas
     * @param nombre nombre del acompañante
     * @param edad su edad
     * @param integrante el integrante que acompaña
     * @param parentesco su parentesco con el integrante
     */
    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
        listaPersonas.add(this);
    }

    /**
     * Con este método anima al equipo del jugador que acompaña
     */
    public void animarEquipo() {
        System.out.println("¡¡¡ANIMANDO AL EQUIPO DE " + integrante.nombre + "!!!");
    }

    /**
     * Get del integrante
     * @return devuelve el integrante
     */
    public Jugador getIntegrante() {
        return integrante;
    }

    /**
     * set del integrante, sirve para cambiar al integrante al que acompaña
     * @param integrante el integrante que vas a añadirle
     */
    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    /**
     * Método set para devolver el parentesco
     * @return Devuelve su parentesco
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Cambiar el parentesco con su acompañante
     * @param parentesco el nuevo parentesco
     */
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * ToString base
     * @return devuelve los datos del acompañante
     */
    @Override
    public String toString() {
        return "Acompanyante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    /**
     * El acompañante se concentra
     */
    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + nombre + " se está concentrando para apoyar a su integrante (" + integrante.nombre + ")");
    }

    /**
     * Acompañante viaja a la ciudad a la que va el equipo
     * @param ciudad ciudad a la que viaja
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + nombre + " va a viajar");
    }

    /**
     * Celebra el gol del equipo
     */
    @Override
    public void celebrarGol() {
        System.out.println("EL ACOMPAÑANTE " + nombre.toUpperCase() + " CELEBRA EL GOLAAAZOOOOO");
    }
}
