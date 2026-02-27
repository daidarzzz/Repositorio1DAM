package org.example.TEMA6.Practica2;

/**
 * Excepción que salta cuando eliges un dorsal que ya estaba asignado a otro jugador
 * de la misma categoría
 */
public class DorsalExistente extends RuntimeException {
    public DorsalExistente(String message) {
        super(message);
    }
}
