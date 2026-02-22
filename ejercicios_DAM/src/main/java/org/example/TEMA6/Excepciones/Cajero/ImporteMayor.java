package org.example.TEMA6.Excepciones.Cajero;

public class ImporteMayor extends RuntimeException {
    public ImporteMayor() {
        super("El importe debe de ser mayor que 0");
    }
}
