package org.example.TEMA7.ReservaPistas;

import java.util.Objects;

public class Usuario {

    private static int contadorUsuarios = 1;

    private String nombre;
    private int id;

    public Usuario(String nombre) {
        this.nombre = nombre;
        setId();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = contadorUsuarios++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
