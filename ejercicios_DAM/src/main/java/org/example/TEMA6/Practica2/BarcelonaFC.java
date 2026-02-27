package org.example.TEMA6.Practica2;

import org.example.TEMA5.Persona;

import java.util.ArrayList;

/**
 * Clase madre y abstracta que sirve como "base" para todas
 * las personas del club
 * Implementa la interfaz FuncionesIntegrantes
 *
 */
public abstract class BarcelonaFC implements FuncionesIntegrantes{

    /**
     * Lista estática de personas, aquí se añade a todas las personas creadas
     * permitiendo realizar métodos y consultar ciertas cosas de forma mucho
     * más sencilla
     */
    protected static ArrayList<BarcelonaFC> listaPersonas = new ArrayList<>();
    /**
     * Nombre de la persona
     */
    protected String nombre;
    /**
     * Edad de la persona
     */
    protected int edad;

    /**
     * Constructor básico que recibe como parámetros todos sus atributos y los iguala a
     * los del objeto
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     */
    public BarcelonaFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para saber cual es el nombre de la persona
     * @return devuelve su nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Método para cambiar el nombre de una persona
     * @param nombre el nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para saber la edad de una persona
     * @return devuelve la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para cambiar la edad de una persona
     * @param edad nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * ToString base
     * @return devuelve sus atributos
     */
    @Override
    public String toString() {
        return "BarcelonaFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
