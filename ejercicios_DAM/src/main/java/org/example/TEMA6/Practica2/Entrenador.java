package org.example.TEMA6.Practica2;

import java.sql.SQLOutput;

public class Entrenador extends BarcelonaFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, String equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = Equipos.valueOf(equipo.toUpperCase());
        setFormacionPreferida(formacionPreferida);
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + nombre + " está planficando el próximo entrenamiento de su equipo (" + equipo + ")");
    }

    public void hacerCambios() {
        System.out.println("El entrenador " + nombre + " va a realizar cambios en su equipo (" + equipo + ")");
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

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

    @Override
    public void entrenar() {
        System.out.println(nombre + " esta entrenando a su equipo " + equipo);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.printf("El equipo de " + nombre + " (" + equipo + ") va a jugar contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + nombre +  " está muy concentrado en el próximo partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre + " va a viajar con su equipo a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("EL ENTRENADOR " + nombre.toUpperCase() + " CELEBRA EL GOLAZO DE SU EQUIPO");
    }

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
