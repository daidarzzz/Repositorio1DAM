package org.example.TEMA7.Colecciones.OBJETOS.EJERCICIO2;

public class Espectador {

    private int edad;

    public Espectador(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "edad=" + edad +
                '}';
    }
}
