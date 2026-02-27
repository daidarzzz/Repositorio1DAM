package org.example.TEMA6.Practica2;

/**
 * Excepción que salta en caso de que el formato de la formación del entrenador sea incorrecta
 */
public class FormatoIncorrecto extends RuntimeException {
    public FormatoIncorrecto(String message) {
        super(message);
    }
}
