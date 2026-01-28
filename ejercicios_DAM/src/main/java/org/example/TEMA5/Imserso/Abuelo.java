package org.example.TEMA5.Imserso;

public class Abuelo {

    private String nombre;
    private int edad;

    public Abuelo (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Abuelo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
