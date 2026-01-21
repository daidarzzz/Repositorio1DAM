package org.example.TEMA5;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;


    public Libro (String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        calcularId();

        librosDisponibles++;

    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void calcularId() {
        id = "LIB" + (++cantidadLibros);
    }

    public void prestar() {

        if (!disponible) {
            System.out.println("El libro no se puede prestar porque no está disponible.");
        } else {
            disponible = false;
            System.out.println("El libro '" + titulo + "'ha sido prestado con éxito.");
            librosDisponibles--;
        }

    }

    public void devolver() {

        if (disponible) {
            System.out.println("No se puede devolver el libro, no ha sido prestado.");
        } else {
            disponible = true;
            System.out.println("El libro '" + titulo + "'ha sido devuelto con éxito.");
            librosDisponibles++;
        }
    }

    public boolean estaDisponible() {

        return disponible;

    }

    public static int getTotalLibros() {

        return cantidadLibros;

    }

    public static int getLibrosDisponibles() {

        return librosDisponibles;

    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nID: " + id + "\nDisponible: " + estaDisponible();
    }

}
