package org.example.TEMA7.PruebaPractico;

import java.util.*;

public class Excursion {
    static Scanner read = new Scanner(System.in);

    private String nombre_actividad;
    private String localidad;
    private double precio;
    private TreeSet<String> profesores;
    private TreeSet<Estudiante> listaAsistentes;

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
        profesores = new TreeSet<>();
        listaAsistentes = new TreeSet<>();
    }

    public void insertarProfesor() {
        System.out.println("Introduce el nombre del profesor/a para la exucrsión en Benidorm");
        String nombre = read.nextLine();

        profesores.add(nombre);

        System.out.println("Profesor añadido correctamente a la excursión Terra Mítica");
    }

    public void inscribirAsistente() {
        System.out.println("Creando estudiante...");
        System.out.println("Inserta los apellidos:");
        String apellidos = read.nextLine();
        System.out.println("Inserta el nombre:");
        String nombre = read.nextLine();
        System.out.println("Inserta el curso:");
        String curso = read.nextLine();
        System.out.println("Inserta su edad:");
        int edad = read.nextInt();

        read.nextLine();
        Estudiante estudiante = new Estudiante(apellidos, nombre, curso, edad);
        if (listaAsistentes.contains(estudiante)) System.out.println("El estudiante ya existe en la lista de asistentes a la actividad Terra Mítica");
        else System.out.println("Añadido correctamente el estudiante " + estudiante.getNombre() + " " + estudiante.getApellidos() + " del curso " + estudiante.getCurso());
        listaAsistentes.add(estudiante);

    }

    public double calcularImporteIngreso() {

        return 0;
    }

    public void verAsistentes() {
        System.out.println("Lista de inscritos para la actividad Terra Mítica");
        int contador = 1;
        for (Estudiante estudiante : listaAsistentes) {
            System.out.println("[" + contador + "]. " + estudiante.getCurso() + " - " + estudiante.getApellidos() + ", " + estudiante.getNombre() + "(" + estudiante.getEdad() + " años)." );
            contador++;
        }

    }

    public void eliminarAsistentesPorEdad(int edad) {
        Iterator<Estudiante> it = listaAsistentes.iterator();

        while (it.hasNext()) {
            Estudiante actual = it.next();

            if (actual.getEdad() < edad) it.remove();
        }

    }

    public TreeSet<Estudiante> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(TreeSet<Estudiante> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    public TreeSet<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(TreeSet<String> profesores) {
        this.profesores = profesores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "nombre_actividad='" + nombre_actividad + '\'' +
                ", localidad='" + localidad + '\'' +
                ", precio=" + precio +
                ", profesores=" + profesores +
                ", listaAsistentes=" + listaAsistentes +
                '}';
    }
}
