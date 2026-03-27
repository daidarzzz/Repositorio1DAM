package org.example.TEMA7.Lambdas.Ej2;
@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}