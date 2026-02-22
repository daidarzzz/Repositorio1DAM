package org.example.TEMA6.Excepciones.Cajero;

public class LimiteDiarioException extends RuntimeException {
  public LimiteDiarioException(String message) {
    super(message);
  }
}
