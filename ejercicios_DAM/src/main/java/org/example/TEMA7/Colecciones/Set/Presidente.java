package org.example.TEMA7.Colecciones.Set;

import java.util.Objects;

public class Presidente {

    private String nombre;
    private String pais;

    public Presidente(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Presidente that = (Presidente) o;
        return Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
        //return Objects.hash(pais);
    }

    @Override
    public String toString() {
        return "Presidente{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
