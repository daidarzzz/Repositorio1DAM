package org.example.TEMA5.Biblioteca;

import java.time.LocalDateTime;

public class Prestamo {

    private Libro libro;
    private Estudiante estudiante;
    private LocalDateTime fecha;

    public Prestamo(Libro libro, Estudiante estudiante) {

        fecha = LocalDateTime.now();
        this.libro = libro;
        this.estudiante = estudiante;

    }


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", estudiante=" + estudiante +
                ", fecha=" + fecha +
                '}';
    }

}
