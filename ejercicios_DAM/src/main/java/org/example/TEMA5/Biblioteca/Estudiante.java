package org.example.TEMA5.Biblioteca;

import java.util.ArrayList;

public class Estudiante {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contadorEstudiantes = 0;


    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> listalibros;

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        setNia();
        listalibros = new ArrayList<>();
    }

    public Estudiante(String nombre) {
        this(nombre, "", "");
    }

    public void insertarLibro (Libro libro) {
        listalibros.add(libro);
    }

    public void borrarLibro (Libro libro) {
        listalibros.remove(libro);
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email) {

        if (email.matches(CORREO_FORMAT)) {
            return true;
        } else {
            return false;
        }

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNia() {
        return nia;
    }

    private void setNia() {
        nia = ++contadorEstudiantes;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getListaLibros() {
        return listalibros;
    }

    public void setListaLibros(ArrayList<Libro> listalibros) {
        this.listalibros = listalibros;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                //", libros=" + listalibros +
                '}';
    }

}
