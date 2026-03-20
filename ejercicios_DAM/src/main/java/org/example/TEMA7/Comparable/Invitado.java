package org.example.TEMA7.Comparable;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Invitado implements Comparable<Invitado>{

    private LocalTime hora;
    private Integer edad;
    private String nombre;

    public Invitado(int edad, String nombre) {
        this.hora = LocalTime.now();
        this.edad = edad;
        this.nombre = nombre;
    }


    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
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
        return "Invitado{" +
                "hora=" + hora +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Invitado invitado) {
        int comparar = edad.compareTo(invitado.getEdad());
        if (comparar != 0) {
            return comparar;
        }

        comparar = nombre.compareTo(invitado.getNombre());

        if (comparar != 0) {
            return comparar;
        }

        return hora.compareTo(invitado.getHora());
    }
}
