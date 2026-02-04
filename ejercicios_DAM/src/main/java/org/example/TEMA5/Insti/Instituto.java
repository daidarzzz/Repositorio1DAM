package org.example.TEMA5.Insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;
//
@Getter @ToString

//@Data
public class Instituto {
    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @NonNull
    private ArrayList<Curso> listaCursos;
    @NonNull
    private ArrayList<Estudiante> listaEstudiantes;

    public Instituto() {
        setNombre(null);
        listaCursos = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();
    }

    public Instituto(String nombre) {
        listaCursos = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();
        setNombre(nombre);
        this.poblacion = poblacion;

    }



    public void setNombre(String nombre) {
        //this.nombre = "IES COMODIN";
        //nombre = Objects.requireNonNull(nombre, "El nombre no puede ser nulo");
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    public void agregarCurso(Curso curso) {
        if (!listaCursos.contains(curso)) {
            listaCursos.add(curso);
        } else {
            System.out.println("No puedes añadir un curso que ya había.");
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!listaEstudiantes.contains(estudiante)) {
            listaEstudiantes.add(estudiante);
        } else {
            System.out.println("No puedes añadir un estudiante que ya había.");
        }
    }

}
