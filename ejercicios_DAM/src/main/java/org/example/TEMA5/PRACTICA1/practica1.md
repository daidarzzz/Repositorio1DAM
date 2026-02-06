# Práctica 1. Práctica del Formiguero y La Rebelión


## ÍNDICE 
1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
3. [Programa principal](#3-programa-principal)
4. [Pruebas](#4-pruebas)
5. [Entrega](#5-entrega)

### 1. Intro
> En esta práctica deberemos de realizar varias clases para poder usar una App (AppProgramas) en la que gestionaremos cadenas, programas, empleados, invitados…
Cada uno de los mencionados anteriormente es una clase:
•	Cadena es la cadena de televisión que contiene programas
•	Programa es la clase donde creas objetos Programa, cada programa pertenece a una cadena, y en el futuro, puede cambiar de cadena. Cada programa tiene sus invitados y empleados, estos son dependientes del programa, por lo que, si el programa desaparece, los otros también lo harán. Empleado e invitado se crean dentro de la clase Programa a partir de unos métodos.
•	Empleado es una clase usada para crear un empleado de un programa, tiene una ID generada por un método, nombre, cargo (que debe ser un cargo contemplado o pte) y director, que será siempre el director del programa al que pertenece.
•	Invitado es una clase que corresponde al invitado de un programa, un invitado tiene nombre, profesión, fecha de visita (que se asignará mediante un método), y temporada en la que aparece.


### 2. Estructura de clases
#### Diagrama de clases UML
![](./img/clippy.gif)
#### Código de PlantUML

````
@startuml
package org.example.TEMA5.Biblioteca {

    class Editorial {
        - String nombre
        - String pais
        - ArrayList<Libro> listaLibros
        + Editorial(nombre:String, pais:String)
        + Editorial()
        + insertarLibro(libro:Libro)
        + borrarLibro(libro:Libro)
        + getNombre():String
        + setNombre(nombre:String)
        + getPais():String
        + setPais(pais:String)
        + toString():String
    }

    class Estudiante {
        - static final String CORREO_FORMAT
        - static int contadorEstudiantes
        - String nombre
        - String curso
        - int nia
        - String email
        - ArrayList<Libro> listalibros
        + Estudiante(nombre:String, curso:String, email:String)
        + Estudiante(nombre:String)
        + insertarLibro(libro:Libro)
        + borrarLibro(libro:Libro)
        + static obtenerTotalEstudiantes():int
        + static validarCorreo(email:String):boolean
        + getEmail():String
        + setEmail(email:String)
        + getNia():int
        - setNia()
        + getCurso():String
        + setCurso(curso:String)
        + getNombre():String
        + setNombre(nombre:String)
        + getListaLibros():ArrayList<Libro>
        + setListaLibros(listalibros:ArrayList<Libro>)
        + toString():String
    }

    class Libro {
        - static final String NOMBRE_ID
        - static int cantidadLibros
        - static int librosDisponibles
        - String titulo
        - String autor
        - String id
        - boolean disponible
        - Estudiante estudiantePrestado
        - Editorial editorial
        + Libro(titulo:String, autor:String, editorial:Editorial)
        + Libro(titulo:String, autor:String)
        + isDisponible():boolean
        + setDisponible(disponible:boolean)
        + getId():String
        + getAutor():String
        + setAutor(autor:String)
        + getTitulo():String
        + setTitulo(titulo:String)
        + getEditorial():Editorial
        + setEditorial(editorial:Editorial)
        - calcularId():String
        + prestar(estudiante:Estudiante):Prestamo
        + devolver()
        + estaDisponible():boolean
        + static getTotalLibros():int
        + static getLibrosDisponibles():int
        + getEstudiantePrestado():Estudiante
        + toString():String
    }

    class Prestamo {
        - Libro libro
        - Estudiante estudiante
        - LocalDateTime fecha
        + Prestamo(libro:Libro, estudiante:Estudiante)
        + getLibro():Libro
        + setLibro(libro:Libro)
        + getEstudiante():Estudiante
        + setEstudiante(estudiante:Estudiante)
        + getFecha():LocalDateTime
        + setFecha(fecha:LocalDateTime)
        + toString():String
    }

    ' Relaciones
    Editorial "1" -- "*" Libro : publica
    Estudiante "1" -- "*" Libro : tiene
    Libro "1" -- "0..1" Estudiante : prestado a
    Libro "1" -- "1" Editorial : pertenece a
    Prestamo "1" -- "1" Libro
    Prestamo "1" -- "1" Estudiante

}
@enduml

````


#### Contenido de las clases (java)

  - Clase **cadena.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/75364e5263c0f6cfb921269f7932471facedaa81/ejercicios_DAM/src/main/java/org/example/TEMA5/PRACTICA1/Cadena.java)

````
package org.example.TEMA5.PRACTICA1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena (String nombre) {

        this.nombre = nombre;
        listaProgramas = new ArrayList<>();

    }

    public void añadirPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}
````

### 3. Programa Principal

### 4. Pruebas

### 5. Entrega
- [X] Código fuente en GitHub: [link](../practica1/)
- [X] Documentación
- [X] Pruebas
