package org.example.TEMA6.Practica2;

public class Acompanyante extends BarcelonaFC{

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }


    public void animarEquipo() {
        System.out.println("¡¡¡ANIMANDO AL EQUIPO DE " + integrante.nombre + "!!!");
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Acompanyante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + nombre + " se está concentrando para apoyar a su integrante");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + nombre + " va a viajar");
    }

    @Override
    public void celebrarGol() {
        System.out.println("EL ACOMPAÑANTE " + nombre.toUpperCase() + " CELEBRA EL GOLAAAZOOOOO");
    }
}
