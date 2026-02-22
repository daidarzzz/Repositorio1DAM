package org.example.TEMA6.Excepciones.Cajero;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException(String message) {
        super(message);
    }
}
