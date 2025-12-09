package org.example.TEMA4.BateriaDeEjercicios;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    void test1() {

        String entradaSimulada = "2";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        assertEquals(8, Ejercicio1.cubo());

        String salidaEsperada = "Introduce un número...";

        assertTrue(salida.toString().contains(salidaEsperada));

//        assertAll(
//                () -> assertEquals(8,Ejercicio1.cubo()),
//                () -> assertEquals(26,Ejercicio1.cubo())
//        );

    }

    @Test
    void test2() {
        assertFalse(Ejercicio1.par(3));
        assertFalse(Ejercicio1.par(7));
    }
}