package org.example.TEMA6.Practica2;

public class Masajista extends BarcelonaFC {

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }


    public void darMasaje(Jugador jugador) {
        System.out.println("Dándole un masaje a " + jugador.nombre);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "anosExperiencia=" + anosExperiencia +
                ", titulacion='" + titulacion + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + nombre + " está muy concentrado en el masaje");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + nombre + " va a viajar con el equipo a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("EL MASAJISTA " +nombre.toUpperCase() + " CELEBRA EL GOLAZO DE SU EQUIPOOO");
    }
}
