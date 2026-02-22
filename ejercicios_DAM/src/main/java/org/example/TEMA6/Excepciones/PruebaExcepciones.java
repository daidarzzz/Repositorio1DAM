package org.example.TEMA6.Excepciones;

import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    static void main(String[] args) throws DataFormatException {

        int edad = 15;

        if (edad <= 18) {

            throw new EdadValida();


        }


    }
}
