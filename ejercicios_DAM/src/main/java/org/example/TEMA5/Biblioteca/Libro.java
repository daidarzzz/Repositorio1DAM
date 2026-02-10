package org.example.TEMA5.Biblioteca;

public class Libro {

    private static final String NOMBRE_ID = "LIB";

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;



    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;


    public Libro (String titulo, String autor, Editorial editorial) {

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        id = calcularId();
        estudiantePrestado = null;
        editorial.insertarLibro(this);
        librosDisponibles++;

    }

    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    private String calcularId() {
        return NOMBRE_ID + (++cantidadLibros);
    }

    public Prestamo prestar(Estudiante estudiante) {


        Prestamo prestamo = null;

        if (disponible && !estudiante.getListaLibros().contains(this)) {
            disponible = false;
            System.out.println("El libro '" + titulo + "'ha sido prestado con éxito a " + estudiante.getNombre() + " de " + estudiante.getCurso());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.insertarLibro(this);
            prestamo = new Prestamo(this, estudiante);
            System.out.println("Préstamo realizado con éxito.");
        }
        else if (estudiante.getListaLibros().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene ese libro prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }

        return prestamo;


    }

    public void devolver() {
        if (disponible) {
            System.out.println("No se puede devolver el libro, no ha sido prestado.");
        } else {
            disponible = true;
            System.out.println("El libro '" + titulo + "'ha sido devuelto con éxito por " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
            librosDisponibles++;
            estudiantePrestado.borrarLibro(this);
            estudiantePrestado = null;
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

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", estudiantePrestado=" + estudiantePrestado +
                //", editorial=" + editorial.getNombre() +
                '}';
    }




}
