package org.example.TEMA6.Practica2;

/**
 * Clase que representa a un masajista del barça
 * Hereda de BarcelonaFC e implementa su interfaz
 */
public class Masajista extends BarcelonaFC {

    /**
     * La titulación que tiene el masajista
     */
    private String titulacion;
    /**
     * Los años de experiencia
     */
    private int anosExperiencia;

    /**
     * Constructor que crea un masajista y lo añade a la lista de personas
     *
     * @param nombre Nombre del masajista
     * @param edad su edad
     * @param titulacion la titulación del masajista
     * @param anosExperiencia sus años de experiencia
     */
    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
        listaPersonas.add(this);
    }


    /**
     * Dar masaje a un jugador en concreto
     * @param jugador el jugador que recibe el masaje
     */
    public void darMasaje(Jugador jugador) {
        System.out.println( nombre +" está dándole un masaje a " + jugador.nombre);
    }

    /**
     * Método para saber la titulación del masajista
     * @return devuelve la titulación
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * Cambia de titulación
     * @param titulacion la nueva titulación
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * Método para saber cuantos años de experiencia tiene
     * @return devuelve sus años de experiencia
     */
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    /**
     * Método para cambiar sus años de experiencia
     * @param anosExperiencia los años de experiencia actuales
     */
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    /**
     * ToString base
     * @return devuelve los datos del masajista
     */
    @Override
    public String toString() {
        return "Masajista{" +
                "anosExperiencia=" + anosExperiencia +
                ", titulacion='" + titulacion + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * Masajista concentrandose en el masaje
     */
    @Override
    public void concentrarse() {
        System.out.println("El masajista " + nombre + " está muy concentrado en el masaje");
    }

    /**
     * Masajista viajando con el equipo
     * @param ciudad ciudad a la que viajan
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + nombre + " va a viajar con el equipo a " + ciudad);
    }

    /**
     * Masajista celebrando un GOLAZO
     */
    @Override
    public void celebrarGol() {
        System.out.println("EL MASAJISTA " +nombre.toUpperCase() + " CELEBRA EL GOLAZO DE SU EQUIPOOO");
    }
}
