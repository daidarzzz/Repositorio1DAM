package org.example.TEMA6.Excepciones;

public class EdadValida extends RuntimeException {

    public EdadValida() {
        super("Edad no permitida.");
    }

}
