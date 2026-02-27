package org.example.TEMA6.Practica2;

import java.sql.SQLOutput;

/**
 * Clase que representa a un entrenador del barça
 * Hereda de BarcelonaFC
 */
public class Entrenador extends BarcelonaFC implements AccionesDeportivas{

    /**
     * El equipo que entrena
     */
    private Equipos equipo;
    /**
     * Su formación preferida
     */
    private String formacionPreferida;

    /**
     * Constructor que crea un entrenador y lo añade a la lista de personas
     * También llama a setFormacionPreferida para asegurarnos de que la formación
     * sea correcta
     * @param nombre nombre del entrenador
     * @param edad edad del entrenador
     * @param equipo equipo que dirije
     * @param formacionPreferida su formación preferida
     */
    public Entrenador(String nombre, int edad, String equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = Equipos.valueOf(equipo.toUpperCase());
        setFormacionPreferida(formacionPreferida);
        listaPersonas.add(this);
    }

    /**
     * Método para planificar un entrenamiento
     */
    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + nombre + " está planficando el próximo entrenamiento de su equipo (" + equipo + ")");
    }

    /**
     * Método para realizar cambios
     */
    public void hacerCambios() {
        System.out.println("El entrenador " + nombre + " va a realizar cambios en su equipo (" + equipo + ")");
    }

    /**
     * Método para saber qué equipo dirije
     * @return el equipo que dirije
     */
    public Equipos getEquipo() {
        return equipo;
    }

    /**
     * Método para cambiar el equipo que dirije
     * @param equipo el nuevo equipo que dirige
     */
    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    /**
     * Para saber cual es su formación preferida
     * @return Te devuelve su formación preferida
     */
    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Método que coprueba que la formación tenga el formato correcto (N-N-N), en caso
     * contrario, la formación será NULL y saltará la excepción personalizada
     * "FormatoIncorrecto"
     * @param formacionPreferida
     */
    public void setFormacionPreferida(String formacionPreferida) {
        try {
            if (formacionPreferida.matches("\\d-\\d-\\d")) {
                this.formacionPreferida = formacionPreferida;
            } else {
                throw new FormatoIncorrecto("No has introducido el formato correcto (N-N-N)");
            }
        } catch (FormatoIncorrecto e) {
            System.out.println(e.getMessage());
            this.formacionPreferida = null;
        }

    }


    /**
     * El entrenador comienza el entrenamiento
     */
    @Override
    public void entrenar() {
        System.out.println(nombre + " esta entrenando a su equipo " + equipo);
    }

    /**
     * Empieza a dirigir el partido de su equipo
     * @param rival el rival contra el que juega
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("El equipo de " + nombre + " (" + equipo + ") va a jugar contra " + rival);
    }

    /**
     * El entrenador se concentra
     */
    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + nombre +  " está muy concentrado en el próximo partido");
    }

    /**
     * Método para viajar con su equipo
     * @param ciudad ciudad a la que van
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre + " va a viajar con su equipo a " + ciudad);
    }

    /**
     * Celebra el golazo de su equipo
     */
    @Override
    public void celebrarGol() {
        System.out.println("EL ENTRENADOR " + nombre.toUpperCase() + " CELEBRA EL GOLAZO DE SU EQUIPO");
    }

    /**
     * toString base
     * @return devuelve los atributos del entrenador
     */
    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
