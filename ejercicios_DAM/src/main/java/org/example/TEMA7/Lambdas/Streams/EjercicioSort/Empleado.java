package org.example.TEMA7.Lambdas.Streams.EjercicioSort;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {

    String nombre;
    Double salario;
    LocalDate fecha;

    public Empleado(String nombre, Double salario, LocalDate fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(salario, empleado.salario) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(fecha, empleado.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, salario, fecha);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fecha=" + fecha +
                '}';
    }
}
