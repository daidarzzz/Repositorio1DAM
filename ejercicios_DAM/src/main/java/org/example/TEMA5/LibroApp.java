package org.example.TEMA5;

public class LibroApp {

    static void main(String[] args) {

        Libro prueba = new Libro("Joaquin", "Jacobo");

        Libro crepusculo = new Libro("Crepusculo", "Iris");

        System.out.println("Total de libros creados: " + Libro.getTotalLibros());
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
//        prueba.prestar();
//        prueba.prestar();
        System.out.println("Libros disponibles después del préstamo: " + Libro.getLibrosDisponibles());
        prueba.devolver();
        prueba.devolver();
        System.out.println("Libros disponibles después de la devolución: " + Libro.getLibrosDisponibles());


        System.out.println(
        );
        System.out.println(prueba.toString());
        System.out.println();
        System.out.println(crepusculo.toString());

    }

}
