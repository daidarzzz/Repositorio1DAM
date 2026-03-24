package org.example.TEMA7.PruebaPractico;

import java.util.Objects;
import java.util.Stack;

public class Estudiante implements Comparable<Estudiante>{

    private String apellidos;
    private String nombre;
    private String curso;
    private int edad;

    public Estudiante(String apellidos, String nombre, String curso, int edad) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(apellidos, that.apellidos) && Objects.equals(nombre, that.nombre) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, nombre, curso);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", edad=" + edad +
                '}';
    }


    @Override
    public int compareTo(Estudiante otro) {
        int comparar = curso.compareTo(otro.getCurso());
        if (comparar != 0) {
            return comparar;
        }

        return apellidos.compareTo(otro.getApellidos());

    }
}
